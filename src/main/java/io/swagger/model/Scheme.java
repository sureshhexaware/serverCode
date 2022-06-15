package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Scheme
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class Scheme   {
  @JsonProperty("CompanyCode")
  private String companyCode = null;

  @JsonProperty("SchemeCode")
  private String schemeCode = null;

  @JsonProperty("TelRegMakerCode")
  private String telRegMakerCode = null;

  public Scheme companyCode(String companyCode) {
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

  public Scheme schemeCode(String schemeCode) {
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

  public Scheme telRegMakerCode(String telRegMakerCode) {
    this.telRegMakerCode = telRegMakerCode;
    return this;
  }

  /**
   * Get telRegMakerCode
   * @return telRegMakerCode
   **/
  @Schema(description = "")
  
    public String getTelRegMakerCode() {
    return telRegMakerCode;
  }

  public void setTelRegMakerCode(String telRegMakerCode) {
    this.telRegMakerCode = telRegMakerCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scheme scheme = (Scheme) o;
    return Objects.equals(this.companyCode, scheme.companyCode) &&
        Objects.equals(this.schemeCode, scheme.schemeCode) &&
        Objects.equals(this.telRegMakerCode, scheme.telRegMakerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, schemeCode, telRegMakerCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scheme {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    schemeCode: ").append(toIndentedString(schemeCode)).append("\n");
    sb.append("    telRegMakerCode: ").append(toIndentedString(telRegMakerCode)).append("\n");
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
