package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BabyPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BabyPlanList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class BabyPlanList   {
  @JsonProperty("BabyPlan")
  private BabyPlan babyPlan = null;

  public BabyPlanList babyPlan(BabyPlan babyPlan) {
    this.babyPlan = babyPlan;
    return this;
  }

  /**
   * Get babyPlan
   * @return babyPlan
   **/
  @Schema(description = "")
  
    @Valid
    public BabyPlan getBabyPlan() {
    return babyPlan;
  }

  public void setBabyPlan(BabyPlan babyPlan) {
    this.babyPlan = babyPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BabyPlanList babyPlanList = (BabyPlanList) o;
    return Objects.equals(this.babyPlan, babyPlanList.babyPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(babyPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BabyPlanList {\n");
    
    sb.append("    babyPlan: ").append(toIndentedString(babyPlan)).append("\n");
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
