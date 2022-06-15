package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ErrorResponseList;
import io.swagger.model.ItemDetailsList;
import io.swagger.model.Source;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetItemDetailsResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class GetItemDetailsResp   {
  @JsonProperty("Source")
  private Source source = null;

  @JsonProperty("ItemDetailsList")
  private ItemDetailsList itemDetailsList = null;

  @JsonProperty("ErrorResponseList")
  private ErrorResponseList errorResponseList = null;

  public GetItemDetailsResp source(Source source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    @Valid
    public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public GetItemDetailsResp itemDetailsList(ItemDetailsList itemDetailsList) {
    this.itemDetailsList = itemDetailsList;
    return this;
  }

  /**
   * Get itemDetailsList
   * @return itemDetailsList
   **/
  @Schema(description = "")
  
    @Valid
    public ItemDetailsList getItemDetailsList() {
    return itemDetailsList;
  }

  public void setItemDetailsList(ItemDetailsList itemDetailsList) {
    this.itemDetailsList = itemDetailsList;
  }

  public GetItemDetailsResp errorResponseList(ErrorResponseList errorResponseList) {
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
    GetItemDetailsResp getItemDetailsResp = (GetItemDetailsResp) o;
    return Objects.equals(this.source, getItemDetailsResp.source) &&
        Objects.equals(this.itemDetailsList, getItemDetailsResp.itemDetailsList) &&
        Objects.equals(this.errorResponseList, getItemDetailsResp.errorResponseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, itemDetailsList, errorResponseList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetItemDetailsResp {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    itemDetailsList: ").append(toIndentedString(itemDetailsList)).append("\n");
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
