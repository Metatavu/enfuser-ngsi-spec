package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class ListEntitiesResponse   {
  
  private @Valid String type = null;
  private @Valid String id = null;
  private @Valid Object temperature = null;
  private @Valid Object speed = null;

  /**
   * 
   **/
  public ListEntitiesResponse type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "Room", required = true, value = "")
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
  public ListEntitiesResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "DC_S1-D41", required = true, value = "")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   **/
  public ListEntitiesResponse temperature(Object temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "{\"value\":35.6,\"type\":\"Number\",\"metadata\":{}}", value = "")
  public Object getTemperature() {
    return temperature;
  }
  public void setTemperature(Object temperature) {
    this.temperature = temperature;
  }

  /**
   * 
   **/
  public ListEntitiesResponse speed(Object speed) {
    this.speed = speed;
    return this;
  }

  
  @ApiModelProperty(example = "{\"value\":100,\"type\":\"number\",\"metadata\":{\"accuracy\":{\"value\":2,\"type\":\"Number\"},\"timestamp\":{\"value\":\"2015-06-04T07:20:27.378Z\",\"type\":\"DateTime\"}}}", value = "")
  public Object getSpeed() {
    return speed;
  }
  public void setSpeed(Object speed) {
    this.speed = speed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEntitiesResponse listEntitiesResponse = (ListEntitiesResponse) o;
    return Objects.equals(type, listEntitiesResponse.type) &&
        Objects.equals(id, listEntitiesResponse.id) &&
        Objects.equals(temperature, listEntitiesResponse.temperature) &&
        Objects.equals(speed, listEntitiesResponse.speed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, temperature, speed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEntitiesResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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

