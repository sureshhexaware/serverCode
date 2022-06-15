package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Item;
import io.swagger.model.ItemID;
import io.swagger.model.ItemURN;
import io.swagger.model.Mailer;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewBabyPlan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class NewBabyPlan   {
  @JsonProperty("ItemID")
  private ItemID itemID = null;

  @JsonProperty("ItemURN")
  private ItemURN itemURN = null;

  @JsonProperty("Mailer")
  private Mailer mailer = null;

  @JsonProperty("Item")
  private Item item = null;

  public NewBabyPlan itemID(ItemID itemID) {
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

  public NewBabyPlan itemURN(ItemURN itemURN) {
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

  public NewBabyPlan mailer(Mailer mailer) {
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

  public NewBabyPlan item(Item item) {
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
    NewBabyPlan newBabyPlan = (NewBabyPlan) o;
    return Objects.equals(this.itemID, newBabyPlan.itemID) &&
        Objects.equals(this.itemURN, newBabyPlan.itemURN) &&
        Objects.equals(this.mailer, newBabyPlan.mailer) &&
        Objects.equals(this.item, newBabyPlan.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemID, itemURN, mailer, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBabyPlan {\n");
    
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemURN: ").append(toIndentedString(itemURN)).append("\n");
    sb.append("    mailer: ").append(toIndentedString(mailer)).append("\n");
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
