package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RTPOfferReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class RTPOfferReference   {
  @JsonProperty("OfferReference")
  private String offerReference = null;

  @JsonProperty("OfferKey")
  private String offerKey = null;

  @JsonProperty("CallSource")
  private Resource callSource = null;

  public RTPOfferReference offerReference(String offerReference) {
    this.offerReference = offerReference;
    return this;
  }

  /**
   * Get offerReference
   * @return offerReference
   **/
  @Schema(description = "")
  
    public String getOfferReference() {
    return offerReference;
  }

  public void setOfferReference(String offerReference) {
    this.offerReference = offerReference;
  }

  public RTPOfferReference offerKey(String offerKey) {
    this.offerKey = offerKey;
    return this;
  }

  /**
   * Get offerKey
   * @return offerKey
   **/
  @Schema(description = "")
  
    public String getOfferKey() {
    return offerKey;
  }

  public void setOfferKey(String offerKey) {
    this.offerKey = offerKey;
  }

  public RTPOfferReference callSource(Resource callSource) {
    this.callSource = callSource;
    return this;
  }

  /**
   * Source
   * @return callSource
   **/
  @Schema(description = "Source")
  
    @Valid
    public Resource getCallSource() {
    return callSource;
  }

  public void setCallSource(Resource callSource) {
    this.callSource = callSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPOfferReference rtPOfferReference = (RTPOfferReference) o;
    return Objects.equals(this.offerReference, rtPOfferReference.offerReference) &&
        Objects.equals(this.offerKey, rtPOfferReference.offerKey) &&
        Objects.equals(this.callSource, rtPOfferReference.callSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerReference, offerKey, callSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPOfferReference {\n");
    
    sb.append("    offerReference: ").append(toIndentedString(offerReference)).append("\n");
    sb.append("    offerKey: ").append(toIndentedString(offerKey)).append("\n");
    sb.append("    callSource: ").append(toIndentedString(callSource)).append("\n");
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
