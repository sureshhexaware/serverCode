package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AdditionalDetails;
import io.swagger.model.Address;
import io.swagger.model.Cover;
import io.swagger.model.ItemDetails;
import io.swagger.model.ItemLink;
import io.swagger.model.OtherIds;
import io.swagger.model.PersonOwnerList;
import io.swagger.model.PersonUserList;
import io.swagger.model.Purchase;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Item
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class Item   {
  @JsonProperty("ItemLink")
  private ItemLink itemLink = null;

  @JsonProperty("ItemDetails")
  private ItemDetails itemDetails = null;

  @JsonProperty("AdditionalDetails")
  private AdditionalDetails additionalDetails = null;

  @JsonProperty("OtherIds")
  private OtherIds otherIds = null;

  @JsonProperty("Cover")
  private Cover cover = null;

  @JsonProperty("Purchase")
  private Purchase purchase = null;

  @JsonProperty("Address")
  private Address address = null;

  @JsonProperty("PersonOwnerList")
  private PersonOwnerList personOwnerList = null;

  @JsonProperty("PersonUserList")
  private PersonUserList personUserList = null;

  @JsonProperty("ClientCode")
  private String clientCode = null;

  @JsonProperty("ItemCtgCode")
  private String itemCtgCode = null;

  public Item itemLink(ItemLink itemLink) {
    this.itemLink = itemLink;
    return this;
  }

  /**
   * Get itemLink
   * @return itemLink
   **/
  @Schema(description = "")
  
    @Valid
    public ItemLink getItemLink() {
    return itemLink;
  }

  public void setItemLink(ItemLink itemLink) {
    this.itemLink = itemLink;
  }

  public Item itemDetails(ItemDetails itemDetails) {
    this.itemDetails = itemDetails;
    return this;
  }

  /**
   * Get itemDetails
   * @return itemDetails
   **/
  @Schema(description = "")
  
    @Valid
    public ItemDetails getItemDetails() {
    return itemDetails;
  }

  public void setItemDetails(ItemDetails itemDetails) {
    this.itemDetails = itemDetails;
  }

  public Item additionalDetails(AdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

  /**
   * Get additionalDetails
   * @return additionalDetails
   **/
  @Schema(description = "")
  
    @Valid
    public AdditionalDetails getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(AdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  public Item otherIds(OtherIds otherIds) {
    this.otherIds = otherIds;
    return this;
  }

  /**
   * Get otherIds
   * @return otherIds
   **/
  @Schema(description = "")
  
    @Valid
    public OtherIds getOtherIds() {
    return otherIds;
  }

  public void setOtherIds(OtherIds otherIds) {
    this.otherIds = otherIds;
  }

  public Item cover(Cover cover) {
    this.cover = cover;
    return this;
  }

  /**
   * Get cover
   * @return cover
   **/
  @Schema(description = "")
  
    @Valid
    public Cover getCover() {
    return cover;
  }

  public void setCover(Cover cover) {
    this.cover = cover;
  }

  public Item purchase(Purchase purchase) {
    this.purchase = purchase;
    return this;
  }

  /**
   * Get purchase
   * @return purchase
   **/
  @Schema(description = "")
  
    @Valid
    public Purchase getPurchase() {
    return purchase;
  }

  public void setPurchase(Purchase purchase) {
    this.purchase = purchase;
  }

  public Item address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(description = "")
  
    @Valid
    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Item personOwnerList(PersonOwnerList personOwnerList) {
    this.personOwnerList = personOwnerList;
    return this;
  }

  /**
   * Get personOwnerList
   * @return personOwnerList
   **/
  @Schema(description = "")
  
    @Valid
    public PersonOwnerList getPersonOwnerList() {
    return personOwnerList;
  }

  public void setPersonOwnerList(PersonOwnerList personOwnerList) {
    this.personOwnerList = personOwnerList;
  }

  public Item personUserList(PersonUserList personUserList) {
    this.personUserList = personUserList;
    return this;
  }

  /**
   * Get personUserList
   * @return personUserList
   **/
  @Schema(description = "")
  
    @Valid
    public PersonUserList getPersonUserList() {
    return personUserList;
  }

  public void setPersonUserList(PersonUserList personUserList) {
    this.personUserList = personUserList;
  }

  public Item clientCode(String clientCode) {
    this.clientCode = clientCode;
    return this;
  }

  /**
   * Get clientCode
   * @return clientCode
   **/
  @Schema(description = "")
  
    public String getClientCode() {
    return clientCode;
  }

  public void setClientCode(String clientCode) {
    this.clientCode = clientCode;
  }

  public Item itemCtgCode(String itemCtgCode) {
    this.itemCtgCode = itemCtgCode;
    return this;
  }

  /**
   * Get itemCtgCode
   * @return itemCtgCode
   **/
  @Schema(description = "")
  
    public String getItemCtgCode() {
    return itemCtgCode;
  }

  public void setItemCtgCode(String itemCtgCode) {
    this.itemCtgCode = itemCtgCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.itemLink, item.itemLink) &&
        Objects.equals(this.itemDetails, item.itemDetails) &&
        Objects.equals(this.additionalDetails, item.additionalDetails) &&
        Objects.equals(this.otherIds, item.otherIds) &&
        Objects.equals(this.cover, item.cover) &&
        Objects.equals(this.purchase, item.purchase) &&
        Objects.equals(this.address, item.address) &&
        Objects.equals(this.personOwnerList, item.personOwnerList) &&
        Objects.equals(this.personUserList, item.personUserList) &&
        Objects.equals(this.clientCode, item.clientCode) &&
        Objects.equals(this.itemCtgCode, item.itemCtgCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemLink, itemDetails, additionalDetails, otherIds, cover, purchase, address, personOwnerList, personUserList, clientCode, itemCtgCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    itemLink: ").append(toIndentedString(itemLink)).append("\n");
    sb.append("    itemDetails: ").append(toIndentedString(itemDetails)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    otherIds: ").append(toIndentedString(otherIds)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    purchase: ").append(toIndentedString(purchase)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    personOwnerList: ").append(toIndentedString(personOwnerList)).append("\n");
    sb.append("    personUserList: ").append(toIndentedString(personUserList)).append("\n");
    sb.append("    clientCode: ").append(toIndentedString(clientCode)).append("\n");
    sb.append("    itemCtgCode: ").append(toIndentedString(itemCtgCode)).append("\n");
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
