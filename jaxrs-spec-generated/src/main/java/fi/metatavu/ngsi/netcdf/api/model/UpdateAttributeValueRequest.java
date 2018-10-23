package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class UpdateAttributeValueRequest   {
  
  private @Valid String address = null;
  private @Valid Integer zipCode = null;
  private @Valid String city = null;
  private @Valid String country = null;

  /**
   * 
   **/
  public UpdateAttributeValueRequest address(String address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(example = "Ronda de la Comunicacion s/n", required = true, value = "")
  @NotNull
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * 
   **/
  public UpdateAttributeValueRequest zipCode(Integer zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  
  @ApiModelProperty(example = "28050", required = true, value = "")
  @NotNull
  public Integer getZipCode() {
    return zipCode;
  }
  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }

  /**
   * 
   **/
  public UpdateAttributeValueRequest city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(example = "Madrid", required = true, value = "")
  @NotNull
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * 
   **/
  public UpdateAttributeValueRequest country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(example = "Spain", required = true, value = "")
  @NotNull
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAttributeValueRequest updateAttributeValueRequest = (UpdateAttributeValueRequest) o;
    return Objects.equals(address, updateAttributeValueRequest.address) &&
        Objects.equals(zipCode, updateAttributeValueRequest.zipCode) &&
        Objects.equals(city, updateAttributeValueRequest.city) &&
        Objects.equals(country, updateAttributeValueRequest.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, zipCode, city, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAttributeValueRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

