package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ItemDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemDetailsList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class ItemDetailsList   {
  @JsonProperty("ItemDetails")
  private ItemDetails itemDetails = null;

  public ItemDetailsList itemDetails(ItemDetails itemDetails) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetailsList itemDetailsList = (ItemDetailsList) o;
    return Objects.equals(this.itemDetails, itemDetailsList.itemDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailsList {\n");
    
    sb.append("    itemDetails: ").append(toIndentedString(itemDetails)).append("\n");
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
