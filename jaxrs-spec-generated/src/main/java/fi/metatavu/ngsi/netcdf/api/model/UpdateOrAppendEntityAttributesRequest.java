package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class UpdateOrAppendEntityAttributesRequest   {
  
  private @Valid Object ambientNoise = null;

  /**
   * 
   **/
  public UpdateOrAppendEntityAttributesRequest ambientNoise(Object ambientNoise) {
    this.ambientNoise = ambientNoise;
    return this;
  }

  
  @ApiModelProperty(example = "{\"value\":31.5}", required = true, value = "")
  @NotNull
  public Object getAmbientNoise() {
    return ambientNoise;
  }
  public void setAmbientNoise(Object ambientNoise) {
    this.ambientNoise = ambientNoise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrAppendEntityAttributesRequest updateOrAppendEntityAttributesRequest = (UpdateOrAppendEntityAttributesRequest) o;
    return Objects.equals(ambientNoise, updateOrAppendEntityAttributesRequest.ambientNoise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ambientNoise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrAppendEntityAttributesRequest {\n");
    
    sb.append("    ambientNoise: ").append(toIndentedString(ambientNoise)).append("\n");
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

