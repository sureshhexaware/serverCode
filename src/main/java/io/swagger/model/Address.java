package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddressDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class Address   {
  @JsonProperty("AddressCategory")
  private String addressCategory = null;

  @JsonProperty("AddressOverride")
  private String addressOverride = null;

  @JsonProperty("AddressStatus")
  private String addressStatus = null;

  @JsonProperty("AddressDetails")
  private AddressDetails addressDetails = null;

  public Address addressCategory(String addressCategory) {
    this.addressCategory = addressCategory;
    return this;
  }

  /**
   * Get addressCategory
   * @return addressCategory
   **/
  @Schema(description = "")
  
    public String getAddressCategory() {
    return addressCategory;
  }

  public void setAddressCategory(String addressCategory) {
    this.addressCategory = addressCategory;
  }

  public Address addressOverride(String addressOverride) {
    this.addressOverride = addressOverride;
    return this;
  }

  /**
   * Get addressOverride
   * @return addressOverride
   **/
  @Schema(description = "")
  
    public String getAddressOverride() {
    return addressOverride;
  }

  public void setAddressOverride(String addressOverride) {
    this.addressOverride = addressOverride;
  }

  public Address addressStatus(String addressStatus) {
    this.addressStatus = addressStatus;
    return this;
  }

  /**
   * Get addressStatus
   * @return addressStatus
   **/
  @Schema(description = "")
  
    public String getAddressStatus() {
    return addressStatus;
  }

  public void setAddressStatus(String addressStatus) {
    this.addressStatus = addressStatus;
  }

  public Address addressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
    return this;
  }

  /**
   * Get addressDetails
   * @return addressDetails
   **/
  @Schema(description = "")
  
    @Valid
    public AddressDetails getAddressDetails() {
    return addressDetails;
  }

  public void setAddressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressCategory, address.addressCategory) &&
        Objects.equals(this.addressOverride, address.addressOverride) &&
        Objects.equals(this.addressStatus, address.addressStatus) &&
        Objects.equals(this.addressDetails, address.addressDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCategory, addressOverride, addressStatus, addressDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressCategory: ").append(toIndentedString(addressCategory)).append("\n");
    sb.append("    addressOverride: ").append(toIndentedString(addressOverride)).append("\n");
    sb.append("    addressStatus: ").append(toIndentedString(addressStatus)).append("\n");
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
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
