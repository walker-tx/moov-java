/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Versions - Moov API versions. Version strings are formatted as `vYYYY.MM.DD`, except preVerioned and latest.
 */
public enum Versions {
    V20240000("v2024.00.00"),
    LATEST("latest");

    @JsonValue
    private final String value;

    private Versions(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Versions> fromValue(String value) {
        for (Versions o: Versions.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
