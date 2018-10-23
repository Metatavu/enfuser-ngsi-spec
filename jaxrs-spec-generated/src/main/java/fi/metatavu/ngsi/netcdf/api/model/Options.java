package fi.metatavu.ngsi.netcdf.api.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Options
 */
public enum Options {
  
  COUNT("count"),
  
  KEYVALUES("keyValues"),
  
  VALUES("values"),
  
  UNIQUE("unique");

  private String value;

  Options(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Options fromValue(String text) {
    for (Options b : Options.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


