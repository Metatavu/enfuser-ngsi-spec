package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class ListSubscriptionsResponse   {
  
  private @Valid String id = null;
  private @Valid String description = null;
  private @Valid Object subject = null;
  private @Valid Object notification = null;
  private @Valid String expires = null;
  private @Valid String status = null;
  private @Valid Integer throttling = null;

  /**
   * 
   **/
  public ListSubscriptionsResponse id(String id) {
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
  public ListSubscriptionsResponse description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "One subscription to rule them all", required = true, value = "")
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
  public ListSubscriptionsResponse subject(Object subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(example = "{\"entities\":[{\"id\":\"Bcn_Welt\",\"type\":\"Room\"}],\"condition\":{\"attrs\":[\"temperature \"],\"expression\":{\"q\":\"temperature>40\"}}}", required = true, value = "")
  @NotNull
  public Object getSubject() {
    return subject;
  }
  public void setSubject(Object subject) {
    this.subject = subject;
  }

  /**
   * 
   **/
  public ListSubscriptionsResponse notification(Object notification) {
    this.notification = notification;
    return this;
  }

  
  @ApiModelProperty(example = "{\"httpCustom\":{\"url\":\"http://localhost:1234\",\"headers\":{\"X-MyHeader\":\"foo\"},\"qs\":{\"authToken\":\"bar\"}},\"attrsFormat\":\"keyValues\",\"attrs\":[\"temperature\",\"humidity\"],\"timesSent\":12,\"lastNotification\":\"2015-10-05T16:00:00Z\",\"lastFailure\":\"2015-10-06T16:00:00Z\"}", required = true, value = "")
  @NotNull
  public Object getNotification() {
    return notification;
  }
  public void setNotification(Object notification) {
    this.notification = notification;
  }

  /**
   * 
   **/
  public ListSubscriptionsResponse expires(String expires) {
    this.expires = expires;
    return this;
  }

  
  @ApiModelProperty(example = "4/5/2016 2:00:00 PM", required = true, value = "")
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
  public ListSubscriptionsResponse status(String status) {
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
  public ListSubscriptionsResponse throttling(Integer throttling) {
    this.throttling = throttling;
    return this;
  }

  
  @ApiModelProperty(example = "5", required = true, value = "")
  @NotNull
  public Integer getThrottling() {
    return throttling;
  }
  public void setThrottling(Integer throttling) {
    this.throttling = throttling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSubscriptionsResponse listSubscriptionsResponse = (ListSubscriptionsResponse) o;
    return Objects.equals(id, listSubscriptionsResponse.id) &&
        Objects.equals(description, listSubscriptionsResponse.description) &&
        Objects.equals(subject, listSubscriptionsResponse.subject) &&
        Objects.equals(notification, listSubscriptionsResponse.notification) &&
        Objects.equals(expires, listSubscriptionsResponse.expires) &&
        Objects.equals(status, listSubscriptionsResponse.status) &&
        Objects.equals(throttling, listSubscriptionsResponse.throttling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, subject, notification, expires, status, throttling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSubscriptionsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    throttling: ").append(toIndentedString(throttling)).append("\n");
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

