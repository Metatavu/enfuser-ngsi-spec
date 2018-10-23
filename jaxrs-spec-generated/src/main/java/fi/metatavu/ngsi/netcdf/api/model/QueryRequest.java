package fi.metatavu.ngsi.netcdf.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class QueryRequest   {
  
  private @Valid List<Object> entities = new ArrayList<Object>();
  private @Valid List<String> attrs = new ArrayList<String>();
  private @Valid Object expression = null;
  private @Valid List<String> metadata = new ArrayList<String>();

  /**
   * 
   **/
  public QueryRequest entities(List<Object> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"idPattern\":\".*\",\"type\":\"Room\"},{\"id\":\"Car\",\"type\":\"P-9873-K\"}]", required = true, value = "")
  @NotNull
  public List<Object> getEntities() {
    return entities;
  }
  public void setEntities(List<Object> entities) {
    this.entities = entities;
  }

  /**
   * 
   **/
  public QueryRequest attrs(List<String> attrs) {
    this.attrs = attrs;
    return this;
  }

  
  @ApiModelProperty(example = "[\"temperature\",\"humidity\"]", required = true, value = "")
  @NotNull
  public List<String> getAttrs() {
    return attrs;
  }
  public void setAttrs(List<String> attrs) {
    this.attrs = attrs;
  }

  /**
   * 
   **/
  public QueryRequest expression(Object expression) {
    this.expression = expression;
    return this;
  }

  
  @ApiModelProperty(example = "{\"q\":\"temperature>20\"}", required = true, value = "")
  @NotNull
  public Object getExpression() {
    return expression;
  }
  public void setExpression(Object expression) {
    this.expression = expression;
  }

  /**
   * 
   **/
  public QueryRequest metadata(List<String> metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(example = "[\"accuracy\",\"timestamp\"]", required = true, value = "")
  @NotNull
  public List<String> getMetadata() {
    return metadata;
  }
  public void setMetadata(List<String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRequest queryRequest = (QueryRequest) o;
    return Objects.equals(entities, queryRequest.entities) &&
        Objects.equals(attrs, queryRequest.attrs) &&
        Objects.equals(expression, queryRequest.expression) &&
        Objects.equals(metadata, queryRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, attrs, expression, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRequest {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

