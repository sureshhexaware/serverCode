package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class ContractType   {
  @JsonProperty("ProductCategory")
  private String productCategory = null;

  @JsonProperty("ProductCategoryDesc")
  private String productCategoryDesc = null;

  @JsonProperty("ProductType")
  private String productType = null;

  @JsonProperty("ProductTypeDesc")
  private String productTypeDesc = null;

  @JsonProperty("ProductVariance")
  private String productVariance = null;

  @JsonProperty("ProductVarianceDesc")
  private String productVarianceDesc = null;

  @JsonProperty("PaymentTerm")
  private String paymentTerm = null;

  @JsonProperty("PaymentTermDesc")
  private String paymentTermDesc = null;

  @JsonProperty("ContractTypeCode")
  private String contractTypeCode = null;

  @JsonProperty("ContractTypeDesc")
  private String contractTypeDesc = null;

  @JsonProperty("ProductDescription")
  private String productDescription = null;

  public ContractType productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
   **/
  @Schema(description = "")
  
    public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  public ContractType productCategoryDesc(String productCategoryDesc) {
    this.productCategoryDesc = productCategoryDesc;
    return this;
  }

  /**
   * Get productCategoryDesc
   * @return productCategoryDesc
   **/
  @Schema(description = "")
  
    public String getProductCategoryDesc() {
    return productCategoryDesc;
  }

  public void setProductCategoryDesc(String productCategoryDesc) {
    this.productCategoryDesc = productCategoryDesc;
  }

  public ContractType productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
   **/
  @Schema(description = "")
  
    public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ContractType productTypeDesc(String productTypeDesc) {
    this.productTypeDesc = productTypeDesc;
    return this;
  }

  /**
   * Get productTypeDesc
   * @return productTypeDesc
   **/
  @Schema(description = "")
  
    public String getProductTypeDesc() {
    return productTypeDesc;
  }

  public void setProductTypeDesc(String productTypeDesc) {
    this.productTypeDesc = productTypeDesc;
  }

  public ContractType productVariance(String productVariance) {
    this.productVariance = productVariance;
    return this;
  }

  /**
   * Get productVariance
   * @return productVariance
   **/
  @Schema(description = "")
  
    public String getProductVariance() {
    return productVariance;
  }

  public void setProductVariance(String productVariance) {
    this.productVariance = productVariance;
  }

  public ContractType productVarianceDesc(String productVarianceDesc) {
    this.productVarianceDesc = productVarianceDesc;
    return this;
  }

  /**
   * Get productVarianceDesc
   * @return productVarianceDesc
   **/
  @Schema(description = "")
  
    public String getProductVarianceDesc() {
    return productVarianceDesc;
  }

  public void setProductVarianceDesc(String productVarianceDesc) {
    this.productVarianceDesc = productVarianceDesc;
  }

  public ContractType paymentTerm(String paymentTerm) {
    this.paymentTerm = paymentTerm;
    return this;
  }

  /**
   * Get paymentTerm
   * @return paymentTerm
   **/
  @Schema(description = "")
  
    public String getPaymentTerm() {
    return paymentTerm;
  }

  public void setPaymentTerm(String paymentTerm) {
    this.paymentTerm = paymentTerm;
  }

  public ContractType paymentTermDesc(String paymentTermDesc) {
    this.paymentTermDesc = paymentTermDesc;
    return this;
  }

  /**
   * Get paymentTermDesc
   * @return paymentTermDesc
   **/
  @Schema(description = "")
  
    public String getPaymentTermDesc() {
    return paymentTermDesc;
  }

  public void setPaymentTermDesc(String paymentTermDesc) {
    this.paymentTermDesc = paymentTermDesc;
  }

  public ContractType contractTypeCode(String contractTypeCode) {
    this.contractTypeCode = contractTypeCode;
    return this;
  }

  /**
   * Get contractTypeCode
   * @return contractTypeCode
   **/
  @Schema(description = "")
  
    public String getContractTypeCode() {
    return contractTypeCode;
  }

  public void setContractTypeCode(String contractTypeCode) {
    this.contractTypeCode = contractTypeCode;
  }

  public ContractType contractTypeDesc(String contractTypeDesc) {
    this.contractTypeDesc = contractTypeDesc;
    return this;
  }

  /**
   * Get contractTypeDesc
   * @return contractTypeDesc
   **/
  @Schema(description = "")
  
    public String getContractTypeDesc() {
    return contractTypeDesc;
  }

  public void setContractTypeDesc(String contractTypeDesc) {
    this.contractTypeDesc = contractTypeDesc;
  }

  public ContractType productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Get productDescription
   * @return productDescription
   **/
  @Schema(description = "")
  
    public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractType contractType = (ContractType) o;
    return Objects.equals(this.productCategory, contractType.productCategory) &&
        Objects.equals(this.productCategoryDesc, contractType.productCategoryDesc) &&
        Objects.equals(this.productType, contractType.productType) &&
        Objects.equals(this.productTypeDesc, contractType.productTypeDesc) &&
        Objects.equals(this.productVariance, contractType.productVariance) &&
        Objects.equals(this.productVarianceDesc, contractType.productVarianceDesc) &&
        Objects.equals(this.paymentTerm, contractType.paymentTerm) &&
        Objects.equals(this.paymentTermDesc, contractType.paymentTermDesc) &&
        Objects.equals(this.contractTypeCode, contractType.contractTypeCode) &&
        Objects.equals(this.contractTypeDesc, contractType.contractTypeDesc) &&
        Objects.equals(this.productDescription, contractType.productDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCategory, productCategoryDesc, productType, productTypeDesc, productVariance, productVarianceDesc, paymentTerm, paymentTermDesc, contractTypeCode, contractTypeDesc, productDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractType {\n");
    
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productCategoryDesc: ").append(toIndentedString(productCategoryDesc)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productTypeDesc: ").append(toIndentedString(productTypeDesc)).append("\n");
    sb.append("    productVariance: ").append(toIndentedString(productVariance)).append("\n");
    sb.append("    productVarianceDesc: ").append(toIndentedString(productVarianceDesc)).append("\n");
    sb.append("    paymentTerm: ").append(toIndentedString(paymentTerm)).append("\n");
    sb.append("    paymentTermDesc: ").append(toIndentedString(paymentTermDesc)).append("\n");
    sb.append("    contractTypeCode: ").append(toIndentedString(contractTypeCode)).append("\n");
    sb.append("    contractTypeDesc: ").append(toIndentedString(contractTypeDesc)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
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
