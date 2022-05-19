package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CallSourceDetails;
import io.swagger.model.RTPOfferDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RTPRate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class RTPRate   {
  @JsonProperty("CallSourceDetails")
  private CallSourceDetails callSourceDetails = null;

  @JsonProperty("RTPOfferDetails")
  private RTPOfferDetails rtPOfferDetails = null;

  public RTPRate callSourceDetails(CallSourceDetails callSourceDetails) {
    this.callSourceDetails = callSourceDetails;
    return this;
  }

  /**
   * Get callSourceDetails
   * @return callSourceDetails
   **/
  @Schema(description = "")
  
    @Valid
    public CallSourceDetails getCallSourceDetails() {
    return callSourceDetails;
  }

  public void setCallSourceDetails(CallSourceDetails callSourceDetails) {
    this.callSourceDetails = callSourceDetails;
  }

  public RTPRate rtPOfferDetails(RTPOfferDetails rtPOfferDetails) {
    this.rtPOfferDetails = rtPOfferDetails;
    return this;
  }

  /**
   * Get rtPOfferDetails
   * @return rtPOfferDetails
   **/
  @Schema(description = "")
  
    @Valid
    public RTPOfferDetails getRtPOfferDetails() {
    return rtPOfferDetails;
  }

  public void setRtPOfferDetails(RTPOfferDetails rtPOfferDetails) {
    this.rtPOfferDetails = rtPOfferDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPRate rtPRate = (RTPRate) o;
    return Objects.equals(this.callSourceDetails, rtPRate.callSourceDetails) &&
        Objects.equals(this.rtPOfferDetails, rtPRate.rtPOfferDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSourceDetails, rtPOfferDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPRate {\n");
    
    sb.append("    callSourceDetails: ").append(toIndentedString(callSourceDetails)).append("\n");
    sb.append("    rtPOfferDetails: ").append(toIndentedString(rtPOfferDetails)).append("\n");
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
