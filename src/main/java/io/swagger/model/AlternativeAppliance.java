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
 * AlternativeAppliance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class AlternativeAppliance   {
  @JsonProperty("CompanyCode")
  private String companyCode = null;

  @JsonProperty("SchemeCode")
  private String schemeCode = null;

  @JsonProperty("ItemGroupCode")
  private String itemGroupCode = null;

  @JsonProperty("ItemCode")
  private LocalDate itemCode = null;

  @JsonProperty("ItemDescription")
  private String itemDescription = null;

  public AlternativeAppliance companyCode(String companyCode) {
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

  public AlternativeAppliance schemeCode(String schemeCode) {
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

  public AlternativeAppliance itemGroupCode(String itemGroupCode) {
    this.itemGroupCode = itemGroupCode;
    return this;
  }

  /**
   * Get itemGroupCode
   * @return itemGroupCode
   **/
  @Schema(description = "")
  
    public String getItemGroupCode() {
    return itemGroupCode;
  }

  public void setItemGroupCode(String itemGroupCode) {
    this.itemGroupCode = itemGroupCode;
  }

  public AlternativeAppliance itemCode(LocalDate itemCode) {
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

  public AlternativeAppliance itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

  /**
   * Get itemDescription
   * @return itemDescription
   **/
  @Schema(description = "")
  
    public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeAppliance alternativeAppliance = (AlternativeAppliance) o;
    return Objects.equals(this.companyCode, alternativeAppliance.companyCode) &&
        Objects.equals(this.schemeCode, alternativeAppliance.schemeCode) &&
        Objects.equals(this.itemGroupCode, alternativeAppliance.itemGroupCode) &&
        Objects.equals(this.itemCode, alternativeAppliance.itemCode) &&
        Objects.equals(this.itemDescription, alternativeAppliance.itemDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, schemeCode, itemGroupCode, itemCode, itemDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeAppliance {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    schemeCode: ").append(toIndentedString(schemeCode)).append("\n");
    sb.append("    itemGroupCode: ").append(toIndentedString(itemGroupCode)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
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
