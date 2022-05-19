package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemID
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class ItemID   {
  @JsonProperty("EID")
  private String EID = "rt";

  public ItemID EID(String EID) {
    this.EID = EID;
    return this;
  }

  /**
   * employee ID
   * @return EID
   **/
  @Schema(example = "sdf", description = "employee ID")
  
  @Pattern(regexp="xyz@gmail.com") @Size(min=1,max=4)   public String getEID() {
    return EID;
  }

  public void setEID(String EID) {
    this.EID = EID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemID itemID = (ItemID) o;
    return Objects.equals(this.EID, itemID.EID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemID {\n");
    
    sb.append("    EID: ").append(toIndentedString(EID)).append("\n");
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
