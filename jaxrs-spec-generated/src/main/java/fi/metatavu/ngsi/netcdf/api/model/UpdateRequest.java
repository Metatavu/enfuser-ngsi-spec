package fi.metatavu.ngsi.netcdf.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class UpdateRequest   {
  
  private @Valid String actionType = null;
  private @Valid List<Object> entities = new ArrayList<Object>();

  /**
   * 
   **/
  public UpdateRequest actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

  
  @ApiModelProperty(example = "append", required = true, value = "")
  @NotNull
  public String getActionType() {
    return actionType;
  }
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  /**
   * 
   **/
  public UpdateRequest entities(List<Object> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"type\":\"Room\",\"id\":\"Bcn-Welt\",\"temperature\":{\"value\":21.7},\"humidity\":{\"value\":60}},{\"type\":\"Room\",\"id\":\"Mad_Aud\",\"temperature\":{\"value\":22.9},\"humidity\":{\"value\":85}}]", required = true, value = "")
  @NotNull
  public List<Object> getEntities() {
    return entities;
  }
  public void setEntities(List<Object> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRequest updateRequest = (UpdateRequest) o;
    return Objects.equals(actionType, updateRequest.actionType) &&
        Objects.equals(entities, updateRequest.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRequest {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

