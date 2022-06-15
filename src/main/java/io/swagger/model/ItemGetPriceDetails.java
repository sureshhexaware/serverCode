package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.GetPriceCallSourceList;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemGetPriceDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class ItemGetPriceDetails   {
  @JsonProperty("ItemCreateOffer")
  private String itemCreateOffer = null;

  @JsonProperty("GetPriceCallSourceList")
  private GetPriceCallSourceList getPriceCallSourceList = null;

  public ItemGetPriceDetails itemCreateOffer(String itemCreateOffer) {
    this.itemCreateOffer = itemCreateOffer;
    return this;
  }

  /**
   * Get itemCreateOffer
   * @return itemCreateOffer
   **/
  @Schema(description = "")
  
    public String getItemCreateOffer() {
    return itemCreateOffer;
  }

  public void setItemCreateOffer(String itemCreateOffer) {
    this.itemCreateOffer = itemCreateOffer;
  }

  public ItemGetPriceDetails getPriceCallSourceList(GetPriceCallSourceList getPriceCallSourceList) {
    this.getPriceCallSourceList = getPriceCallSourceList;
    return this;
  }

  /**
   * Get getPriceCallSourceList
   * @return getPriceCallSourceList
   **/
  @Schema(description = "")
  
    @Valid
    public GetPriceCallSourceList getGetPriceCallSourceList() {
    return getPriceCallSourceList;
  }

  public void setGetPriceCallSourceList(GetPriceCallSourceList getPriceCallSourceList) {
    this.getPriceCallSourceList = getPriceCallSourceList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemGetPriceDetails itemGetPriceDetails = (ItemGetPriceDetails) o;
    return Objects.equals(this.itemCreateOffer, itemGetPriceDetails.itemCreateOffer) &&
        Objects.equals(this.getPriceCallSourceList, itemGetPriceDetails.getPriceCallSourceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCreateOffer, getPriceCallSourceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemGetPriceDetails {\n");
    
    sb.append("    itemCreateOffer: ").append(toIndentedString(itemCreateOffer)).append("\n");
    sb.append("    getPriceCallSourceList: ").append(toIndentedString(getPriceCallSourceList)).append("\n");
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
