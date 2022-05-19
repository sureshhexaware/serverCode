package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AlternativeAppliance;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AlternativeApplianceList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class AlternativeApplianceList   {
  @JsonProperty("AlternativeAppliance")
  private AlternativeAppliance alternativeAppliance = null;

  public AlternativeApplianceList alternativeAppliance(AlternativeAppliance alternativeAppliance) {
    this.alternativeAppliance = alternativeAppliance;
    return this;
  }

  /**
   * Get alternativeAppliance
   * @return alternativeAppliance
   **/
  @Schema(description = "")
  
    @Valid
    public AlternativeAppliance getAlternativeAppliance() {
    return alternativeAppliance;
  }

  public void setAlternativeAppliance(AlternativeAppliance alternativeAppliance) {
    this.alternativeAppliance = alternativeAppliance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeApplianceList alternativeApplianceList = (AlternativeApplianceList) o;
    return Objects.equals(this.alternativeAppliance, alternativeApplianceList.alternativeAppliance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternativeAppliance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeApplianceList {\n");
    
    sb.append("    alternativeAppliance: ").append(toIndentedString(alternativeAppliance)).append("\n");
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
