package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class UpdateSubscriptionRequest   {
  
  private @Valid String expires = null;

  /**
   * 
   **/
  public UpdateSubscriptionRequest expires(String expires) {
    this.expires = expires;
    return this;
  }

  
  @ApiModelProperty(example = "4/5/2016 2:00:00 PM", required = true, value = "")
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
    UpdateSubscriptionRequest updateSubscriptionRequest = (UpdateSubscriptionRequest) o;
    return Objects.equals(expires, updateSubscriptionRequest.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSubscriptionRequest {\n");
    
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

