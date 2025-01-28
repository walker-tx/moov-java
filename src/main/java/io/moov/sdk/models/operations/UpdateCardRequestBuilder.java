/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.UpdateCard;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateCardRequestBuilder {

    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String cardID;
    private UpdateCard updateCard;
    private final SDKMethodInterfaces.MethodCallUpdateCard sdk;

    public UpdateCardRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCard sdk) {
        this.sdk = sdk;
    }
                
    public UpdateCardRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public UpdateCardRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public UpdateCardRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateCardRequestBuilder cardID(String cardID) {
        Utils.checkNotNull(cardID, "cardID");
        this.cardID = cardID;
        return this;
    }

    public UpdateCardRequestBuilder updateCard(UpdateCard updateCard) {
        Utils.checkNotNull(updateCard, "updateCard");
        this.updateCard = updateCard;
        return this;
    }

    public UpdateCardResponse call() throws Exception {

        return sdk.update(
            xMoovVersion,
            accountID,
            cardID,
            updateCard);
    }
}
