/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum AchCreditSameDayPaymentMethodPaymentMethodType {
    ACH_CREDIT_SAME_DAY("ach-credit-same-day");

    @JsonValue
    private final String value;

    private AchCreditSameDayPaymentMethodPaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AchCreditSameDayPaymentMethodPaymentMethodType> fromValue(String value) {
        for (AchCreditSameDayPaymentMethodPaymentMethodType o: AchCreditSameDayPaymentMethodPaymentMethodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
