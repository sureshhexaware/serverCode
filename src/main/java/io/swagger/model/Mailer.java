package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mailer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class Mailer   {
  @JsonProperty("CompanyCode")
  private String companyCode = null;

  @JsonProperty("SchemeCode")
  private String schemeCode = null;

  @JsonProperty("Reference")
  private String reference = null;

  public Mailer companyCode(String companyCode) {
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

  public Mailer schemeCode(String schemeCode) {
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

  public Mailer reference(String reference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mailer mailer = (Mailer) o;
    return Objects.equals(this.companyCode, mailer.companyCode) &&
        Objects.equals(this.schemeCode, mailer.schemeCode) &&
        Objects.equals(this.reference, mailer.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, schemeCode, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mailer {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    schemeCode: ").append(toIndentedString(schemeCode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
