package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Source
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class Source   {
  @JsonProperty("ChannelCode")
  private String channelCode = null;

  @JsonProperty("ChannelGroupCode")
  private String channelGroupCode = null;

  @JsonProperty("SystemCode")
  private String systemCode = null;

  @JsonProperty("CountryCode")
  private String countryCode = null;

  @JsonProperty("ClientCode")
  private String clientCode = null;

  @JsonProperty("ClientCodeDescription")
  private String clientCodeDescription = null;

  @JsonProperty("ClientGroupCode")
  private String clientGroupCode = null;

  @JsonProperty("ClientGroupDescription")
  private String clientGroupDescription = null;

  public Source channelCode(String channelCode) {
    this.channelCode = channelCode;
    return this;
  }

  /**
   * Get channelCode
   * @return channelCode
   **/
  @Schema(description = "")
  
    public String getChannelCode() {
    return channelCode;
  }

  public void setChannelCode(String channelCode) {
    this.channelCode = channelCode;
  }

  public Source channelGroupCode(String channelGroupCode) {
    this.channelGroupCode = channelGroupCode;
    return this;
  }

  /**
   * Get channelGroupCode
   * @return channelGroupCode
   **/
  @Schema(description = "")
  
    public String getChannelGroupCode() {
    return channelGroupCode;
  }

  public void setChannelGroupCode(String channelGroupCode) {
    this.channelGroupCode = channelGroupCode;
  }

  public Source systemCode(String systemCode) {
    this.systemCode = systemCode;
    return this;
  }

  /**
   * Get systemCode
   * @return systemCode
   **/
  @Schema(description = "")
  
    public String getSystemCode() {
    return systemCode;
  }

  public void setSystemCode(String systemCode) {
    this.systemCode = systemCode;
  }

  public Source countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   **/
  @Schema(description = "")
  
    public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Source clientCode(String clientCode) {
    this.clientCode = clientCode;
    return this;
  }

  /**
   * Get clientCode
   * @return clientCode
   **/
  @Schema(description = "")
  
    public String getClientCode() {
    return clientCode;
  }

  public void setClientCode(String clientCode) {
    this.clientCode = clientCode;
  }

  public Source clientCodeDescription(String clientCodeDescription) {
    this.clientCodeDescription = clientCodeDescription;
    return this;
  }

  /**
   * Get clientCodeDescription
   * @return clientCodeDescription
   **/
  @Schema(description = "")
  
    public String getClientCodeDescription() {
    return clientCodeDescription;
  }

  public void setClientCodeDescription(String clientCodeDescription) {
    this.clientCodeDescription = clientCodeDescription;
  }

  public Source clientGroupCode(String clientGroupCode) {
    this.clientGroupCode = clientGroupCode;
    return this;
  }

  /**
   * Get clientGroupCode
   * @return clientGroupCode
   **/
  @Schema(description = "")
  
    public String getClientGroupCode() {
    return clientGroupCode;
  }

  public void setClientGroupCode(String clientGroupCode) {
    this.clientGroupCode = clientGroupCode;
  }

  public Source clientGroupDescription(String clientGroupDescription) {
    this.clientGroupDescription = clientGroupDescription;
    return this;
  }

  /**
   * Get clientGroupDescription
   * @return clientGroupDescription
   **/
  @Schema(description = "")
  
    public String getClientGroupDescription() {
    return clientGroupDescription;
  }

  public void setClientGroupDescription(String clientGroupDescription) {
    this.clientGroupDescription = clientGroupDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.channelCode, source.channelCode) &&
        Objects.equals(this.channelGroupCode, source.channelGroupCode) &&
        Objects.equals(this.systemCode, source.systemCode) &&
        Objects.equals(this.countryCode, source.countryCode) &&
        Objects.equals(this.clientCode, source.clientCode) &&
        Objects.equals(this.clientCodeDescription, source.clientCodeDescription) &&
        Objects.equals(this.clientGroupCode, source.clientGroupCode) &&
        Objects.equals(this.clientGroupDescription, source.clientGroupDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelCode, channelGroupCode, systemCode, countryCode, clientCode, clientCodeDescription, clientGroupCode, clientGroupDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    channelCode: ").append(toIndentedString(channelCode)).append("\n");
    sb.append("    channelGroupCode: ").append(toIndentedString(channelGroupCode)).append("\n");
    sb.append("    systemCode: ").append(toIndentedString(systemCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    clientCode: ").append(toIndentedString(clientCode)).append("\n");
    sb.append("    clientCodeDescription: ").append(toIndentedString(clientCodeDescription)).append("\n");
    sb.append("    clientGroupCode: ").append(toIndentedString(clientGroupCode)).append("\n");
    sb.append("    clientGroupDescription: ").append(toIndentedString(clientGroupDescription)).append("\n");
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
