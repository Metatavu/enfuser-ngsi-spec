package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class RetrieveEntityAttributesResponse   {
  
  private @Valid Object temperature = null;
  private @Valid Object humidity = null;
  private @Valid Object location = null;

  /**
   * 
   **/
  public RetrieveEntityAttributesResponse temperature(Object temperature) {
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
  public RetrieveEntityAttributesResponse humidity(Object humidity) {
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
  public RetrieveEntityAttributesResponse location(Object location) {
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
    RetrieveEntityAttributesResponse retrieveEntityAttributesResponse = (RetrieveEntityAttributesResponse) o;
    return Objects.equals(temperature, retrieveEntityAttributesResponse.temperature) &&
        Objects.equals(humidity, retrieveEntityAttributesResponse.humidity) &&
        Objects.equals(location, retrieveEntityAttributesResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperature, humidity, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEntityAttributesResponse {\n");
    
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

