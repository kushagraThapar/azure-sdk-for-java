/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Replace all IP firewall rules request.
 */
public class ReplaceAllIpFirewallRulesRequest {
    /**
     * IP firewall rule properties.
     */
    @JsonProperty(value = "ipFirewallRules")
    private Map<String, IpFirewallRuleProperties> ipFirewallRules;

    /**
     * Get iP firewall rule properties.
     *
     * @return the ipFirewallRules value
     */
    public Map<String, IpFirewallRuleProperties> ipFirewallRules() {
        return this.ipFirewallRules;
    }

    /**
     * Set iP firewall rule properties.
     *
     * @param ipFirewallRules the ipFirewallRules value to set
     * @return the ReplaceAllIpFirewallRulesRequest object itself.
     */
    public ReplaceAllIpFirewallRulesRequest withIpFirewallRules(Map<String, IpFirewallRuleProperties> ipFirewallRules) {
        this.ipFirewallRules = ipFirewallRules;
        return this;
    }

}
