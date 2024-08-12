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

package com.stocks_laboratory.twelvedata7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.stocks_laboratory.twelvedata7.model.ResponseFiftyTwoWeek;
/**
 * ResponseGOOGL
 */

public class ResponseGOOGL {
  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("mic_code")
  private String mic_code = null;

  @JsonProperty("change")
  private String change = null;

  @JsonProperty("volume")
  private String volume = null;

  @JsonProperty("datetime")
  private String datetime = null;

  @JsonProperty("high")
  private String high = null;

  @JsonProperty("fifty_two_week")
  private ResponseFiftyTwoWeek fifty_two_week = null;

  @JsonProperty("low")
  private String low = null;

  @JsonProperty("previous_close")
  private String previous_close = null;

  @JsonProperty("average_volume")
  private String average_volume = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("is_market_open")
  private Boolean is_market_open = null;

  @JsonProperty("exchange")
  private String exchange = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("close")
  private String close = null;

  @JsonProperty("percent_change")
  private String percent_change = null;

  @JsonProperty("open")
  private String open = null;

  @JsonProperty("timestamp")
  private Integer timestamp = null;

  public ResponseGOOGL symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public ResponseGOOGL mic_code(String mic_code) {
    this.mic_code = mic_code;
    return this;
  }

   /**
   * Get mic_code
   * @return mic_code
  **/
  public String getMicCode() {
    return mic_code;
  }

  public void setMicCode(String mic_code) {
    this.mic_code = mic_code;
  }

  public ResponseGOOGL change(String change) {
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  public String getChange() {
    return change;
  }

  public void setChange(String change) {
    this.change = change;
  }

  public ResponseGOOGL volume(String volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public ResponseGOOGL datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

   /**
   * Get datetime
   * @return datetime
  **/
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public ResponseGOOGL high(String high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  public String getHigh() {
    return high;
  }

  public void setHigh(String high) {
    this.high = high;
  }

  public ResponseGOOGL fifty_two_week(ResponseFiftyTwoWeek fifty_two_week) {
    this.fifty_two_week = fifty_two_week;
    return this;
  }

   /**
   * Get fifty_two_week
   * @return fifty_two_week
  **/
  public ResponseFiftyTwoWeek getFiftyTwoWeek() {
    return fifty_two_week;
  }

  public void setFiftyTwoWeek(ResponseFiftyTwoWeek fifty_two_week) {
    this.fifty_two_week = fifty_two_week;
  }

  public ResponseGOOGL low(String low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  public String getLow() {
    return low;
  }

  public void setLow(String low) {
    this.low = low;
  }

  public ResponseGOOGL previous_close(String previous_close) {
    this.previous_close = previous_close;
    return this;
  }

   /**
   * Get previous_close
   * @return previous_close
  **/
  public String getPreviousClose() {
    return previous_close;
  }

  public void setPreviousClose(String previous_close) {
    this.previous_close = previous_close;
  }

  public ResponseGOOGL average_volume(String average_volume) {
    this.average_volume = average_volume;
    return this;
  }

   /**
   * Get average_volume
   * @return average_volume
  **/
  public String getAverageVolume() {
    return average_volume;
  }

  public void setAverageVolume(String average_volume) {
    this.average_volume = average_volume;
  }

  public ResponseGOOGL name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponseGOOGL is_market_open(Boolean is_market_open) {
    this.is_market_open = is_market_open;
    return this;
  }

   /**
   * Get is_market_open
   * @return is_market_open
  **/
  public Boolean isIsMarketOpen() {
    return is_market_open;
  }

  public void setIsMarketOpen(Boolean is_market_open) {
    this.is_market_open = is_market_open;
  }

  public ResponseGOOGL exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public ResponseGOOGL currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ResponseGOOGL close(String close) {
    this.close = close;
    return this;
  }

   /**
   * Get close
   * @return close
  **/
  public String getClose() {
    return close;
  }

  public void setClose(String close) {
    this.close = close;
  }

  public ResponseGOOGL percent_change(String percent_change) {
    this.percent_change = percent_change;
    return this;
  }

   /**
   * Get percent_change
   * @return percent_change
  **/
  public String getPercentChange() {
    return percent_change;
  }

  public void setPercentChange(String percent_change) {
    this.percent_change = percent_change;
  }

  public ResponseGOOGL open(String open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  public String getOpen() {
    return open;
  }

  public void setOpen(String open) {
    this.open = open;
  }

  public ResponseGOOGL timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseGOOGL Response_GOOGL = (ResponseGOOGL) o;
    return Objects.equals(this.symbol, Response_GOOGL.symbol) &&
        Objects.equals(this.mic_code, Response_GOOGL.mic_code) &&
        Objects.equals(this.change, Response_GOOGL.change) &&
        Objects.equals(this.volume, Response_GOOGL.volume) &&
        Objects.equals(this.datetime, Response_GOOGL.datetime) &&
        Objects.equals(this.high, Response_GOOGL.high) &&
        Objects.equals(this.fifty_two_week, Response_GOOGL.fifty_two_week) &&
        Objects.equals(this.low, Response_GOOGL.low) &&
        Objects.equals(this.previous_close, Response_GOOGL.previous_close) &&
        Objects.equals(this.average_volume, Response_GOOGL.average_volume) &&
        Objects.equals(this.name, Response_GOOGL.name) &&
        Objects.equals(this.is_market_open, Response_GOOGL.is_market_open) &&
        Objects.equals(this.exchange, Response_GOOGL.exchange) &&
        Objects.equals(this.currency, Response_GOOGL.currency) &&
        Objects.equals(this.close, Response_GOOGL.close) &&
        Objects.equals(this.percent_change, Response_GOOGL.percent_change) &&
        Objects.equals(this.open, Response_GOOGL.open) &&
        Objects.equals(this.timestamp, Response_GOOGL.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, mic_code, change, volume, datetime, high, fifty_two_week, low, previous_close, average_volume, name, is_market_open, exchange, currency, close, percent_change, open, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGOOGL {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    mic_code: ").append(toIndentedString(mic_code)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    fifty_two_week: ").append(toIndentedString(fifty_two_week)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    previous_close: ").append(toIndentedString(previous_close)).append("\n");
    sb.append("    average_volume: ").append(toIndentedString(average_volume)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    is_market_open: ").append(toIndentedString(is_market_open)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    percent_change: ").append(toIndentedString(percent_change)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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