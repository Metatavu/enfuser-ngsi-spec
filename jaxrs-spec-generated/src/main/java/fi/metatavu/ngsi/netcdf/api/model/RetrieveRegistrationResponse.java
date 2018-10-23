package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class RetrieveRegistrationResponse   {
  
  private @Valid String id = null;
  private @Valid String description = null;
  private @Valid Object dataProvided = null;
  private @Valid Object provider = null;
  private @Valid String expires = null;
  private @Valid String status = null;
  private @Valid Object forwardingInformation = null;

  /**
   * 
   **/
  public RetrieveRegistrationResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "abcdefg", required = true, value = "")
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
  public RetrieveRegistrationResponse description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Example Context Source", required = true, value = "")
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
  public RetrieveRegistrationResponse dataProvided(Object dataProvided) {
    this.dataProvided = dataProvided;
    return this;
  }

  
  @ApiModelProperty(example = "{\"entities\":[{\"id\":\"Bcn_Welt\",\"type\":\"Room\"}],\"attrs\":[\"temperature\"]}", required = true, value = "")
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
  public RetrieveRegistrationResponse provider(Object provider) {
    this.provider = provider;
    return this;
  }

  
  @ApiModelProperty(example = "{\"http\":{\"url\":\"http://contextsource.example.org\"},\"supportedForwardingMode\":\"all\"}", required = true, value = "")
  @NotNull
  public Object getProvider() {
    return provider;
  }
  public void setProvider(Object provider) {
    this.provider = provider;
  }

  /**
   * 
   **/
  public RetrieveRegistrationResponse expires(String expires) {
    this.expires = expires;
    return this;
  }

  
  @ApiModelProperty(example = "10/31/2017 12:00:00 PM", required = true, value = "")
  @NotNull
  public String getExpires() {
    return expires;
  }
  public void setExpires(String expires) {
    this.expires = expires;
  }

  /**
   * 
   **/
  public RetrieveRegistrationResponse status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "failed", required = true, value = "")
  @NotNull
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * 
   **/
  public RetrieveRegistrationResponse forwardingInformation(Object forwardingInformation) {
    this.forwardingInformation = forwardingInformation;
    return this;
  }

  
  @ApiModelProperty(example = "{\"timesSent\":12,\"lastForwarding\":\"2017-10-06T16:00:00Z\",\"lastFailure\":\"2017-10-06T16:00:00Z\",\"lastSuccess\":\"2017-10-05T18:25:00Z\"}", required = true, value = "")
  @NotNull
  public Object getForwardingInformation() {
    return forwardingInformation;
  }
  public void setForwardingInformation(Object forwardingInformation) {
    this.forwardingInformation = forwardingInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveRegistrationResponse retrieveRegistrationResponse = (RetrieveRegistrationResponse) o;
    return Objects.equals(id, retrieveRegistrationResponse.id) &&
        Objects.equals(description, retrieveRegistrationResponse.description) &&
        Objects.equals(dataProvided, retrieveRegistrationResponse.dataProvided) &&
        Objects.equals(provider, retrieveRegistrationResponse.provider) &&
        Objects.equals(expires, retrieveRegistrationResponse.expires) &&
        Objects.equals(status, retrieveRegistrationResponse.status) &&
        Objects.equals(forwardingInformation, retrieveRegistrationResponse.forwardingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, dataProvided, provider, expires, status, forwardingInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveRegistrationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataProvided: ").append(toIndentedString(dataProvided)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    forwardingInformation: ").append(toIndentedString(forwardingInformation)).append("\n");
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

