package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Agent;
import io.swagger.model.ContractType;
import io.swagger.model.Scheme;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CallSourceDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class CallSourceDetails   {
  @JsonProperty("CallSource")
  private Resource callSource = null;

  @JsonProperty("CallSourceDescription")
  private String callSourceDescription = null;

  @JsonProperty("Scheme")
  private Scheme scheme = null;

  @JsonProperty("Agent")
  private Agent agent = null;

  @JsonProperty("ItemCode")
  private LocalDate itemCode = null;

  @JsonProperty("ItemCodeDescription")
  private String itemCodeDescription = null;

  @JsonProperty("PriceBand")
  private String priceBand = null;

  @JsonProperty("NumberOfItems")
  private String numberOfItems = null;

  @JsonProperty("CoverType")
  private String coverType = null;

  @JsonProperty("BreakdownStartDate")
  private String breakdownStartDate = null;

  @JsonProperty("ContractType")
  private ContractType contractType = null;

  public CallSourceDetails callSource(Resource callSource) {
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

  public CallSourceDetails callSourceDescription(String callSourceDescription) {
    this.callSourceDescription = callSourceDescription;
    return this;
  }

  /**
   * Get callSourceDescription
   * @return callSourceDescription
   **/
  @Schema(description = "")
  
    public String getCallSourceDescription() {
    return callSourceDescription;
  }

  public void setCallSourceDescription(String callSourceDescription) {
    this.callSourceDescription = callSourceDescription;
  }

  public CallSourceDetails scheme(Scheme scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Get scheme
   * @return scheme
   **/
  @Schema(description = "")
  
    @Valid
    public Scheme getScheme() {
    return scheme;
  }

  public void setScheme(Scheme scheme) {
    this.scheme = scheme;
  }

  public CallSourceDetails agent(Agent agent) {
    this.agent = agent;
    return this;
  }

  /**
   * Get agent
   * @return agent
   **/
  @Schema(description = "")
  
    @Valid
    public Agent getAgent() {
    return agent;
  }

  public void setAgent(Agent agent) {
    this.agent = agent;
  }

  public CallSourceDetails itemCode(LocalDate itemCode) {
    this.itemCode = itemCode;
    return this;
  }

  /**
   * Unique ID of Item
   * @return itemCode
   **/
  @Schema(description = "Unique ID of Item")
  
    @Valid
    public LocalDate getItemCode() {
    return itemCode;
  }

  public void setItemCode(LocalDate itemCode) {
    this.itemCode = itemCode;
  }

  public CallSourceDetails itemCodeDescription(String itemCodeDescription) {
    this.itemCodeDescription = itemCodeDescription;
    return this;
  }

  /**
   * Get itemCodeDescription
   * @return itemCodeDescription
   **/
  @Schema(description = "")
  
    public String getItemCodeDescription() {
    return itemCodeDescription;
  }

  public void setItemCodeDescription(String itemCodeDescription) {
    this.itemCodeDescription = itemCodeDescription;
  }

  public CallSourceDetails priceBand(String priceBand) {
    this.priceBand = priceBand;
    return this;
  }

  /**
   * Get priceBand
   * @return priceBand
   **/
  @Schema(description = "")
  
    public String getPriceBand() {
    return priceBand;
  }

  public void setPriceBand(String priceBand) {
    this.priceBand = priceBand;
  }

  public CallSourceDetails numberOfItems(String numberOfItems) {
    this.numberOfItems = numberOfItems;
    return this;
  }

  /**
   * Get numberOfItems
   * @return numberOfItems
   **/
  @Schema(description = "")
  
    public String getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(String numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  public CallSourceDetails coverType(String coverType) {
    this.coverType = coverType;
    return this;
  }

  /**
   * Get coverType
   * @return coverType
   **/
  @Schema(description = "")
  
    public String getCoverType() {
    return coverType;
  }

  public void setCoverType(String coverType) {
    this.coverType = coverType;
  }

  public CallSourceDetails breakdownStartDate(String breakdownStartDate) {
    this.breakdownStartDate = breakdownStartDate;
    return this;
  }

  /**
   * Get breakdownStartDate
   * @return breakdownStartDate
   **/
  @Schema(description = "")
  
    public String getBreakdownStartDate() {
    return breakdownStartDate;
  }

  public void setBreakdownStartDate(String breakdownStartDate) {
    this.breakdownStartDate = breakdownStartDate;
  }

  public CallSourceDetails contractType(ContractType contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Get contractType
   * @return contractType
   **/
  @Schema(description = "")
  
    @Valid
    public ContractType getContractType() {
    return contractType;
  }

  public void setContractType(ContractType contractType) {
    this.contractType = contractType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallSourceDetails callSourceDetails = (CallSourceDetails) o;
    return Objects.equals(this.callSource, callSourceDetails.callSource) &&
        Objects.equals(this.callSourceDescription, callSourceDetails.callSourceDescription) &&
        Objects.equals(this.scheme, callSourceDetails.scheme) &&
        Objects.equals(this.agent, callSourceDetails.agent) &&
        Objects.equals(this.itemCode, callSourceDetails.itemCode) &&
        Objects.equals(this.itemCodeDescription, callSourceDetails.itemCodeDescription) &&
        Objects.equals(this.priceBand, callSourceDetails.priceBand) &&
        Objects.equals(this.numberOfItems, callSourceDetails.numberOfItems) &&
        Objects.equals(this.coverType, callSourceDetails.coverType) &&
        Objects.equals(this.breakdownStartDate, callSourceDetails.breakdownStartDate) &&
        Objects.equals(this.contractType, callSourceDetails.contractType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSource, callSourceDescription, scheme, agent, itemCode, itemCodeDescription, priceBand, numberOfItems, coverType, breakdownStartDate, contractType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallSourceDetails {\n");
    
    sb.append("    callSource: ").append(toIndentedString(callSource)).append("\n");
    sb.append("    callSourceDescription: ").append(toIndentedString(callSourceDescription)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    itemCodeDescription: ").append(toIndentedString(itemCodeDescription)).append("\n");
    sb.append("    priceBand: ").append(toIndentedString(priceBand)).append("\n");
    sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
    sb.append("    coverType: ").append(toIndentedString(coverType)).append("\n");
    sb.append("    breakdownStartDate: ").append(toIndentedString(breakdownStartDate)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
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
