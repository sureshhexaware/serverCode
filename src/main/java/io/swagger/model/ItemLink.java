package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemLink
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class ItemLink   {
  @JsonProperty("MemIdNum")
  private String memIdNum = null;

  @JsonProperty("SrcCode")
  private String srcCode = null;

  public ItemLink memIdNum(String memIdNum) {
    this.memIdNum = memIdNum;
    return this;
  }

  /**
   * Get memIdNum
   * @return memIdNum
   **/
  @Schema(description = "")
  
    public String getMemIdNum() {
    return memIdNum;
  }

  public void setMemIdNum(String memIdNum) {
    this.memIdNum = memIdNum;
  }

  public ItemLink srcCode(String srcCode) {
    this.srcCode = srcCode;
    return this;
  }

  /**
   * Get srcCode
   * @return srcCode
   **/
  @Schema(description = "")
  
    public String getSrcCode() {
    return srcCode;
  }

  public void setSrcCode(String srcCode) {
    this.srcCode = srcCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemLink itemLink = (ItemLink) o;
    return Objects.equals(this.memIdNum, itemLink.memIdNum) &&
        Objects.equals(this.srcCode, itemLink.srcCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memIdNum, srcCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemLink {\n");
    
    sb.append("    memIdNum: ").append(toIndentedString(memIdNum)).append("\n");
    sb.append("    srcCode: ").append(toIndentedString(srcCode)).append("\n");
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
