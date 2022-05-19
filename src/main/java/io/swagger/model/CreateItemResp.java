package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AlternativeApplianceList;
import io.swagger.model.ErrorResponseList;
import io.swagger.model.ItemID;
import io.swagger.model.ItemURN;
import io.swagger.model.Mailer;
import io.swagger.model.RTPOfferReferenceList;
import io.swagger.model.RTPRateList;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateItemResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-19T12:22:36.945512700Z[Etc/UTC]")


public class CreateItemResp   {
  @JsonProperty("ItemID")
  private ItemID itemID = null;

  @JsonProperty("ItemURN")
  private ItemURN itemURN = null;

  @JsonProperty("Mailer")
  private Mailer mailer = null;

  @JsonProperty("RTPOfferReferenceList")
  private RTPOfferReferenceList rtPOfferReferenceList = null;

  @JsonProperty("RTPRateList")
  private RTPRateList rtPRateList = null;

  @JsonProperty("AlternativeApplianceList")
  private AlternativeApplianceList alternativeApplianceList = null;

  @JsonProperty("ErrorResponseList")
  private ErrorResponseList errorResponseList = null;

  public CreateItemResp itemID(ItemID itemID) {
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

  public CreateItemResp itemURN(ItemURN itemURN) {
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

  public CreateItemResp mailer(Mailer mailer) {
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

  public CreateItemResp rtPOfferReferenceList(RTPOfferReferenceList rtPOfferReferenceList) {
    this.rtPOfferReferenceList = rtPOfferReferenceList;
    return this;
  }

  /**
   * Get rtPOfferReferenceList
   * @return rtPOfferReferenceList
   **/
  @Schema(description = "")
  
    @Valid
    public RTPOfferReferenceList getRtPOfferReferenceList() {
    return rtPOfferReferenceList;
  }

  public void setRtPOfferReferenceList(RTPOfferReferenceList rtPOfferReferenceList) {
    this.rtPOfferReferenceList = rtPOfferReferenceList;
  }

  public CreateItemResp rtPRateList(RTPRateList rtPRateList) {
    this.rtPRateList = rtPRateList;
    return this;
  }

  /**
   * Get rtPRateList
   * @return rtPRateList
   **/
  @Schema(description = "")
  
    @Valid
    public RTPRateList getRtPRateList() {
    return rtPRateList;
  }

  public void setRtPRateList(RTPRateList rtPRateList) {
    this.rtPRateList = rtPRateList;
  }

  public CreateItemResp alternativeApplianceList(AlternativeApplianceList alternativeApplianceList) {
    this.alternativeApplianceList = alternativeApplianceList;
    return this;
  }

  /**
   * Get alternativeApplianceList
   * @return alternativeApplianceList
   **/
  @Schema(description = "")
  
    @Valid
    public AlternativeApplianceList getAlternativeApplianceList() {
    return alternativeApplianceList;
  }

  public void setAlternativeApplianceList(AlternativeApplianceList alternativeApplianceList) {
    this.alternativeApplianceList = alternativeApplianceList;
  }

  public CreateItemResp errorResponseList(ErrorResponseList errorResponseList) {
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
    CreateItemResp createItemResp = (CreateItemResp) o;
    return Objects.equals(this.itemID, createItemResp.itemID) &&
        Objects.equals(this.itemURN, createItemResp.itemURN) &&
        Objects.equals(this.mailer, createItemResp.mailer) &&
        Objects.equals(this.rtPOfferReferenceList, createItemResp.rtPOfferReferenceList) &&
        Objects.equals(this.rtPRateList, createItemResp.rtPRateList) &&
        Objects.equals(this.alternativeApplianceList, createItemResp.alternativeApplianceList) &&
        Objects.equals(this.errorResponseList, createItemResp.errorResponseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemID, itemURN, mailer, rtPOfferReferenceList, rtPRateList, alternativeApplianceList, errorResponseList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateItemResp {\n");
    
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemURN: ").append(toIndentedString(itemURN)).append("\n");
    sb.append("    mailer: ").append(toIndentedString(mailer)).append("\n");
    sb.append("    rtPOfferReferenceList: ").append(toIndentedString(rtPOfferReferenceList)).append("\n");
    sb.append("    rtPRateList: ").append(toIndentedString(rtPRateList)).append("\n");
    sb.append("    alternativeApplianceList: ").append(toIndentedString(alternativeApplianceList)).append("\n");
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
