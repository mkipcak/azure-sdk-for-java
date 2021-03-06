/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DeploymentMode.
 */
public final class DeploymentMode extends ExpandableStringEnum<DeploymentMode> {
    /** Static value NotSpecified for DeploymentMode. */
    public static final DeploymentMode NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Incremental for DeploymentMode. */
    public static final DeploymentMode INCREMENTAL = fromString("Incremental");

    /** Static value Complete for DeploymentMode. */
    public static final DeploymentMode COMPLETE = fromString("Complete");

    /**
     * Creates or finds a DeploymentMode from its string representation.
     * @param name a name to look for
     * @return the corresponding DeploymentMode
     */
    @JsonCreator
    public static DeploymentMode fromString(String name) {
        return fromString(name, DeploymentMode.class);
    }

    /**
     * @return known DeploymentMode values
     */
    public static Collection<DeploymentMode> values() {
        return values(DeploymentMode.class);
    }
}
