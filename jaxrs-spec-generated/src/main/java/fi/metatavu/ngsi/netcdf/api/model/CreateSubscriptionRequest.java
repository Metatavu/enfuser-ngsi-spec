package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class CreateSubscriptionRequest   {
  
  private @Valid String description = null;
  private @Valid Object subject = null;
  private @Valid Object notification = null;
  private @Valid String expires = null;
  private @Valid Integer throttling = null;

  /**
   * 
   **/
  public CreateSubscriptionRequest description(String description) {
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
  public CreateSubscriptionRequest subject(Object subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(example = "{\"entities\":[{\"idPattern\":\".*\",\"type\":\"Room\"}],\"condition\":{\"attrs\":[\"temperature\"],\"expression\":{\"q\":\"temperature>40\"}}}", required = true, value = "")
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
  public CreateSubscriptionRequest notification(Object notification) {
    this.notification = notification;
    return this;
  }

  
  @ApiModelProperty(example = "{\"http\":{\"url\":\"http://localhost:1234\"},\"attrs\":[\"temperature\",\"humidity\"]}", required = true, value = "")
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
  public CreateSubscriptionRequest expires(String expires) {
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
  public CreateSubscriptionRequest throttling(Integer throttling) {
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
    CreateSubscriptionRequest createSubscriptionRequest = (CreateSubscriptionRequest) o;
    return Objects.equals(description, createSubscriptionRequest.description) &&
        Objects.equals(subject, createSubscriptionRequest.subject) &&
        Objects.equals(notification, createSubscriptionRequest.notification) &&
        Objects.equals(expires, createSubscriptionRequest.expires) &&
        Objects.equals(throttling, createSubscriptionRequest.throttling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, subject, notification, expires, throttling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

