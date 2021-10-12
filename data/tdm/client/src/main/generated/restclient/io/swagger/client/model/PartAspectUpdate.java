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
import io.swagger.client.model.Aspect;
import io.swagger.client.model.PartId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes an update of a part aspect location.
 */@Schema(description = "Describes an update of a part aspect location.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2021-10-03T20:34:34.146648200+02:00[Europe/Berlin]")
public class PartAspectUpdate {

  
  @JsonProperty("effectTime")
  private String effectTime = null;
  
  
  @JsonProperty("part")
  private PartId part = null;
  
  
  @JsonProperty("aspects")
  private List<Aspect> aspects = new ArrayList<>();
  
  
  @JsonProperty("remove")
  private Boolean remove = null;
  
  public PartAspectUpdate effectTime(String effectTime) {
    this.effectTime = effectTime;
    return this;
  }

  
  /**
  * Instant at which the update was applied
  * @return effectTime
  **/
  
  
  @Schema(required = true, description = "Instant at which the update was applied")
  public String getEffectTime() {
    return effectTime;
  }
  public void setEffectTime(String effectTime) {
    this.effectTime = effectTime;
  }
  
  public PartAspectUpdate part(PartId part) {
    this.part = part;
    return this;
  }

  
  /**
  * Get part
  * @return part
  **/
  
  
  @Schema(description = "")
  public PartId getPart() {
    return part;
  }
  public void setPart(PartId part) {
    this.part = part;
  }
  
  public PartAspectUpdate aspects(List<Aspect> aspects) {
    this.aspects = aspects;
    return this;
  }

  public PartAspectUpdate addAspectsItem(Aspect aspectsItem) {
    
    this.aspects.add(aspectsItem);
    return this;
  }
  
  /**
  * Aspect location.
  * @return aspects
  **/
  
  
  @Schema(required = true, description = "Aspect location.")
  public List<Aspect> getAspects() {
    return aspects;
  }
  public void setAspects(List<Aspect> aspects) {
    this.aspects = aspects;
  }
  
  public PartAspectUpdate remove(Boolean remove) {
    this.remove = remove;
    return this;
  }

  
  /**
  * &lt;ul&gt;   &lt;li&gt;TRUE if the aspect URLs are to be deleted from the part&lt;/li&gt;   &lt;li&gt;FALSE otherwise (“normal case” - an aspect URL is added to a part).&lt;/li&gt;&lt;/ul&gt;
  * @return remove
  **/
  
  
  @Schema(description = "<ul>   <li>TRUE if the aspect URLs are to be deleted from the part</li>   <li>FALSE otherwise (“normal case” - an aspect URL is added to a part).</li></ul>")
  public Boolean isRemove() {
    return remove;
  }
  public void setRemove(Boolean remove) {
    this.remove = remove;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartAspectUpdate partAspectUpdate = (PartAspectUpdate) o;
    return Objects.equals(this.effectTime, partAspectUpdate.effectTime) &&
        Objects.equals(this.part, partAspectUpdate.part) &&
        Objects.equals(this.aspects, partAspectUpdate.aspects) &&
        Objects.equals(this.remove, partAspectUpdate.remove);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(effectTime, part, aspects, remove);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartAspectUpdate {\n");
    
    sb.append("    effectTime: ").append(toIndentedString(effectTime)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    aspects: ").append(toIndentedString(aspects)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
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


