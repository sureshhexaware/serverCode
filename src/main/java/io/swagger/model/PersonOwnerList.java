package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PersonOwner;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonOwnerList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-15T04:51:22.315262800Z[Etc/UTC]")


public class PersonOwnerList   {
  @JsonProperty("PersonOwner")
  private PersonOwner personOwner = null;

  public PersonOwnerList personOwner(PersonOwner personOwner) {
    this.personOwner = personOwner;
    return this;
  }

  /**
   * Get personOwner
   * @return personOwner
   **/
  @Schema(description = "")
  
    @Valid
    public PersonOwner getPersonOwner() {
    return personOwner;
  }

  public void setPersonOwner(PersonOwner personOwner) {
    this.personOwner = personOwner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonOwnerList personOwnerList = (PersonOwnerList) o;
    return Objects.equals(this.personOwner, personOwnerList.personOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonOwnerList {\n");
    
    sb.append("    personOwner: ").append(toIndentedString(personOwner)).append("\n");
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
