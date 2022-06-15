package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Item;
import io.swagger.model.ItemID;
import io.swagger.model.ItemURN;
import io.swagger.model.Mailer;
import io.swagger.model.NewBabyPlanList;
import io.swagger.model.Plan;
import io.swagger.model.SourceEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateItemReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class UpdateItemReq   {
  @JsonProperty("SourceEvent")
  private SourceEvent sourceEvent = null;

  @JsonProperty("ItemID")
  private ItemID itemID = null;

  @JsonProperty("ItemURN")
  private ItemURN itemURN = null;

  @JsonProperty("Item")
  private Item item = null;

  @JsonProperty("Plan")
  private Plan plan = null;

  @JsonProperty("IsNewBabyPlan")
  private String isNewBabyPlan = null;

  @JsonProperty("NewBabyPlanList")
  private NewBabyPlanList newBabyPlanList = null;

  @JsonProperty("Mailer")
  private Mailer mailer = null;

  @JsonProperty("UpdateMailerStatus")
  private String updateMailerStatus = null;

  @JsonProperty("CustomerToken")
  private String customerToken = null;

  @JsonProperty("OvrBabyBSD")
  private String ovrBabyBSD = null;

  public UpdateItemReq sourceEvent(SourceEvent sourceEvent) {
    this.sourceEvent = sourceEvent;
    return this;
  }

  /**
   * Get sourceEvent
   * @return sourceEvent
   **/
  @Schema(description = "")
  
    @Valid
    public SourceEvent getSourceEvent() {
    return sourceEvent;
  }

  public void setSourceEvent(SourceEvent sourceEvent) {
    this.sourceEvent = sourceEvent;
  }

  public UpdateItemReq itemID(ItemID itemID) {
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

  public UpdateItemReq itemURN(ItemURN itemURN) {
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

  public UpdateItemReq item(Item item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   **/
  @Schema(description = "")
  
    @Valid
    public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public UpdateItemReq plan(Plan plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Get plan
   * @return plan
   **/
  @Schema(description = "")
  
    @Valid
    public Plan getPlan() {
    return plan;
  }

  public void setPlan(Plan plan) {
    this.plan = plan;
  }

  public UpdateItemReq isNewBabyPlan(String isNewBabyPlan) {
    this.isNewBabyPlan = isNewBabyPlan;
    return this;
  }

  /**
   * Get isNewBabyPlan
   * @return isNewBabyPlan
   **/
  @Schema(description = "")
  
    public String getIsNewBabyPlan() {
    return isNewBabyPlan;
  }

  public void setIsNewBabyPlan(String isNewBabyPlan) {
    this.isNewBabyPlan = isNewBabyPlan;
  }

  public UpdateItemReq newBabyPlanList(NewBabyPlanList newBabyPlanList) {
    this.newBabyPlanList = newBabyPlanList;
    return this;
  }

  /**
   * Get newBabyPlanList
   * @return newBabyPlanList
   **/
  @Schema(description = "")
  
    @Valid
    public NewBabyPlanList getNewBabyPlanList() {
    return newBabyPlanList;
  }

  public void setNewBabyPlanList(NewBabyPlanList newBabyPlanList) {
    this.newBabyPlanList = newBabyPlanList;
  }

  public UpdateItemReq mailer(Mailer mailer) {
    this.mailer = mailer;
    return this;
  }

  /**
   * Get mailer
   * @return mailer
   **/
  @Schema(description = "")
  
    @Valid
    public Mailer getMailer() {
    return mailer;
  }

  public void setMailer(Mailer mailer) {
    this.mailer = mailer;
  }

  public UpdateItemReq updateMailerStatus(String updateMailerStatus) {
    this.updateMailerStatus = updateMailerStatus;
    return this;
  }

  /**
   * Get updateMailerStatus
   * @return updateMailerStatus
   **/
  @Schema(description = "")
  
    public String getUpdateMailerStatus() {
    return updateMailerStatus;
  }

  public void setUpdateMailerStatus(String updateMailerStatus) {
    this.updateMailerStatus = updateMailerStatus;
  }

  public UpdateItemReq customerToken(String customerToken) {
    this.customerToken = customerToken;
    return this;
  }

  /**
   * Get customerToken
   * @return customerToken
   **/
  @Schema(description = "")
  
    public String getCustomerToken() {
    return customerToken;
  }

  public void setCustomerToken(String customerToken) {
    this.customerToken = customerToken;
  }

  public UpdateItemReq ovrBabyBSD(String ovrBabyBSD) {
    this.ovrBabyBSD = ovrBabyBSD;
    return this;
  }

  /**
   * Get ovrBabyBSD
   * @return ovrBabyBSD
   **/
  @Schema(description = "")
  
    public String getOvrBabyBSD() {
    return ovrBabyBSD;
  }

  public void setOvrBabyBSD(String ovrBabyBSD) {
    this.ovrBabyBSD = ovrBabyBSD;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateItemReq updateItemReq = (UpdateItemReq) o;
    return Objects.equals(this.sourceEvent, updateItemReq.sourceEvent) &&
        Objects.equals(this.itemID, updateItemReq.itemID) &&
        Objects.equals(this.itemURN, updateItemReq.itemURN) &&
        Objects.equals(this.item, updateItemReq.item) &&
        Objects.equals(this.plan, updateItemReq.plan) &&
        Objects.equals(this.isNewBabyPlan, updateItemReq.isNewBabyPlan) &&
        Objects.equals(this.newBabyPlanList, updateItemReq.newBabyPlanList) &&
        Objects.equals(this.mailer, updateItemReq.mailer) &&
        Objects.equals(this.updateMailerStatus, updateItemReq.updateMailerStatus) &&
        Objects.equals(this.customerToken, updateItemReq.customerToken) &&
        Objects.equals(this.ovrBabyBSD, updateItemReq.ovrBabyBSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceEvent, itemID, itemURN, item, plan, isNewBabyPlan, newBabyPlanList, mailer, updateMailerStatus, customerToken, ovrBabyBSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateItemReq {\n");
    
    sb.append("    sourceEvent: ").append(toIndentedString(sourceEvent)).append("\n");
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemURN: ").append(toIndentedString(itemURN)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    isNewBabyPlan: ").append(toIndentedString(isNewBabyPlan)).append("\n");
    sb.append("    newBabyPlanList: ").append(toIndentedString(newBabyPlanList)).append("\n");
    sb.append("    mailer: ").append(toIndentedString(mailer)).append("\n");
    sb.append("    updateMailerStatus: ").append(toIndentedString(updateMailerStatus)).append("\n");
    sb.append("    customerToken: ").append(toIndentedString(customerToken)).append("\n");
    sb.append("    ovrBabyBSD: ").append(toIndentedString(ovrBabyBSD)).append("\n");
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
