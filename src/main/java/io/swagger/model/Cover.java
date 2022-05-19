package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cover
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class Cover   {
  @JsonProperty("ManufacturerGuaranteeLabourMonths")
  private String manufacturerGuaranteeLabourMonths = null;

  @JsonProperty("ManufacturerGuaranteePartsMonths")
  private String manufacturerGuaranteePartsMonths = null;

  @JsonProperty("ThirdPartyGuaranteeLabourMonths")
  private String thirdPartyGuaranteeLabourMonths = null;

  @JsonProperty("ThirdPartyGuaranteePartsMonths")
  private String thirdPartyGuaranteePartsMonths = null;

  public Cover manufacturerGuaranteeLabourMonths(String manufacturerGuaranteeLabourMonths) {
    this.manufacturerGuaranteeLabourMonths = manufacturerGuaranteeLabourMonths;
    return this;
  }

  /**
   * Get manufacturerGuaranteeLabourMonths
   * @return manufacturerGuaranteeLabourMonths
   **/
  @Schema(description = "")
  
    public String getManufacturerGuaranteeLabourMonths() {
    return manufacturerGuaranteeLabourMonths;
  }

  public void setManufacturerGuaranteeLabourMonths(String manufacturerGuaranteeLabourMonths) {
    this.manufacturerGuaranteeLabourMonths = manufacturerGuaranteeLabourMonths;
  }

  public Cover manufacturerGuaranteePartsMonths(String manufacturerGuaranteePartsMonths) {
    this.manufacturerGuaranteePartsMonths = manufacturerGuaranteePartsMonths;
    return this;
  }

  /**
   * Get manufacturerGuaranteePartsMonths
   * @return manufacturerGuaranteePartsMonths
   **/
  @Schema(description = "")
  
    public String getManufacturerGuaranteePartsMonths() {
    return manufacturerGuaranteePartsMonths;
  }

  public void setManufacturerGuaranteePartsMonths(String manufacturerGuaranteePartsMonths) {
    this.manufacturerGuaranteePartsMonths = manufacturerGuaranteePartsMonths;
  }

  public Cover thirdPartyGuaranteeLabourMonths(String thirdPartyGuaranteeLabourMonths) {
    this.thirdPartyGuaranteeLabourMonths = thirdPartyGuaranteeLabourMonths;
    return this;
  }

  /**
   * Get thirdPartyGuaranteeLabourMonths
   * @return thirdPartyGuaranteeLabourMonths
   **/
  @Schema(description = "")
  
    public String getThirdPartyGuaranteeLabourMonths() {
    return thirdPartyGuaranteeLabourMonths;
  }

  public void setThirdPartyGuaranteeLabourMonths(String thirdPartyGuaranteeLabourMonths) {
    this.thirdPartyGuaranteeLabourMonths = thirdPartyGuaranteeLabourMonths;
  }

  public Cover thirdPartyGuaranteePartsMonths(String thirdPartyGuaranteePartsMonths) {
    this.thirdPartyGuaranteePartsMonths = thirdPartyGuaranteePartsMonths;
    return this;
  }

  /**
   * Get thirdPartyGuaranteePartsMonths
   * @return thirdPartyGuaranteePartsMonths
   **/
  @Schema(description = "")
  
    public String getThirdPartyGuaranteePartsMonths() {
    return thirdPartyGuaranteePartsMonths;
  }

  public void setThirdPartyGuaranteePartsMonths(String thirdPartyGuaranteePartsMonths) {
    this.thirdPartyGuaranteePartsMonths = thirdPartyGuaranteePartsMonths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cover cover = (Cover) o;
    return Objects.equals(this.manufacturerGuaranteeLabourMonths, cover.manufacturerGuaranteeLabourMonths) &&
        Objects.equals(this.manufacturerGuaranteePartsMonths, cover.manufacturerGuaranteePartsMonths) &&
        Objects.equals(this.thirdPartyGuaranteeLabourMonths, cover.thirdPartyGuaranteeLabourMonths) &&
        Objects.equals(this.thirdPartyGuaranteePartsMonths, cover.thirdPartyGuaranteePartsMonths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturerGuaranteeLabourMonths, manufacturerGuaranteePartsMonths, thirdPartyGuaranteeLabourMonths, thirdPartyGuaranteePartsMonths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cover {\n");
    
    sb.append("    manufacturerGuaranteeLabourMonths: ").append(toIndentedString(manufacturerGuaranteeLabourMonths)).append("\n");
    sb.append("    manufacturerGuaranteePartsMonths: ").append(toIndentedString(manufacturerGuaranteePartsMonths)).append("\n");
    sb.append("    thirdPartyGuaranteeLabourMonths: ").append(toIndentedString(thirdPartyGuaranteeLabourMonths)).append("\n");
    sb.append("    thirdPartyGuaranteePartsMonths: ").append(toIndentedString(thirdPartyGuaranteePartsMonths)).append("\n");
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
