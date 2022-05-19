package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Agent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class Agent   {
  @JsonProperty("AgentNumber")
  private String agentNumber = null;

  @JsonProperty("SchemeCodeBranchNumber")
  private String schemeCodeBranchNumber = null;

  public Agent agentNumber(String agentNumber) {
    this.agentNumber = agentNumber;
    return this;
  }

  /**
   * Get agentNumber
   * @return agentNumber
   **/
  @Schema(description = "")
  
    public String getAgentNumber() {
    return agentNumber;
  }

  public void setAgentNumber(String agentNumber) {
    this.agentNumber = agentNumber;
  }

  public Agent schemeCodeBranchNumber(String schemeCodeBranchNumber) {
    this.schemeCodeBranchNumber = schemeCodeBranchNumber;
    return this;
  }

  /**
   * Get schemeCodeBranchNumber
   * @return schemeCodeBranchNumber
   **/
  @Schema(description = "")
  
    public String getSchemeCodeBranchNumber() {
    return schemeCodeBranchNumber;
  }

  public void setSchemeCodeBranchNumber(String schemeCodeBranchNumber) {
    this.schemeCodeBranchNumber = schemeCodeBranchNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(this.agentNumber, agent.agentNumber) &&
        Objects.equals(this.schemeCodeBranchNumber, agent.schemeCodeBranchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentNumber, schemeCodeBranchNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    agentNumber: ").append(toIndentedString(agentNumber)).append("\n");
    sb.append("    schemeCodeBranchNumber: ").append(toIndentedString(schemeCodeBranchNumber)).append("\n");
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
