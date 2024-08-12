/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.stocks_laboratory.twelvedata.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.stocks_laboratory.twelvedata.model.ResponseDataEntryItem;
import java.util.ArrayList;
import java.util.List;
/**
 * RootResponse
 */

public class RootResponse {
  @JsonProperty("data")
  private List<ResponseDataEntryItem> data = new ArrayList<>();

  @JsonProperty("status")
  private String status = null;

  public RootResponse data(List<ResponseDataEntryItem> data) {
    this.data = data;
    return this;
  }

  public RootResponse addDataItem(ResponseDataEntryItem dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<ResponseDataEntryItem> getData() {
    return data;
  }

  public void setData(List<ResponseDataEntryItem> data) {
    this.data = data;
  }

  public RootResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RootResponse RootResponse = (RootResponse) o;
    return Objects.equals(this.data, RootResponse.data) &&
        Objects.equals(this.status, RootResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
