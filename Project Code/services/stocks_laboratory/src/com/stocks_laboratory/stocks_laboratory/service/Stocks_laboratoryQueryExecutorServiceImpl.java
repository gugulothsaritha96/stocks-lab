/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.stocks_laboratory.stocks_laboratory.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.data.model.QueryProcedureInput;

import com.stocks_laboratory.stocks_laboratory.models.query.*;

@Service
public class Stocks_laboratoryQueryExecutorServiceImpl implements Stocks_laboratoryQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Stocks_laboratoryQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("stocks_laboratoryWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "stocks_laboratoryTransactionManager", readOnly = true)
    @Override
    public Page<CheckExitsingStockResponse> executeCheckExitsingStock(Integer userId, String stockSymbol, Pageable pageable) {
        Map<String, Object> params = new HashMap<>(2);

        params.put("user_id", userId);
        params.put("stock_symbol", stockSymbol);

        return queryExecutor.executeNamedQuery("CheckExitsingStock", params, CheckExitsingStockResponse.class, pageable);
    }

    @Transactional(value = "stocks_laboratoryTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportCheckExitsingStock(Integer userId, String stockSymbol, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(2);

        params.put("user_id", userId);
        params.put("stock_symbol", stockSymbol);

        QueryProcedureInput<CheckExitsingStockResponse> queryInput = new QueryProcedureInput<>("CheckExitsingStock", params, CheckExitsingStockResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

}