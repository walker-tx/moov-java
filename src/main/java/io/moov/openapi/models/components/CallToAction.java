/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * CallToAction - The text to be displayed on web form's submit button.
 * 
 * If set to "auto" the UI will automatically select between 
 * "pay" and "confirm" for payments and payouts respectively.
 */
public enum CallToAction {
    PAY("pay"),
    BOOK("book"),
    SUBSCRIBE("subscribe"),
    DONATE("donate"),
    CONFIRM("confirm"),
    AUTO("auto");

    @JsonValue
    private final String value;

    private CallToAction(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CallToAction> fromValue(String value) {
        for (CallToAction o: CallToAction.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
