package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class CreateRegistrationRequest   {
  
  private @Valid String description = null;
  private @Valid Object dataProvided = null;
  private @Valid Object provider = null;

  /**
   * 
   **/
  public CreateRegistrationRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Relative Humidity Context Source", required = true, value = "")
  @NotNull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * 
   **/
  public CreateRegistrationRequest dataProvided(Object dataProvided) {
    this.dataProvided = dataProvided;
    return this;
  }

  
  @ApiModelProperty(example = "{\"entities\":[{\"id\":\"room2\",\"type\":\"Room\"}],\"attrs\":[\"relativeHumidity\"]}", required = true, value = "")
  @NotNull
  public Object getDataProvided() {
    return dataProvided;
  }
  public void setDataProvided(Object dataProvided) {
    this.dataProvided = dataProvided;
  }

  /**
   * 
   **/
  public CreateRegistrationRequest provider(Object provider) {
    this.provider = provider;
    return this;
  }

  
  @ApiModelProperty(example = "{\"http\":{\"url\":\"http://localhost:1234\"}}", required = true, value = "")
  @NotNull
  public Object getProvider() {
    return provider;
  }
  public void setProvider(Object provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRegistrationRequest createRegistrationRequest = (CreateRegistrationRequest) o;
    return Objects.equals(description, createRegistrationRequest.description) &&
        Objects.equals(dataProvided, createRegistrationRequest.dataProvided) &&
        Objects.equals(provider, createRegistrationRequest.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dataProvided, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRegistrationRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataProvided: ").append(toIndentedString(dataProvided)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

