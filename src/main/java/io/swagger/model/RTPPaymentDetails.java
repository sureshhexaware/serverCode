package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RTPRates;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RTPPaymentDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class RTPPaymentDetails   {
  @JsonProperty("PreferredPayment")
  private String preferredPayment = null;

  @JsonProperty("PaymentType")
  private String paymentType = null;

  @JsonProperty("PaymentProfile")
  private String paymentProfile = null;

  @JsonProperty("CashPaymentType")
  private String cashPaymentType = null;

  @JsonProperty("NumberOfPayments")
  private String numberOfPayments = null;

  @JsonProperty("PaymentFrequency")
  private String paymentFrequency = null;

  @JsonProperty("FirstPayment")
  private String firstPayment = null;

  @JsonProperty("SubsequentPayment")
  private String subsequentPayment = null;

  @JsonProperty("ExcessAmount")
  private String excessAmount = null;

  @JsonProperty("RTPRates")
  private RTPRates rtPRates = null;

  public RTPPaymentDetails preferredPayment(String preferredPayment) {
    this.preferredPayment = preferredPayment;
    return this;
  }

  /**
   * Get preferredPayment
   * @return preferredPayment
   **/
  @Schema(description = "")
  
    public String getPreferredPayment() {
    return preferredPayment;
  }

  public void setPreferredPayment(String preferredPayment) {
    this.preferredPayment = preferredPayment;
  }

  public RTPPaymentDetails paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
   **/
  @Schema(description = "")
  
    public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public RTPPaymentDetails paymentProfile(String paymentProfile) {
    this.paymentProfile = paymentProfile;
    return this;
  }

  /**
   * Get paymentProfile
   * @return paymentProfile
   **/
  @Schema(description = "")
  
    public String getPaymentProfile() {
    return paymentProfile;
  }

  public void setPaymentProfile(String paymentProfile) {
    this.paymentProfile = paymentProfile;
  }

  public RTPPaymentDetails cashPaymentType(String cashPaymentType) {
    this.cashPaymentType = cashPaymentType;
    return this;
  }

  /**
   * Get cashPaymentType
   * @return cashPaymentType
   **/
  @Schema(description = "")
  
    public String getCashPaymentType() {
    return cashPaymentType;
  }

  public void setCashPaymentType(String cashPaymentType) {
    this.cashPaymentType = cashPaymentType;
  }

  public RTPPaymentDetails numberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Get numberOfPayments
   * @return numberOfPayments
   **/
  @Schema(description = "")
  
    public String getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public RTPPaymentDetails paymentFrequency(String paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

  /**
   * Get paymentFrequency
   * @return paymentFrequency
   **/
  @Schema(description = "")
  
    public String getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(String paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public RTPPaymentDetails firstPayment(String firstPayment) {
    this.firstPayment = firstPayment;
    return this;
  }

  /**
   * Get firstPayment
   * @return firstPayment
   **/
  @Schema(description = "")
  
    public String getFirstPayment() {
    return firstPayment;
  }

  public void setFirstPayment(String firstPayment) {
    this.firstPayment = firstPayment;
  }

  public RTPPaymentDetails subsequentPayment(String subsequentPayment) {
    this.subsequentPayment = subsequentPayment;
    return this;
  }

  /**
   * Get subsequentPayment
   * @return subsequentPayment
   **/
  @Schema(description = "")
  
    public String getSubsequentPayment() {
    return subsequentPayment;
  }

  public void setSubsequentPayment(String subsequentPayment) {
    this.subsequentPayment = subsequentPayment;
  }

  public RTPPaymentDetails excessAmount(String excessAmount) {
    this.excessAmount = excessAmount;
    return this;
  }

  /**
   * Get excessAmount
   * @return excessAmount
   **/
  @Schema(description = "")
  
    public String getExcessAmount() {
    return excessAmount;
  }

  public void setExcessAmount(String excessAmount) {
    this.excessAmount = excessAmount;
  }

  public RTPPaymentDetails rtPRates(RTPRates rtPRates) {
    this.rtPRates = rtPRates;
    return this;
  }

  /**
   * Get rtPRates
   * @return rtPRates
   **/
  @Schema(description = "")
  
    @Valid
    public RTPRates getRtPRates() {
    return rtPRates;
  }

  public void setRtPRates(RTPRates rtPRates) {
    this.rtPRates = rtPRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPPaymentDetails rtPPaymentDetails = (RTPPaymentDetails) o;
    return Objects.equals(this.preferredPayment, rtPPaymentDetails.preferredPayment) &&
        Objects.equals(this.paymentType, rtPPaymentDetails.paymentType) &&
        Objects.equals(this.paymentProfile, rtPPaymentDetails.paymentProfile) &&
        Objects.equals(this.cashPaymentType, rtPPaymentDetails.cashPaymentType) &&
        Objects.equals(this.numberOfPayments, rtPPaymentDetails.numberOfPayments) &&
        Objects.equals(this.paymentFrequency, rtPPaymentDetails.paymentFrequency) &&
        Objects.equals(this.firstPayment, rtPPaymentDetails.firstPayment) &&
        Objects.equals(this.subsequentPayment, rtPPaymentDetails.subsequentPayment) &&
        Objects.equals(this.excessAmount, rtPPaymentDetails.excessAmount) &&
        Objects.equals(this.rtPRates, rtPPaymentDetails.rtPRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredPayment, paymentType, paymentProfile, cashPaymentType, numberOfPayments, paymentFrequency, firstPayment, subsequentPayment, excessAmount, rtPRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPPaymentDetails {\n");
    
    sb.append("    preferredPayment: ").append(toIndentedString(preferredPayment)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentProfile: ").append(toIndentedString(paymentProfile)).append("\n");
    sb.append("    cashPaymentType: ").append(toIndentedString(cashPaymentType)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    firstPayment: ").append(toIndentedString(firstPayment)).append("\n");
    sb.append("    subsequentPayment: ").append(toIndentedString(subsequentPayment)).append("\n");
    sb.append("    excessAmount: ").append(toIndentedString(excessAmount)).append("\n");
    sb.append("    rtPRates: ").append(toIndentedString(rtPRates)).append("\n");
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
