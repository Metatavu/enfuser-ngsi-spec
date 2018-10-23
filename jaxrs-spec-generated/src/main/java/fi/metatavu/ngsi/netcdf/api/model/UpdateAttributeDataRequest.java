package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class UpdateAttributeDataRequest   {
  
  private @Valid Double value = null;
  private @Valid Object metadata = null;

  /**
   * 
   **/
  public UpdateAttributeDataRequest value(Double value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "25.0", required = true, value = "")
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
  public UpdateAttributeDataRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(example = "{\"unitCode\":{\"value\":\"CEL\"}}", required = true, value = "")
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
    UpdateAttributeDataRequest updateAttributeDataRequest = (UpdateAttributeDataRequest) o;
    return Objects.equals(value, updateAttributeDataRequest.value) &&
        Objects.equals(metadata, updateAttributeDataRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAttributeDataRequest {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

