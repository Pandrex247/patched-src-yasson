/*******************************************************************************
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Roman Grigoriadi
 ******************************************************************************/

package org.eclipse.yasson.customization.model;

import javax.json.bind.annotation.JsonbProperty;

/**
 * @author Roman Grigoriadi
 */
public class JsonbPropertyNillable {

    @JsonbProperty(nillable = true)
    private String nullField;

    @JsonbProperty(nillable = false)
    private String nillableOverride;

    public String getNullField() {
        return nullField;
    }

    public void setNullField(String nullField) {
        this.nullField = nullField;
    }

    @JsonbProperty(nillable = true)
    public String getNillableOverride() {
        return nillableOverride;
    }

    public void setNillableOverride(String nillableOverride) {
        this.nillableOverride = nillableOverride;
    }
}
