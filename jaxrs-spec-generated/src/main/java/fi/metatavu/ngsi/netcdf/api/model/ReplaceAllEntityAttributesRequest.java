package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class ReplaceAllEntityAttributesRequest   {
  
  private @Valid Object temperature = null;
  private @Valid Object seatNumber = null;

  /**
   * 
   **/
  public ReplaceAllEntityAttributesRequest temperature(Object temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "{\"value\":25.5}", required = true, value = "")
  @NotNull
  public Object getTemperature() {
    return temperature;
  }
  public void setTemperature(Object temperature) {
    this.temperature = temperature;
  }

  /**
   * 
   **/
  public ReplaceAllEntityAttributesRequest seatNumber(Object seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

  
  @ApiModelProperty(example = "{\"value\":6}", required = true, value = "")
  @NotNull
  public Object getSeatNumber() {
    return seatNumber;
  }
  public void setSeatNumber(Object seatNumber) {
    this.seatNumber = seatNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceAllEntityAttributesRequest replaceAllEntityAttributesRequest = (ReplaceAllEntityAttributesRequest) o;
    return Objects.equals(temperature, replaceAllEntityAttributesRequest.temperature) &&
        Objects.equals(seatNumber, replaceAllEntityAttributesRequest.seatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperature, seatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceAllEntityAttributesRequest {\n");
    
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
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

