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
import io.swagger.client.model.PartIndividualDataCharacteristic;
import io.swagger.client.model.PartStaticDataCharacteristic;
import io.swagger.client.model.PartTreeParentCharacteristic;
import io.swagger.client.model.PartUniqueDataCharacteristic;
import io.swagger.client.model.QualityAlertDataCharacteristic;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Traceability
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2021-10-13T14:06:31.566694+02:00[Europe/Zurich]")
public class Traceability {

  
  @JsonProperty("staticData")
  private PartStaticDataCharacteristic staticData = null;
  
  
  @JsonProperty("uniqueData")
  private PartUniqueDataCharacteristic uniqueData = null;
  
  
  @JsonProperty("individualData")
  private PartIndividualDataCharacteristic individualData = null;
  
  
  @JsonProperty("supplierTree")
  private PartTreeParentCharacteristic supplierTree = null;
  
  
  @JsonProperty("partTree")
  private PartTreeParentCharacteristic partTree = null;
  
  
  @JsonProperty("qualityAlertData")
  private QualityAlertDataCharacteristic qualityAlertData = null;
  
  public Traceability staticData(PartStaticDataCharacteristic staticData) {
    this.staticData = staticData;
    return this;
  }

  
  /**
  * Get staticData
  * @return staticData
  **/
  
  
  @Schema(required = true, description = "")
  public PartStaticDataCharacteristic getStaticData() {
    return staticData;
  }
  public void setStaticData(PartStaticDataCharacteristic staticData) {
    this.staticData = staticData;
  }
  
  public Traceability uniqueData(PartUniqueDataCharacteristic uniqueData) {
    this.uniqueData = uniqueData;
    return this;
  }

  
  /**
  * Get uniqueData
  * @return uniqueData
  **/
  
  
  @Schema(required = true, description = "")
  public PartUniqueDataCharacteristic getUniqueData() {
    return uniqueData;
  }
  public void setUniqueData(PartUniqueDataCharacteristic uniqueData) {
    this.uniqueData = uniqueData;
  }
  
  public Traceability individualData(PartIndividualDataCharacteristic individualData) {
    this.individualData = individualData;
    return this;
  }

  
  /**
  * Get individualData
  * @return individualData
  **/
  
  
  @Schema(required = true, description = "")
  public PartIndividualDataCharacteristic getIndividualData() {
    return individualData;
  }
  public void setIndividualData(PartIndividualDataCharacteristic individualData) {
    this.individualData = individualData;
  }
  
  public Traceability supplierTree(PartTreeParentCharacteristic supplierTree) {
    this.supplierTree = supplierTree;
    return this;
  }

  
  /**
  * Get supplierTree
  * @return supplierTree
  **/
  
  
  @Schema(required = true, description = "")
  public PartTreeParentCharacteristic getSupplierTree() {
    return supplierTree;
  }
  public void setSupplierTree(PartTreeParentCharacteristic supplierTree) {
    this.supplierTree = supplierTree;
  }
  
  public Traceability partTree(PartTreeParentCharacteristic partTree) {
    this.partTree = partTree;
    return this;
  }

  
  /**
  * Get partTree
  * @return partTree
  **/
  
  
  @Schema(required = true, description = "")
  public PartTreeParentCharacteristic getPartTree() {
    return partTree;
  }
  public void setPartTree(PartTreeParentCharacteristic partTree) {
    this.partTree = partTree;
  }
  
  public Traceability qualityAlertData(QualityAlertDataCharacteristic qualityAlertData) {
    this.qualityAlertData = qualityAlertData;
    return this;
  }

  
  /**
  * Get qualityAlertData
  * @return qualityAlertData
  **/
  
  
  @Schema(required = true, description = "")
  public QualityAlertDataCharacteristic getQualityAlertData() {
    return qualityAlertData;
  }
  public void setQualityAlertData(QualityAlertDataCharacteristic qualityAlertData) {
    this.qualityAlertData = qualityAlertData;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Traceability traceability = (Traceability) o;
    return Objects.equals(this.staticData, traceability.staticData) &&
        Objects.equals(this.uniqueData, traceability.uniqueData) &&
        Objects.equals(this.individualData, traceability.individualData) &&
        Objects.equals(this.supplierTree, traceability.supplierTree) &&
        Objects.equals(this.partTree, traceability.partTree) &&
        Objects.equals(this.qualityAlertData, traceability.qualityAlertData);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(staticData, uniqueData, individualData, supplierTree, partTree, qualityAlertData);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Traceability {\n");
    
    sb.append("    staticData: ").append(toIndentedString(staticData)).append("\n");
    sb.append("    uniqueData: ").append(toIndentedString(uniqueData)).append("\n");
    sb.append("    individualData: ").append(toIndentedString(individualData)).append("\n");
    sb.append("    supplierTree: ").append(toIndentedString(supplierTree)).append("\n");
    sb.append("    partTree: ").append(toIndentedString(partTree)).append("\n");
    sb.append("    qualityAlertData: ").append(toIndentedString(qualityAlertData)).append("\n");
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



