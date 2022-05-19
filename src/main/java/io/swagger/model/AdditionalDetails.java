package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class AdditionalDetails   {
  @JsonProperty("BoilerType")
  private String boilerType = null;

  @JsonProperty("ExtCovPrdFee")
  private String extCovPrdFee = null;

  @JsonProperty("PdNettFlg")
  private String pdNettFlg = null;

  @JsonProperty("CallSource")
  private Resource callSource = null;

  @JsonProperty("PeriodOfCover")
  private String periodOfCover = null;

  @JsonProperty("GoodsColour")
  private String goodsColour = null;

  @JsonProperty("CoverType")
  private String coverType = null;

  @JsonProperty("BreakdownStartDate")
  private String breakdownStartDate = null;

  public AdditionalDetails boilerType(String boilerType) {
    this.boilerType = boilerType;
    return this;
  }

  /**
   * Get boilerType
   * @return boilerType
   **/
  @Schema(description = "")
  
    public String getBoilerType() {
    return boilerType;
  }

  public void setBoilerType(String boilerType) {
    this.boilerType = boilerType;
  }

  public AdditionalDetails extCovPrdFee(String extCovPrdFee) {
    this.extCovPrdFee = extCovPrdFee;
    return this;
  }

  /**
   * Get extCovPrdFee
   * @return extCovPrdFee
   **/
  @Schema(description = "")
  
    public String getExtCovPrdFee() {
    return extCovPrdFee;
  }

  public void setExtCovPrdFee(String extCovPrdFee) {
    this.extCovPrdFee = extCovPrdFee;
  }

  public AdditionalDetails pdNettFlg(String pdNettFlg) {
    this.pdNettFlg = pdNettFlg;
    return this;
  }

  /**
   * Get pdNettFlg
   * @return pdNettFlg
   **/
  @Schema(description = "")
  
    public String getPdNettFlg() {
    return pdNettFlg;
  }

  public void setPdNettFlg(String pdNettFlg) {
    this.pdNettFlg = pdNettFlg;
  }

  public AdditionalDetails callSource(Resource callSource) {
    this.callSource = callSource;
    return this;
  }

  /**
   * Source
   * @return callSource
   **/
  @Schema(description = "Source")
  
    @Valid
    public Resource getCallSource() {
    return callSource;
  }

  public void setCallSource(Resource callSource) {
    this.callSource = callSource;
  }

  public AdditionalDetails periodOfCover(String periodOfCover) {
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

  public AdditionalDetails goodsColour(String goodsColour) {
    this.goodsColour = goodsColour;
    return this;
  }

  /**
   * Get goodsColour
   * @return goodsColour
   **/
  @Schema(description = "")
  
    public String getGoodsColour() {
    return goodsColour;
  }

  public void setGoodsColour(String goodsColour) {
    this.goodsColour = goodsColour;
  }

  public AdditionalDetails coverType(String coverType) {
    this.coverType = coverType;
    return this;
  }

  /**
   * Get coverType
   * @return coverType
   **/
  @Schema(description = "")
  
    public String getCoverType() {
    return coverType;
  }

  public void setCoverType(String coverType) {
    this.coverType = coverType;
  }

  public AdditionalDetails breakdownStartDate(String breakdownStartDate) {
    this.breakdownStartDate = breakdownStartDate;
    return this;
  }

  /**
   * Get breakdownStartDate
   * @return breakdownStartDate
   **/
  @Schema(description = "")
  
    public String getBreakdownStartDate() {
    return breakdownStartDate;
  }

  public void setBreakdownStartDate(String breakdownStartDate) {
    this.breakdownStartDate = breakdownStartDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDetails additionalDetails = (AdditionalDetails) o;
    return Objects.equals(this.boilerType, additionalDetails.boilerType) &&
        Objects.equals(this.extCovPrdFee, additionalDetails.extCovPrdFee) &&
        Objects.equals(this.pdNettFlg, additionalDetails.pdNettFlg) &&
        Objects.equals(this.callSource, additionalDetails.callSource) &&
        Objects.equals(this.periodOfCover, additionalDetails.periodOfCover) &&
        Objects.equals(this.goodsColour, additionalDetails.goodsColour) &&
        Objects.equals(this.coverType, additionalDetails.coverType) &&
        Objects.equals(this.breakdownStartDate, additionalDetails.breakdownStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boilerType, extCovPrdFee, pdNettFlg, callSource, periodOfCover, goodsColour, coverType, breakdownStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDetails {\n");
    
    sb.append("    boilerType: ").append(toIndentedString(boilerType)).append("\n");
    sb.append("    extCovPrdFee: ").append(toIndentedString(extCovPrdFee)).append("\n");
    sb.append("    pdNettFlg: ").append(toIndentedString(pdNettFlg)).append("\n");
    sb.append("    callSource: ").append(toIndentedString(callSource)).append("\n");
    sb.append("    periodOfCover: ").append(toIndentedString(periodOfCover)).append("\n");
    sb.append("    goodsColour: ").append(toIndentedString(goodsColour)).append("\n");
    sb.append("    coverType: ").append(toIndentedString(coverType)).append("\n");
    sb.append("    breakdownStartDate: ").append(toIndentedString(breakdownStartDate)).append("\n");
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
