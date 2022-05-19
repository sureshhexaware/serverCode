package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Item;
import io.swagger.model.ItemGetPriceDetails;
import io.swagger.model.ItemID;
import io.swagger.model.ItemURN;
import io.swagger.model.MailerDetails;
import io.swagger.model.SourceEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateItemReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class CreateItemReq   {
  @JsonProperty("SourceEvent")
  private SourceEvent sourceEvent = null;

  @JsonProperty("IsItemOwned")
  private String isItemOwned = null;

  @JsonProperty("ItemID")
  private ItemID itemID = null;

  @JsonProperty("ItemURN")
  private ItemURN itemURN = null;

  @JsonProperty("Item")
  private Item item = null;

  @JsonProperty("RegisterMailer")
  private String registerMailer = null;

  @JsonProperty("ItemGetPriceDetails")
  private ItemGetPriceDetails itemGetPriceDetails = null;

  @JsonProperty("CustomerToken")
  private String customerToken = null;

  @JsonProperty("PersonEID")
  private String personEID = null;

  @JsonProperty("MailerDetails")
  private MailerDetails mailerDetails = null;

  public CreateItemReq sourceEvent(SourceEvent sourceEvent) {
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

  public CreateItemReq isItemOwned(String isItemOwned) {
    this.isItemOwned = isItemOwned;
    return this;
  }

  /**
   * Get isItemOwned
   * @return isItemOwned
   **/
  @Schema(description = "")
  
    public String getIsItemOwned() {
    return isItemOwned;
  }

  public void setIsItemOwned(String isItemOwned) {
    this.isItemOwned = isItemOwned;
  }

  public CreateItemReq itemID(ItemID itemID) {
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

  public CreateItemReq itemURN(ItemURN itemURN) {
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

  public CreateItemReq item(Item item) {
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

  public CreateItemReq registerMailer(String registerMailer) {
    this.registerMailer = registerMailer;
    return this;
  }

  /**
   * Get registerMailer
   * @return registerMailer
   **/
  @Schema(description = "")
  
    public String getRegisterMailer() {
    return registerMailer;
  }

  public void setRegisterMailer(String registerMailer) {
    this.registerMailer = registerMailer;
  }

  public CreateItemReq itemGetPriceDetails(ItemGetPriceDetails itemGetPriceDetails) {
    this.itemGetPriceDetails = itemGetPriceDetails;
    return this;
  }

  /**
   * Get itemGetPriceDetails
   * @return itemGetPriceDetails
   **/
  @Schema(description = "")
  
    @Valid
    public ItemGetPriceDetails getItemGetPriceDetails() {
    return itemGetPriceDetails;
  }

  public void setItemGetPriceDetails(ItemGetPriceDetails itemGetPriceDetails) {
    this.itemGetPriceDetails = itemGetPriceDetails;
  }

  public CreateItemReq customerToken(String customerToken) {
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

  public CreateItemReq personEID(String personEID) {
    this.personEID = personEID;
    return this;
  }

  /**
   * Get personEID
   * @return personEID
   **/
  @Schema(description = "")
  
    public String getPersonEID() {
    return personEID;
  }

  public void setPersonEID(String personEID) {
    this.personEID = personEID;
  }

  public CreateItemReq mailerDetails(MailerDetails mailerDetails) {
    this.mailerDetails = mailerDetails;
    return this;
  }

  /**
   * Get mailerDetails
   * @return mailerDetails
   **/
  @Schema(description = "")
  
    @Valid
    public MailerDetails getMailerDetails() {
    return mailerDetails;
  }

  public void setMailerDetails(MailerDetails mailerDetails) {
    this.mailerDetails = mailerDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateItemReq createItemReq = (CreateItemReq) o;
    return Objects.equals(this.sourceEvent, createItemReq.sourceEvent) &&
        Objects.equals(this.isItemOwned, createItemReq.isItemOwned) &&
        Objects.equals(this.itemID, createItemReq.itemID) &&
        Objects.equals(this.itemURN, createItemReq.itemURN) &&
        Objects.equals(this.item, createItemReq.item) &&
        Objects.equals(this.registerMailer, createItemReq.registerMailer) &&
        Objects.equals(this.itemGetPriceDetails, createItemReq.itemGetPriceDetails) &&
        Objects.equals(this.customerToken, createItemReq.customerToken) &&
        Objects.equals(this.personEID, createItemReq.personEID) &&
        Objects.equals(this.mailerDetails, createItemReq.mailerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceEvent, isItemOwned, itemID, itemURN, item, registerMailer, itemGetPriceDetails, customerToken, personEID, mailerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateItemReq {\n");
    
    sb.append("    sourceEvent: ").append(toIndentedString(sourceEvent)).append("\n");
    sb.append("    isItemOwned: ").append(toIndentedString(isItemOwned)).append("\n");
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemURN: ").append(toIndentedString(itemURN)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    registerMailer: ").append(toIndentedString(registerMailer)).append("\n");
    sb.append("    itemGetPriceDetails: ").append(toIndentedString(itemGetPriceDetails)).append("\n");
    sb.append("    customerToken: ").append(toIndentedString(customerToken)).append("\n");
    sb.append("    personEID: ").append(toIndentedString(personEID)).append("\n");
    sb.append("    mailerDetails: ").append(toIndentedString(mailerDetails)).append("\n");
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
