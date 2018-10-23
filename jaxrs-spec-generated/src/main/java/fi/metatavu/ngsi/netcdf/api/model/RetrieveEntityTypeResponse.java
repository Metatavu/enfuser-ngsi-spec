package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class RetrieveEntityTypeResponse   {
  
  private @Valid Object attrs = null;
  private @Valid Integer count = null;

  /**
   * 
   **/
  public RetrieveEntityTypeResponse attrs(Object attrs) {
    this.attrs = attrs;
    return this;
  }

  
  @ApiModelProperty(example = "{\"pressure\":{\"types\":[\"Number\"]},\"humidity\":{\"types\":[\"percentage\"]},\"temperature\":{\"types\":[\"urn:phenomenum:temperature\"]}}", required = true, value = "")
  @NotNull
  public Object getAttrs() {
    return attrs;
  }
  public void setAttrs(Object attrs) {
    this.attrs = attrs;
  }

  /**
   * 
   **/
  public RetrieveEntityTypeResponse count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(example = "7", required = true, value = "")
  @NotNull
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEntityTypeResponse retrieveEntityTypeResponse = (RetrieveEntityTypeResponse) o;
    return Objects.equals(attrs, retrieveEntityTypeResponse.attrs) &&
        Objects.equals(count, retrieveEntityTypeResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrs, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEntityTypeResponse {\n");
    
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

