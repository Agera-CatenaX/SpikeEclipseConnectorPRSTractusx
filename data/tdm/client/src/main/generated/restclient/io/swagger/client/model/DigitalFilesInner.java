/*
 * Catena-X Speedboat Test Data Generator
 * Disclaimer: This service serves synthetic, none-productive data for testing purposes only. All BOMs, part trees, VINs, serialNos etc. are synthetic
 *
 * OpenAPI spec version: 0.0.1 Speedboat
 * Contact: christian.kabelin@partner.bmw.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DigitalFilesInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2021-10-03T20:34:34.146648200+02:00[Europe/Berlin]")
public class DigitalFilesInner {

  
  @JsonProperty("value")
  private String value = null;
  
  
  @JsonProperty("mimeType")
  private String mimeType = null;
  
  public DigitalFilesInner value(String value) {
    this.value = value;
    return this;
  }

  
  /**
  * Get value
  * @return value
  **/
  
  
  @Schema(description = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }
  
  public DigitalFilesInner mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  
  /**
  * Get mimeType
  * @return mimeType
  **/
  
  
  @Schema(description = "")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalFilesInner digitalFilesInner = (DigitalFilesInner) o;
    return Objects.equals(this.value, digitalFilesInner.value) &&
        Objects.equals(this.mimeType, digitalFilesInner.mimeType);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(value, mimeType);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalFilesInner {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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


