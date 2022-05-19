package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemURN
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class ItemURN   {
  @JsonProperty("ClientURN")
  private String clientURN = null;

  @JsonProperty("ApplianceToken")
  private String applianceToken = null;

  public ItemURN clientURN(String clientURN) {
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

  public ItemURN applianceToken(String applianceToken) {
    this.applianceToken = applianceToken;
    return this;
  }

  /**
   * Get applianceToken
   * @return applianceToken
   **/
  @Schema(description = "")
  
    public String getApplianceToken() {
    return applianceToken;
  }

  public void setApplianceToken(String applianceToken) {
    this.applianceToken = applianceToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemURN itemURN = (ItemURN) o;
    return Objects.equals(this.clientURN, itemURN.clientURN) &&
        Objects.equals(this.applianceToken, itemURN.applianceToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientURN, applianceToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemURN {\n");
    
    sb.append("    clientURN: ").append(toIndentedString(clientURN)).append("\n");
    sb.append("    applianceToken: ").append(toIndentedString(applianceToken)).append("\n");
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
