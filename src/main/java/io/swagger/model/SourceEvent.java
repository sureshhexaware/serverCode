package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SourceEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class SourceEvent   {
  @JsonProperty("BusinessEventSourceCode")
  private String businessEventSourceCode = null;

  @JsonProperty("BusinessEventCode")
  private String businessEventCode = null;

  @JsonProperty("ReceivedDate")
  private String receivedDate = null;

  @JsonProperty("ReceivedTime")
  private String receivedTime = null;

  @JsonProperty("LogonUserId")
  private String logonUserId = null;

  public SourceEvent businessEventSourceCode(String businessEventSourceCode) {
    this.businessEventSourceCode = businessEventSourceCode;
    return this;
  }

  /**
   * Get businessEventSourceCode
   * @return businessEventSourceCode
   **/
  @Schema(description = "")
  
    public String getBusinessEventSourceCode() {
    return businessEventSourceCode;
  }

  public void setBusinessEventSourceCode(String businessEventSourceCode) {
    this.businessEventSourceCode = businessEventSourceCode;
  }

  public SourceEvent businessEventCode(String businessEventCode) {
    this.businessEventCode = businessEventCode;
    return this;
  }

  /**
   * Get businessEventCode
   * @return businessEventCode
   **/
  @Schema(description = "")
  
    public String getBusinessEventCode() {
    return businessEventCode;
  }

  public void setBusinessEventCode(String businessEventCode) {
    this.businessEventCode = businessEventCode;
  }

  public SourceEvent receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

  /**
   * Get receivedDate
   * @return receivedDate
   **/
  @Schema(description = "")
  
    public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public SourceEvent receivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
    return this;
  }

  /**
   * Get receivedTime
   * @return receivedTime
   **/
  @Schema(description = "")
  
    public String getReceivedTime() {
    return receivedTime;
  }

  public void setReceivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
  }

  public SourceEvent logonUserId(String logonUserId) {
    this.logonUserId = logonUserId;
    return this;
  }

  /**
   * Get logonUserId
   * @return logonUserId
   **/
  @Schema(description = "")
  
    public String getLogonUserId() {
    return logonUserId;
  }

  public void setLogonUserId(String logonUserId) {
    this.logonUserId = logonUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceEvent sourceEvent = (SourceEvent) o;
    return Objects.equals(this.businessEventSourceCode, sourceEvent.businessEventSourceCode) &&
        Objects.equals(this.businessEventCode, sourceEvent.businessEventCode) &&
        Objects.equals(this.receivedDate, sourceEvent.receivedDate) &&
        Objects.equals(this.receivedTime, sourceEvent.receivedTime) &&
        Objects.equals(this.logonUserId, sourceEvent.logonUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessEventSourceCode, businessEventCode, receivedDate, receivedTime, logonUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceEvent {\n");
    
    sb.append("    businessEventSourceCode: ").append(toIndentedString(businessEventSourceCode)).append("\n");
    sb.append("    businessEventCode: ").append(toIndentedString(businessEventCode)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    receivedTime: ").append(toIndentedString(receivedTime)).append("\n");
    sb.append("    logonUserId: ").append(toIndentedString(logonUserId)).append("\n");
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
