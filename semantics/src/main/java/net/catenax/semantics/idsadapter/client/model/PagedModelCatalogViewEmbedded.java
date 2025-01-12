/*
 * Dataspace Connector
 * IDS Connector originally developed by the Fraunhofer ISST
 *
 * OpenAPI spec version: 6.2.0
 * Contact: info@dataspace-connector.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.catenax.semantics.idsadapter.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import net.catenax.semantics.idsadapter.client.model.CatalogView;

import java.util.ArrayList;
import java.util.List;
/**
 * PagedModelCatalogViewEmbedded
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-08T16:15:16.333286600+02:00[Europe/Berlin]")
public class PagedModelCatalogViewEmbedded {
  @JsonProperty("catalogs")
  private List<CatalogView> catalogs = null;

  public PagedModelCatalogViewEmbedded catalogs(List<CatalogView> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public PagedModelCatalogViewEmbedded addCatalogsItem(CatalogView catalogsItem) {
    if (this.catalogs == null) {
      this.catalogs = new ArrayList<>();
    }
    this.catalogs.add(catalogsItem);
    return this;
  }

   /**
   * Get catalogs
   * @return catalogs
  **/
  @Schema(description = "")
  public List<CatalogView> getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(List<CatalogView> catalogs) {
    this.catalogs = catalogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedModelCatalogViewEmbedded pagedModelCatalogViewEmbedded = (PagedModelCatalogViewEmbedded) o;
    return Objects.equals(this.catalogs, pagedModelCatalogViewEmbedded.catalogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedModelCatalogViewEmbedded {\n");
    
    sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
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
