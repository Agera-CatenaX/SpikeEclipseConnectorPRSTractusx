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
 * ReturnRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2021-10-13T14:06:31.566694+02:00[Europe/Zurich]")
public class ReturnRequest {

  
  @JsonProperty("return")
  private Boolean _return = null;
  
  public ReturnRequest _return(Boolean _return) {
    this._return = _return;
    return this;
  }

  
  /**
  * Get _return
  * @return _return
  **/
  
  
  @Schema(required = true, description = "")
  public Boolean getReturn() {
    return _return;
  }
  public void setReturn(Boolean _return) {
    this._return = _return;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnRequest returnRequest = (ReturnRequest) o;
    return Objects.equals(this._return, returnRequest._return);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(_return);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnRequest {\n");
    
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
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



