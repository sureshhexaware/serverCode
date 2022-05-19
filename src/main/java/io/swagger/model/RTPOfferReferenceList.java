package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RTPOfferReference;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RTPOfferReferenceList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class RTPOfferReferenceList   {
  @JsonProperty("RTPOfferReference")
  private RTPOfferReference rtPOfferReference = null;

  public RTPOfferReferenceList rtPOfferReference(RTPOfferReference rtPOfferReference) {
    this.rtPOfferReference = rtPOfferReference;
    return this;
  }

  /**
   * Get rtPOfferReference
   * @return rtPOfferReference
   **/
  @Schema(description = "")
  
    @Valid
    public RTPOfferReference getRtPOfferReference() {
    return rtPOfferReference;
  }

  public void setRtPOfferReference(RTPOfferReference rtPOfferReference) {
    this.rtPOfferReference = rtPOfferReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPOfferReferenceList rtPOfferReferenceList = (RTPOfferReferenceList) o;
    return Objects.equals(this.rtPOfferReference, rtPOfferReferenceList.rtPOfferReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtPOfferReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPOfferReferenceList {\n");
    
    sb.append("    rtPOfferReference: ").append(toIndentedString(rtPOfferReference)).append("\n");
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
