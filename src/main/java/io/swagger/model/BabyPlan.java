package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BabyPlan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class BabyPlan   {
  @JsonProperty("CompanyCode")
  private String companyCode = null;

  @JsonProperty("SchemeCode")
  private String schemeCode = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("ItemCode")
  private LocalDate itemCode = null;

  @JsonProperty("ModelNumber1")
  private String modelNumber1 = null;

  @JsonProperty("ModelNumber2")
  private String modelNumber2 = null;

  @JsonProperty("ErrorMessage")
  private String errorMessage = null;

  public BabyPlan companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

  /**
   * Get companyCode
   * @return companyCode
   **/
  @Schema(description = "")
  
    public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public BabyPlan schemeCode(String schemeCode) {
    this.schemeCode = schemeCode;
    return this;
  }

  /**
   * Get schemeCode
   * @return schemeCode
   **/
  @Schema(description = "")
  
    public String getSchemeCode() {
    return schemeCode;
  }

  public void setSchemeCode(String schemeCode) {
    this.schemeCode = schemeCode;
  }

  public BabyPlan reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
   **/
  @Schema(description = "")
  
    public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public BabyPlan itemCode(LocalDate itemCode) {
    this.itemCode = itemCode;
    return this;
  }

  /**
   * Unique ID of Item
   * @return itemCode
   **/
  @Schema(description = "Unique ID of Item")
  
    @Valid
    public LocalDate getItemCode() {
    return itemCode;
  }

  public void setItemCode(LocalDate itemCode) {
    this.itemCode = itemCode;
  }

  public BabyPlan modelNumber1(String modelNumber1) {
    this.modelNumber1 = modelNumber1;
    return this;
  }

  /**
   * Get modelNumber1
   * @return modelNumber1
   **/
  @Schema(description = "")
  
    public String getModelNumber1() {
    return modelNumber1;
  }

  public void setModelNumber1(String modelNumber1) {
    this.modelNumber1 = modelNumber1;
  }

  public BabyPlan modelNumber2(String modelNumber2) {
    this.modelNumber2 = modelNumber2;
    return this;
  }

  /**
   * Get modelNumber2
   * @return modelNumber2
   **/
  @Schema(description = "")
  
    public String getModelNumber2() {
    return modelNumber2;
  }

  public void setModelNumber2(String modelNumber2) {
    this.modelNumber2 = modelNumber2;
  }

  public BabyPlan errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   **/
  @Schema(description = "")
  
    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BabyPlan babyPlan = (BabyPlan) o;
    return Objects.equals(this.companyCode, babyPlan.companyCode) &&
        Objects.equals(this.schemeCode, babyPlan.schemeCode) &&
        Objects.equals(this.reference, babyPlan.reference) &&
        Objects.equals(this.itemCode, babyPlan.itemCode) &&
        Objects.equals(this.modelNumber1, babyPlan.modelNumber1) &&
        Objects.equals(this.modelNumber2, babyPlan.modelNumber2) &&
        Objects.equals(this.errorMessage, babyPlan.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, schemeCode, reference, itemCode, modelNumber1, modelNumber2, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BabyPlan {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    schemeCode: ").append(toIndentedString(schemeCode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    modelNumber1: ").append(toIndentedString(modelNumber1)).append("\n");
    sb.append("    modelNumber2: ").append(toIndentedString(modelNumber2)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
