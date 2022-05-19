package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.NewBabyPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewBabyPlanList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class NewBabyPlanList   {
  @JsonProperty("NewBabyPlan")
  private NewBabyPlan newBabyPlan = null;

  public NewBabyPlanList newBabyPlan(NewBabyPlan newBabyPlan) {
    this.newBabyPlan = newBabyPlan;
    return this;
  }

  /**
   * Get newBabyPlan
   * @return newBabyPlan
   **/
  @Schema(description = "")
  
    @Valid
    public NewBabyPlan getNewBabyPlan() {
    return newBabyPlan;
  }

  public void setNewBabyPlan(NewBabyPlan newBabyPlan) {
    this.newBabyPlan = newBabyPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBabyPlanList newBabyPlanList = (NewBabyPlanList) o;
    return Objects.equals(this.newBabyPlan, newBabyPlanList.newBabyPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newBabyPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBabyPlanList {\n");
    
    sb.append("    newBabyPlan: ").append(toIndentedString(newBabyPlan)).append("\n");
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
