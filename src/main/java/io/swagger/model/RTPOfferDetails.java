package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RTPPaymentDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RTPOfferDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class RTPOfferDetails   {
  @JsonProperty("OfferReference")
  private String offerReference = null;

  @JsonProperty("OfferKey")
  private String offerKey = null;

  @JsonProperty("OfferPricingKey")
  private String offerPricingKey = null;

  @JsonProperty("PeriodOfCover")
  private String periodOfCover = null;

  @JsonProperty("Fee")
  private String fee = null;

  @JsonProperty("WaitDays")
  private String waitDays = null;

  @JsonProperty("WicType")
  private String wicType = null;

  @JsonProperty("MultiplanType")
  private String multiplanType = null;

  @JsonProperty("MultiplanWarrantyType")
  private String multiplanWarrantyType = null;

  @JsonProperty("RTPPaymentDetails")
  private RTPPaymentDetails rtPPaymentDetails = null;

  public RTPOfferDetails offerReference(String offerReference) {
    this.offerReference = offerReference;
    return this;
  }

  /**
   * Get offerReference
   * @return offerReference
   **/
  @Schema(description = "")
  
    public String getOfferReference() {
    return offerReference;
  }

  public void setOfferReference(String offerReference) {
    this.offerReference = offerReference;
  }

  public RTPOfferDetails offerKey(String offerKey) {
    this.offerKey = offerKey;
    return this;
  }

  /**
   * Get offerKey
   * @return offerKey
   **/
  @Schema(description = "")
  
    public String getOfferKey() {
    return offerKey;
  }

  public void setOfferKey(String offerKey) {
    this.offerKey = offerKey;
  }

  public RTPOfferDetails offerPricingKey(String offerPricingKey) {
    this.offerPricingKey = offerPricingKey;
    return this;
  }

  /**
   * Get offerPricingKey
   * @return offerPricingKey
   **/
  @Schema(description = "")
  
    public String getOfferPricingKey() {
    return offerPricingKey;
  }

  public void setOfferPricingKey(String offerPricingKey) {
    this.offerPricingKey = offerPricingKey;
  }

  public RTPOfferDetails periodOfCover(String periodOfCover) {
    this.periodOfCover = periodOfCover;
    return this;
  }

  /**
   * Get periodOfCover
   * @return periodOfCover
   **/
  @Schema(description = "")
  
    public String getPeriodOfCover() {
    return periodOfCover;
  }

  public void setPeriodOfCover(String periodOfCover) {
    this.periodOfCover = periodOfCover;
  }

  public RTPOfferDetails fee(String fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
   **/
  @Schema(description = "")
  
    public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public RTPOfferDetails waitDays(String waitDays) {
    this.waitDays = waitDays;
    return this;
  }

  /**
   * Get waitDays
   * @return waitDays
   **/
  @Schema(description = "")
  
    public String getWaitDays() {
    return waitDays;
  }

  public void setWaitDays(String waitDays) {
    this.waitDays = waitDays;
  }

  public RTPOfferDetails wicType(String wicType) {
    this.wicType = wicType;
    return this;
  }

  /**
   * Get wicType
   * @return wicType
   **/
  @Schema(description = "")
  
    public String getWicType() {
    return wicType;
  }

  public void setWicType(String wicType) {
    this.wicType = wicType;
  }

  public RTPOfferDetails multiplanType(String multiplanType) {
    this.multiplanType = multiplanType;
    return this;
  }

  /**
   * Get multiplanType
   * @return multiplanType
   **/
  @Schema(description = "")
  
    public String getMultiplanType() {
    return multiplanType;
  }

  public void setMultiplanType(String multiplanType) {
    this.multiplanType = multiplanType;
  }

  public RTPOfferDetails multiplanWarrantyType(String multiplanWarrantyType) {
    this.multiplanWarrantyType = multiplanWarrantyType;
    return this;
  }

  /**
   * Get multiplanWarrantyType
   * @return multiplanWarrantyType
   **/
  @Schema(description = "")
  
    public String getMultiplanWarrantyType() {
    return multiplanWarrantyType;
  }

  public void setMultiplanWarrantyType(String multiplanWarrantyType) {
    this.multiplanWarrantyType = multiplanWarrantyType;
  }

  public RTPOfferDetails rtPPaymentDetails(RTPPaymentDetails rtPPaymentDetails) {
    this.rtPPaymentDetails = rtPPaymentDetails;
    return this;
  }

  /**
   * Get rtPPaymentDetails
   * @return rtPPaymentDetails
   **/
  @Schema(description = "")
  
    @Valid
    public RTPPaymentDetails getRtPPaymentDetails() {
    return rtPPaymentDetails;
  }

  public void setRtPPaymentDetails(RTPPaymentDetails rtPPaymentDetails) {
    this.rtPPaymentDetails = rtPPaymentDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPOfferDetails rtPOfferDetails = (RTPOfferDetails) o;
    return Objects.equals(this.offerReference, rtPOfferDetails.offerReference) &&
        Objects.equals(this.offerKey, rtPOfferDetails.offerKey) &&
        Objects.equals(this.offerPricingKey, rtPOfferDetails.offerPricingKey) &&
        Objects.equals(this.periodOfCover, rtPOfferDetails.periodOfCover) &&
        Objects.equals(this.fee, rtPOfferDetails.fee) &&
        Objects.equals(this.waitDays, rtPOfferDetails.waitDays) &&
        Objects.equals(this.wicType, rtPOfferDetails.wicType) &&
        Objects.equals(this.multiplanType, rtPOfferDetails.multiplanType) &&
        Objects.equals(this.multiplanWarrantyType, rtPOfferDetails.multiplanWarrantyType) &&
        Objects.equals(this.rtPPaymentDetails, rtPOfferDetails.rtPPaymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerReference, offerKey, offerPricingKey, periodOfCover, fee, waitDays, wicType, multiplanType, multiplanWarrantyType, rtPPaymentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPOfferDetails {\n");
    
    sb.append("    offerReference: ").append(toIndentedString(offerReference)).append("\n");
    sb.append("    offerKey: ").append(toIndentedString(offerKey)).append("\n");
    sb.append("    offerPricingKey: ").append(toIndentedString(offerPricingKey)).append("\n");
    sb.append("    periodOfCover: ").append(toIndentedString(periodOfCover)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    waitDays: ").append(toIndentedString(waitDays)).append("\n");
    sb.append("    wicType: ").append(toIndentedString(wicType)).append("\n");
    sb.append("    multiplanType: ").append(toIndentedString(multiplanType)).append("\n");
    sb.append("    multiplanWarrantyType: ").append(toIndentedString(multiplanWarrantyType)).append("\n");
    sb.append("    rtPPaymentDetails: ").append(toIndentedString(rtPPaymentDetails)).append("\n");
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
