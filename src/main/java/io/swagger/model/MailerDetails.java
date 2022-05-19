package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MailerDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class MailerDetails   {
  @JsonProperty("RegCode")
  private String regCode = null;

  @JsonProperty("ProdQTypeID")
  private String prodQTypeID = null;

  @JsonProperty("BoilerType")
  private String boilerType = null;

  @JsonProperty("Language")
  private String language = null;

  public MailerDetails regCode(String regCode) {
    this.regCode = regCode;
    return this;
  }

  /**
   * Get regCode
   * @return regCode
   **/
  @Schema(description = "")
  
    public String getRegCode() {
    return regCode;
  }

  public void setRegCode(String regCode) {
    this.regCode = regCode;
  }

  public MailerDetails prodQTypeID(String prodQTypeID) {
    this.prodQTypeID = prodQTypeID;
    return this;
  }

  /**
   * Get prodQTypeID
   * @return prodQTypeID
   **/
  @Schema(description = "")
  
    public String getProdQTypeID() {
    return prodQTypeID;
  }

  public void setProdQTypeID(String prodQTypeID) {
    this.prodQTypeID = prodQTypeID;
  }

  public MailerDetails boilerType(String boilerType) {
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

  public MailerDetails language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   **/
  @Schema(description = "")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailerDetails mailerDetails = (MailerDetails) o;
    return Objects.equals(this.regCode, mailerDetails.regCode) &&
        Objects.equals(this.prodQTypeID, mailerDetails.prodQTypeID) &&
        Objects.equals(this.boilerType, mailerDetails.boilerType) &&
        Objects.equals(this.language, mailerDetails.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regCode, prodQTypeID, boilerType, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailerDetails {\n");
    
    sb.append("    regCode: ").append(toIndentedString(regCode)).append("\n");
    sb.append("    prodQTypeID: ").append(toIndentedString(prodQTypeID)).append("\n");
    sb.append("    boilerType: ").append(toIndentedString(boilerType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
