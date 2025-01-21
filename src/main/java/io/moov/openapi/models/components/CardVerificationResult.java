/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum CardVerificationResult {
    NO_MATCH("noMatch"),
    MATCH("match"),
    NOT_CHECKED("notChecked"),
    UNAVAILABLE("unavailable"),
    PARTIAL_MATCH("partialMatch");

    @JsonValue
    private final String value;

    private CardVerificationResult(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CardVerificationResult> fromValue(String value) {
        for (CardVerificationResult o: CardVerificationResult.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
