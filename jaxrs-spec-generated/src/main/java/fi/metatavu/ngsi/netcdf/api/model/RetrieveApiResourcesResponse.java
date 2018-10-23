package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class RetrieveApiResourcesResponse   {
  
  private @Valid String entitiesUrl = null;
  private @Valid String typesUrl = null;
  private @Valid String subscriptionsUrl = null;
  private @Valid String registrationsUrl = null;

  /**
   * URL which points to the entities resource
   **/
  public RetrieveApiResourcesResponse entitiesUrl(String entitiesUrl) {
    this.entitiesUrl = entitiesUrl;
    return this;
  }

  
  @ApiModelProperty(example = "/v2/entities", required = true, value = "URL which points to the entities resource")
  @NotNull
  public String getEntitiesUrl() {
    return entitiesUrl;
  }
  public void setEntitiesUrl(String entitiesUrl) {
    this.entitiesUrl = entitiesUrl;
  }

  /**
   * URL which points to the types resource
   **/
  public RetrieveApiResourcesResponse typesUrl(String typesUrl) {
    this.typesUrl = typesUrl;
    return this;
  }

  
  @ApiModelProperty(example = "/v2/types", required = true, value = "URL which points to the types resource")
  @NotNull
  public String getTypesUrl() {
    return typesUrl;
  }
  public void setTypesUrl(String typesUrl) {
    this.typesUrl = typesUrl;
  }

  /**
   * URL which points to the subscriptions resource
   **/
  public RetrieveApiResourcesResponse subscriptionsUrl(String subscriptionsUrl) {
    this.subscriptionsUrl = subscriptionsUrl;
    return this;
  }

  
  @ApiModelProperty(example = "/v2/subscriptions", required = true, value = "URL which points to the subscriptions resource")
  @NotNull
  public String getSubscriptionsUrl() {
    return subscriptionsUrl;
  }
  public void setSubscriptionsUrl(String subscriptionsUrl) {
    this.subscriptionsUrl = subscriptionsUrl;
  }

  /**
   * URL which points to the registrations resource
   **/
  public RetrieveApiResourcesResponse registrationsUrl(String registrationsUrl) {
    this.registrationsUrl = registrationsUrl;
    return this;
  }

  
  @ApiModelProperty(example = "/v2/registrations", required = true, value = "URL which points to the registrations resource")
  @NotNull
  public String getRegistrationsUrl() {
    return registrationsUrl;
  }
  public void setRegistrationsUrl(String registrationsUrl) {
    this.registrationsUrl = registrationsUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveApiResourcesResponse retrieveApiResourcesResponse = (RetrieveApiResourcesResponse) o;
    return Objects.equals(entitiesUrl, retrieveApiResourcesResponse.entitiesUrl) &&
        Objects.equals(typesUrl, retrieveApiResourcesResponse.typesUrl) &&
        Objects.equals(subscriptionsUrl, retrieveApiResourcesResponse.subscriptionsUrl) &&
        Objects.equals(registrationsUrl, retrieveApiResourcesResponse.registrationsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesUrl, typesUrl, subscriptionsUrl, registrationsUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveApiResourcesResponse {\n");
    
    sb.append("    entitiesUrl: ").append(toIndentedString(entitiesUrl)).append("\n");
    sb.append("    typesUrl: ").append(toIndentedString(typesUrl)).append("\n");
    sb.append("    subscriptionsUrl: ").append(toIndentedString(subscriptionsUrl)).append("\n");
    sb.append("    registrationsUrl: ").append(toIndentedString(registrationsUrl)).append("\n");
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

