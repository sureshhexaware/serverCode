package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BabyPlanList;
import io.swagger.model.ErrorResponseList;
import io.swagger.model.ItemID;
import io.swagger.model.ItemURN;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateItemResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class UpdateItemResp   {
  @JsonProperty("ItemID")
  private ItemID itemID = null;

  @JsonProperty("ItemURN")
  private ItemURN itemURN = null;

  @JsonProperty("BabyPlanList")
  private BabyPlanList babyPlanList = null;

  @JsonProperty("ErrorResponseList")
  private ErrorResponseList errorResponseList = null;

  public UpdateItemResp itemID(ItemID itemID) {
    this.itemID = itemID;
    return this;
  }

  /**
   * Get itemID
   * @return itemID
   **/
  @Schema(description = "")
  
    @Valid
    public ItemID getItemID() {
    return itemID;
  }

  public void setItemID(ItemID itemID) {
    this.itemID = itemID;
  }

  public UpdateItemResp itemURN(ItemURN itemURN) {
    this.itemURN = itemURN;
    return this;
  }

  /**
   * Get itemURN
   * @return itemURN
   **/
  @Schema(description = "")
  
    @Valid
    public ItemURN getItemURN() {
    return itemURN;
  }

  public void setItemURN(ItemURN itemURN) {
    this.itemURN = itemURN;
  }

  public UpdateItemResp babyPlanList(BabyPlanList babyPlanList) {
    this.babyPlanList = babyPlanList;
    return this;
  }

  /**
   * Get babyPlanList
   * @return babyPlanList
   **/
  @Schema(description = "")
  
    @Valid
    public BabyPlanList getBabyPlanList() {
    return babyPlanList;
  }

  public void setBabyPlanList(BabyPlanList babyPlanList) {
    this.babyPlanList = babyPlanList;
  }

  public UpdateItemResp errorResponseList(ErrorResponseList errorResponseList) {
    this.errorResponseList = errorResponseList;
    return this;
  }

  /**
   * Get errorResponseList
   * @return errorResponseList
   **/
  @Schema(description = "")
  
    @Valid
    public ErrorResponseList getErrorResponseList() {
    return errorResponseList;
  }

  public void setErrorResponseList(ErrorResponseList errorResponseList) {
    this.errorResponseList = errorResponseList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateItemResp updateItemResp = (UpdateItemResp) o;
    return Objects.equals(this.itemID, updateItemResp.itemID) &&
        Objects.equals(this.itemURN, updateItemResp.itemURN) &&
        Objects.equals(this.babyPlanList, updateItemResp.babyPlanList) &&
        Objects.equals(this.errorResponseList, updateItemResp.errorResponseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemID, itemURN, babyPlanList, errorResponseList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateItemResp {\n");
    
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemURN: ").append(toIndentedString(itemURN)).append("\n");
    sb.append("    babyPlanList: ").append(toIndentedString(babyPlanList)).append("\n");
    sb.append("    errorResponseList: ").append(toIndentedString(errorResponseList)).append("\n");
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
