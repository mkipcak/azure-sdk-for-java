// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Disallowed model. */
@Fluent
public final class Disallowed {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Disallowed.class);

    /*
     * A list of disk types.
     */
    @JsonProperty(value = "diskTypes")
    private List<String> diskTypes;

    /**
     * Get the diskTypes property: A list of disk types.
     *
     * @return the diskTypes value.
     */
    public List<String> diskTypes() {
        return this.diskTypes;
    }

    /**
     * Set the diskTypes property: A list of disk types.
     *
     * @param diskTypes the diskTypes value to set.
     * @return the Disallowed object itself.
     */
    public Disallowed withDiskTypes(List<String> diskTypes) {
        this.diskTypes = diskTypes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
