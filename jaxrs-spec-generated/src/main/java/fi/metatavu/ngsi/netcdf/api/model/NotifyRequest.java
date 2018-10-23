package fi.metatavu.ngsi.netcdf.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class NotifyRequest   {
  
  private @Valid String subscriptionId = null;
  private @Valid List<Object> data = new ArrayList<Object>();

  /**
   * 
   **/
  public NotifyRequest subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  
  @ApiModelProperty(example = "5aeb0ee97d4ef10a12a0262f", required = true, value = "")
  @NotNull
  public String getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * 
   **/
  public NotifyRequest data(List<Object> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"type\":\"Room\",\"id\":\"DC_S1-D41\",\"temperature\":{\"value\":35.6,\"type\":\"Number\"}},{\"type\":\"Room\",\"id\":\"Boe-Idearium\",\"temperature\":{\"value\":22.5,\"type\":\"Number\"}}]", required = true, value = "")
  @NotNull
  public List<Object> getData() {
    return data;
  }
  public void setData(List<Object> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyRequest notifyRequest = (NotifyRequest) o;
    return Objects.equals(subscriptionId, notifyRequest.subscriptionId) &&
        Objects.equals(data, notifyRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyRequest {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

