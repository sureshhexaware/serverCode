package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RTPRate;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RTPRateList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class RTPRateList   {
  @JsonProperty("RTPRate")
  private RTPRate rtPRate = null;

  public RTPRateList rtPRate(RTPRate rtPRate) {
    this.rtPRate = rtPRate;
    return this;
  }

  /**
   * Get rtPRate
   * @return rtPRate
   **/
  @Schema(description = "")
  
    @Valid
    public RTPRate getRtPRate() {
    return rtPRate;
  }

  public void setRtPRate(RTPRate rtPRate) {
    this.rtPRate = rtPRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPRateList rtPRateList = (RTPRateList) o;
    return Objects.equals(this.rtPRate, rtPRateList.rtPRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtPRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPRateList {\n");
    
    sb.append("    rtPRate: ").append(toIndentedString(rtPRate)).append("\n");
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
