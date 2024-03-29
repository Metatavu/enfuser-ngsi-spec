package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class GetAttributeDataResponse   {
  
  private @Valid Double value = null;
  private @Valid String type = null;
  private @Valid Object metadata = null;

  /**
   * 
   **/
  public GetAttributeDataResponse value(Double value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "21.7", required = true, value = "")
  @NotNull
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * 
   **/
  public GetAttributeDataResponse type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "Number", required = true, value = "")
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
  public GetAttributeDataResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(example = "{}", required = true, value = "")
  @NotNull
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAttributeDataResponse getAttributeDataResponse = (GetAttributeDataResponse) o;
    return Objects.equals(value, getAttributeDataResponse.value) &&
        Objects.equals(type, getAttributeDataResponse.type) &&
        Objects.equals(metadata, getAttributeDataResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttributeDataResponse {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

