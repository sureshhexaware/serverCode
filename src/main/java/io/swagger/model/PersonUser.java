package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class PersonUser   {
  @JsonProperty("PreviousClientURN")
  private String previousClientURN = null;

  @JsonProperty("ClientURN")
  private String clientURN = null;

  @JsonProperty("PreviousEID")
  private String previousEID = null;

  @JsonProperty("EID")
  private String EID = "rt";

  @JsonProperty("SrcCode")
  private String srcCode = null;

  public PersonUser previousClientURN(String previousClientURN) {
    this.previousClientURN = previousClientURN;
    return this;
  }

  /**
   * Get previousClientURN
   * @return previousClientURN
   **/
  @Schema(description = "")
  
    public String getPreviousClientURN() {
    return previousClientURN;
  }

  public void setPreviousClientURN(String previousClientURN) {
    this.previousClientURN = previousClientURN;
  }

  public PersonUser clientURN(String clientURN) {
    this.clientURN = clientURN;
    return this;
  }

  /**
   * Get clientURN
   * @return clientURN
   **/
  @Schema(description = "")
  
    public String getClientURN() {
    return clientURN;
  }

  public void setClientURN(String clientURN) {
    this.clientURN = clientURN;
  }

  public PersonUser previousEID(String previousEID) {
    this.previousEID = previousEID;
    return this;
  }

  /**
   * Get previousEID
   * @return previousEID
   **/
  @Schema(description = "")
  
    public String getPreviousEID() {
    return previousEID;
  }

  public void setPreviousEID(String previousEID) {
    this.previousEID = previousEID;
  }

  public PersonUser EID(String EID) {
    this.EID = EID;
    return this;
  }

  /**
   * employee ID
   * @return EID
   **/
  @Schema(example = "sdf", description = "employee ID")
  
  @Pattern(regexp="xyz@gmail.com") @Size(min=1,max=4)   public String getEID() {
    return EID;
  }

  public void setEID(String EID) {
    this.EID = EID;
  }

  public PersonUser srcCode(String srcCode) {
    this.srcCode = srcCode;
    return this;
  }

  /**
   * Get srcCode
   * @return srcCode
   **/
  @Schema(description = "")
  
    public String getSrcCode() {
    return srcCode;
  }

  public void setSrcCode(String srcCode) {
    this.srcCode = srcCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonUser personUser = (PersonUser) o;
    return Objects.equals(this.previousClientURN, personUser.previousClientURN) &&
        Objects.equals(this.clientURN, personUser.clientURN) &&
        Objects.equals(this.previousEID, personUser.previousEID) &&
        Objects.equals(this.EID, personUser.EID) &&
        Objects.equals(this.srcCode, personUser.srcCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousClientURN, clientURN, previousEID, EID, srcCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonUser {\n");
    
    sb.append("    previousClientURN: ").append(toIndentedString(previousClientURN)).append("\n");
    sb.append("    clientURN: ").append(toIndentedString(clientURN)).append("\n");
    sb.append("    previousEID: ").append(toIndentedString(previousEID)).append("\n");
    sb.append("    EID: ").append(toIndentedString(EID)).append("\n");
    sb.append("    srcCode: ").append(toIndentedString(srcCode)).append("\n");
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
