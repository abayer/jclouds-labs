/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.azure.management.domain.role.conf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jclouds.azure.management.domain.role.Protocol;

@XmlRootElement(name = "InputEndpoint")
public class InputEndpoint {

   /**
	 * 
	 */
   @XmlElement(name = "EnableDirectServerReturn")
   private Boolean enableDirectServerReturn;

   /**
    * Specifies a name for a set of load-balanced endpoints. Specifying this element for a given
    * endpoint adds it to the set.
    */
   @XmlElement(required = true, name = "LoadBalancedEndpointSetName")
   private String loadBalancedEndpointSetName;

   /**
    * Specifies the internal port on which the virtual machine is listening to serve the endpoint.
    */
   @XmlElement(required = true, name = "LocalPort")
   private Integer localPort;

   /**
    * Specifies the name for the external endpoint.
    */
   @XmlElement(required = true, name = "Name")
   private String name;

   /**
    * Specifies the external port to use for the endpoint.
    */
   @XmlElement(required = true, name = "Port")
   private Integer port;

   @XmlElement(name = "LoadBalancerProbe")
   private LoadBalancerProbe loadBalancerProbe;

   @XmlElement(name = "Protocol")
   private Protocol protocol;

   @XmlElement(name = "Vip")
   private String vip;

   public InputEndpoint() {
   }

   public Boolean getEnableDirectServerReturn() {
      return enableDirectServerReturn;
   }

   public void setEnableDirectServerReturn(Boolean enableDirectServerReturn) {
      this.enableDirectServerReturn = enableDirectServerReturn;
   }

   public String getLoadBalancedEndpointSetName() {
      return loadBalancedEndpointSetName;
   }

   public void setLoadBalancedEndpointSetName(String loadBalancedEndpointSetName) {
      this.loadBalancedEndpointSetName = loadBalancedEndpointSetName;
   }

   public Integer getLocalPort() {
      return localPort;
   }

   public void setLocalPort(Integer localPort) {
      this.localPort = localPort;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getPort() {
      return port;
   }

   public void setPort(Integer port) {
      this.port = port;
   }

   public LoadBalancerProbe getLoadBalancerProbe() {
      return loadBalancerProbe;
   }

   public void setLoadBalancerProbe(LoadBalancerProbe loadBalancerProbe) {
      this.loadBalancerProbe = loadBalancerProbe;
   }

   public Protocol getProtocol() {
      return protocol;
   }

   public void setProtocol(Protocol protocol) {
      this.protocol = protocol;
   }

   public String getVip() {
      return vip;
   }

   public void setVip(String vip) {
      this.vip = vip;
   }

   @Override
   public String toString() {
      return "InputEndpoint [enableDirectServerReturn=" + enableDirectServerReturn + ", loadBalancedEndpointSetName="
               + loadBalancedEndpointSetName + ", localPort=" + localPort + ", name=" + name + ", port=" + port
               + ", loadBalancerProbe=" + loadBalancerProbe + ", protocol=" + protocol + ", vip=" + vip + "]";
   }

}
