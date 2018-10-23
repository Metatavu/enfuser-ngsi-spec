package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class UpdateRegistrationRequest   {
  
  private @Valid String expires = null;

  /**
   * 
   **/
  public UpdateRegistrationRequest expires(String expires) {
    this.expires = expires;
    return this;
  }

  
  @ApiModelProperty(example = "10/4/2017 12:00:00 AM", required = true, value = "")
  @NotNull
  public String getExpires() {
    return expires;
  }
  public void setExpires(String expires) {
    this.expires = expires;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRegistrationRequest updateRegistrationRequest = (UpdateRegistrationRequest) o;
    return Objects.equals(expires, updateRegistrationRequest.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRegistrationRequest {\n");
    
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

