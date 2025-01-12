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
import net.catenax.semantics.idsadapter.client.model.AppEndpointView;

import java.util.ArrayList;
import java.util.List;
/**
 * PagedModelAppEndpointViewEmbedded
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-08T16:15:16.333286600+02:00[Europe/Berlin]")
public class PagedModelAppEndpointViewEmbedded {
  @JsonProperty("endpoints")
  private List<AppEndpointView> endpoints = null;

  public PagedModelAppEndpointViewEmbedded endpoints(List<AppEndpointView> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public PagedModelAppEndpointViewEmbedded addEndpointsItem(AppEndpointView endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @Schema(description = "")
  public List<AppEndpointView> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<AppEndpointView> endpoints) {
    this.endpoints = endpoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedModelAppEndpointViewEmbedded pagedModelAppEndpointViewEmbedded = (PagedModelAppEndpointViewEmbedded) o;
    return Objects.equals(this.endpoints, pagedModelAppEndpointViewEmbedded.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedModelAppEndpointViewEmbedded {\n");
    
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
