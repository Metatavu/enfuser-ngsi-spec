package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class ListEntityTypesResponse   {
  
  private @Valid String type = null;
  private @Valid Object attrs = null;
  private @Valid Integer count = null;

  /**
   * 
   **/
  public ListEntityTypesResponse type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "Car", required = true, value = "")
  @NotNull
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   **/
  public ListEntityTypesResponse attrs(Object attrs) {
    this.attrs = attrs;
    return this;
  }

  
  @ApiModelProperty(example = "{\"speed\":{\"types\":[\"Number\"]},\"fuel\":{\"types\":[\"gasoline\",\"diesel\"]},\"temperature\":{\"types\":[\"urn:phenomenum:temperature\"]}}", required = true, value = "")
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
  public ListEntityTypesResponse count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(example = "12", required = true, value = "")
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
    ListEntityTypesResponse listEntityTypesResponse = (ListEntityTypesResponse) o;
    return Objects.equals(type, listEntityTypesResponse.type) &&
        Objects.equals(attrs, listEntityTypesResponse.attrs) &&
        Objects.equals(count, listEntityTypesResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attrs, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEntityTypesResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

