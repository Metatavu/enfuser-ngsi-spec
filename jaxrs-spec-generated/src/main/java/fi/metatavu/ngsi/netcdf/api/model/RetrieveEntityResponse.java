package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class RetrieveEntityResponse   {
  
  private @Valid String type = null;
  private @Valid String id = null;
  private @Valid Object temperature = null;
  private @Valid Object humidity = null;
  private @Valid Object location = null;

  /**
   * 
   **/
  public RetrieveEntityResponse type(String type) {
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
  public RetrieveEntityResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "Bcn_Welt", required = true, value = "")
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
  public RetrieveEntityResponse temperature(Object temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "{\"value\":21.7,\"type\":\"Number\"}", required = true, value = "")
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
  public RetrieveEntityResponse humidity(Object humidity) {
    this.humidity = humidity;
    return this;
  }

  
  @ApiModelProperty(example = "{\"value\":60,\"type\":\"Number\"}", required = true, value = "")
  @NotNull
  public Object getHumidity() {
    return humidity;
  }
  public void setHumidity(Object humidity) {
    this.humidity = humidity;
  }

  /**
   * 
   **/
  public RetrieveEntityResponse location(Object location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(example = "{\"value\":\"41.3763726, 2.1864475\",\"type\":\"geo:point\",\"metadata\":{\"crs\":{\"value\":\"WGS84\",\"type\":\"Text\"}}}", required = true, value = "")
  @NotNull
  public Object getLocation() {
    return location;
  }
  public void setLocation(Object location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEntityResponse retrieveEntityResponse = (RetrieveEntityResponse) o;
    return Objects.equals(type, retrieveEntityResponse.type) &&
        Objects.equals(id, retrieveEntityResponse.id) &&
        Objects.equals(temperature, retrieveEntityResponse.temperature) &&
        Objects.equals(humidity, retrieveEntityResponse.humidity) &&
        Objects.equals(location, retrieveEntityResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, temperature, humidity, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEntityResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

