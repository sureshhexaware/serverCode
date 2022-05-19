package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Item;
import io.swagger.model.ItemID;
import io.swagger.model.ItemURNList;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class ItemDetails   {
  @JsonProperty("ItemCode")
  private LocalDate itemCode = null;

  @JsonProperty("ItemCodeDescription")
  private String itemCodeDescription = null;

  @JsonProperty("ManufacturerBrandCode")
  private String manufacturerBrandCode = null;

  @JsonProperty("ManufacturerBrandDescription")
  private String manufacturerBrandDescription = null;

  @JsonProperty("GoodsColour")
  private String goodsColour = null;

  @JsonProperty("ModelNumber")
  private String modelNumber = null;

  @JsonProperty("SerialNumber")
  private String serialNumber = null;

  @JsonProperty("OperationalStatusCode")
  private String operationalStatusCode = null;

  @JsonProperty("DGAllocatedSupplierAgentCode")
  private String dgAllocatedSupplierAgentCode = null;

  @JsonProperty("DGAllocatedSupplierBranchCode")
  private String dgAllocatedSupplierBranchCode = null;

  @JsonProperty("LastServiceDate")
  private String lastServiceDate = null;

  @JsonProperty("LastServiceTime")
  private String lastServiceTime = null;

  @JsonProperty("ItemCatCode")
  private String itemCatCode = null;

  @JsonProperty("ManufacturerBrandGroupCode")
  private String manufacturerBrandGroupCode = null;

  @JsonProperty("ItemID")
  private ItemID itemID = null;

  @JsonProperty("ItemURNList")
  private ItemURNList itemURNList = null;

  @JsonProperty("Item")
  private Item item = null;

  public ItemDetails itemCode(LocalDate itemCode) {
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

  public ItemDetails itemCodeDescription(String itemCodeDescription) {
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

  public ItemDetails manufacturerBrandCode(String manufacturerBrandCode) {
    this.manufacturerBrandCode = manufacturerBrandCode;
    return this;
  }

  /**
   * Get manufacturerBrandCode
   * @return manufacturerBrandCode
   **/
  @Schema(description = "")
  
    public String getManufacturerBrandCode() {
    return manufacturerBrandCode;
  }

  public void setManufacturerBrandCode(String manufacturerBrandCode) {
    this.manufacturerBrandCode = manufacturerBrandCode;
  }

  public ItemDetails manufacturerBrandDescription(String manufacturerBrandDescription) {
    this.manufacturerBrandDescription = manufacturerBrandDescription;
    return this;
  }

  /**
   * Get manufacturerBrandDescription
   * @return manufacturerBrandDescription
   **/
  @Schema(description = "")
  
    public String getManufacturerBrandDescription() {
    return manufacturerBrandDescription;
  }

  public void setManufacturerBrandDescription(String manufacturerBrandDescription) {
    this.manufacturerBrandDescription = manufacturerBrandDescription;
  }

  public ItemDetails goodsColour(String goodsColour) {
    this.goodsColour = goodsColour;
    return this;
  }

  /**
   * Get goodsColour
   * @return goodsColour
   **/
  @Schema(description = "")
  
    public String getGoodsColour() {
    return goodsColour;
  }

  public void setGoodsColour(String goodsColour) {
    this.goodsColour = goodsColour;
  }

  public ItemDetails modelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
    return this;
  }

  /**
   * Get modelNumber
   * @return modelNumber
   **/
  @Schema(description = "")
  
    public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public ItemDetails serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   **/
  @Schema(description = "")
  
    public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public ItemDetails operationalStatusCode(String operationalStatusCode) {
    this.operationalStatusCode = operationalStatusCode;
    return this;
  }

  /**
   * Get operationalStatusCode
   * @return operationalStatusCode
   **/
  @Schema(description = "")
  
    public String getOperationalStatusCode() {
    return operationalStatusCode;
  }

  public void setOperationalStatusCode(String operationalStatusCode) {
    this.operationalStatusCode = operationalStatusCode;
  }

  public ItemDetails dgAllocatedSupplierAgentCode(String dgAllocatedSupplierAgentCode) {
    this.dgAllocatedSupplierAgentCode = dgAllocatedSupplierAgentCode;
    return this;
  }

  /**
   * Get dgAllocatedSupplierAgentCode
   * @return dgAllocatedSupplierAgentCode
   **/
  @Schema(description = "")
  
    public String getDgAllocatedSupplierAgentCode() {
    return dgAllocatedSupplierAgentCode;
  }

  public void setDgAllocatedSupplierAgentCode(String dgAllocatedSupplierAgentCode) {
    this.dgAllocatedSupplierAgentCode = dgAllocatedSupplierAgentCode;
  }

  public ItemDetails dgAllocatedSupplierBranchCode(String dgAllocatedSupplierBranchCode) {
    this.dgAllocatedSupplierBranchCode = dgAllocatedSupplierBranchCode;
    return this;
  }

  /**
   * Get dgAllocatedSupplierBranchCode
   * @return dgAllocatedSupplierBranchCode
   **/
  @Schema(description = "")
  
    public String getDgAllocatedSupplierBranchCode() {
    return dgAllocatedSupplierBranchCode;
  }

  public void setDgAllocatedSupplierBranchCode(String dgAllocatedSupplierBranchCode) {
    this.dgAllocatedSupplierBranchCode = dgAllocatedSupplierBranchCode;
  }

  public ItemDetails lastServiceDate(String lastServiceDate) {
    this.lastServiceDate = lastServiceDate;
    return this;
  }

  /**
   * Get lastServiceDate
   * @return lastServiceDate
   **/
  @Schema(description = "")
  
    public String getLastServiceDate() {
    return lastServiceDate;
  }

  public void setLastServiceDate(String lastServiceDate) {
    this.lastServiceDate = lastServiceDate;
  }

  public ItemDetails lastServiceTime(String lastServiceTime) {
    this.lastServiceTime = lastServiceTime;
    return this;
  }

  /**
   * Get lastServiceTime
   * @return lastServiceTime
   **/
  @Schema(description = "")
  
    public String getLastServiceTime() {
    return lastServiceTime;
  }

  public void setLastServiceTime(String lastServiceTime) {
    this.lastServiceTime = lastServiceTime;
  }

  public ItemDetails itemCatCode(String itemCatCode) {
    this.itemCatCode = itemCatCode;
    return this;
  }

  /**
   * Get itemCatCode
   * @return itemCatCode
   **/
  @Schema(description = "")
  
    public String getItemCatCode() {
    return itemCatCode;
  }

  public void setItemCatCode(String itemCatCode) {
    this.itemCatCode = itemCatCode;
  }

  public ItemDetails manufacturerBrandGroupCode(String manufacturerBrandGroupCode) {
    this.manufacturerBrandGroupCode = manufacturerBrandGroupCode;
    return this;
  }

  /**
   * Get manufacturerBrandGroupCode
   * @return manufacturerBrandGroupCode
   **/
  @Schema(description = "")
  
    public String getManufacturerBrandGroupCode() {
    return manufacturerBrandGroupCode;
  }

  public void setManufacturerBrandGroupCode(String manufacturerBrandGroupCode) {
    this.manufacturerBrandGroupCode = manufacturerBrandGroupCode;
  }

  public ItemDetails itemID(ItemID itemID) {
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

  public ItemDetails itemURNList(ItemURNList itemURNList) {
    this.itemURNList = itemURNList;
    return this;
  }

  /**
   * Get itemURNList
   * @return itemURNList
   **/
  @Schema(description = "")
  
    @Valid
    public ItemURNList getItemURNList() {
    return itemURNList;
  }

  public void setItemURNList(ItemURNList itemURNList) {
    this.itemURNList = itemURNList;
  }

  public ItemDetails item(Item item) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetails itemDetails = (ItemDetails) o;
    return Objects.equals(this.itemCode, itemDetails.itemCode) &&
        Objects.equals(this.itemCodeDescription, itemDetails.itemCodeDescription) &&
        Objects.equals(this.manufacturerBrandCode, itemDetails.manufacturerBrandCode) &&
        Objects.equals(this.manufacturerBrandDescription, itemDetails.manufacturerBrandDescription) &&
        Objects.equals(this.goodsColour, itemDetails.goodsColour) &&
        Objects.equals(this.modelNumber, itemDetails.modelNumber) &&
        Objects.equals(this.serialNumber, itemDetails.serialNumber) &&
        Objects.equals(this.operationalStatusCode, itemDetails.operationalStatusCode) &&
        Objects.equals(this.dgAllocatedSupplierAgentCode, itemDetails.dgAllocatedSupplierAgentCode) &&
        Objects.equals(this.dgAllocatedSupplierBranchCode, itemDetails.dgAllocatedSupplierBranchCode) &&
        Objects.equals(this.lastServiceDate, itemDetails.lastServiceDate) &&
        Objects.equals(this.lastServiceTime, itemDetails.lastServiceTime) &&
        Objects.equals(this.itemCatCode, itemDetails.itemCatCode) &&
        Objects.equals(this.manufacturerBrandGroupCode, itemDetails.manufacturerBrandGroupCode) &&
        Objects.equals(this.itemID, itemDetails.itemID) &&
        Objects.equals(this.itemURNList, itemDetails.itemURNList) &&
        Objects.equals(this.item, itemDetails.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCode, itemCodeDescription, manufacturerBrandCode, manufacturerBrandDescription, goodsColour, modelNumber, serialNumber, operationalStatusCode, dgAllocatedSupplierAgentCode, dgAllocatedSupplierBranchCode, lastServiceDate, lastServiceTime, itemCatCode, manufacturerBrandGroupCode, itemID, itemURNList, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetails {\n");
    
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    itemCodeDescription: ").append(toIndentedString(itemCodeDescription)).append("\n");
    sb.append("    manufacturerBrandCode: ").append(toIndentedString(manufacturerBrandCode)).append("\n");
    sb.append("    manufacturerBrandDescription: ").append(toIndentedString(manufacturerBrandDescription)).append("\n");
    sb.append("    goodsColour: ").append(toIndentedString(goodsColour)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    operationalStatusCode: ").append(toIndentedString(operationalStatusCode)).append("\n");
    sb.append("    dgAllocatedSupplierAgentCode: ").append(toIndentedString(dgAllocatedSupplierAgentCode)).append("\n");
    sb.append("    dgAllocatedSupplierBranchCode: ").append(toIndentedString(dgAllocatedSupplierBranchCode)).append("\n");
    sb.append("    lastServiceDate: ").append(toIndentedString(lastServiceDate)).append("\n");
    sb.append("    lastServiceTime: ").append(toIndentedString(lastServiceTime)).append("\n");
    sb.append("    itemCatCode: ").append(toIndentedString(itemCatCode)).append("\n");
    sb.append("    manufacturerBrandGroupCode: ").append(toIndentedString(manufacturerBrandGroupCode)).append("\n");
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemURNList: ").append(toIndentedString(itemURNList)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
