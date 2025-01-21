/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.utils.SpeakeasyMetadata;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class DeleteDisputeEvidenceFileSecurity {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic")
    private Optional<? extends SchemeBasicAuth> basicAuth;

    @SpeakeasyMetadata("security:scheme=true,type=oauth2,name=Authorization")
    private Optional<String> oAuth2Auth;

    @JsonCreator
    public DeleteDisputeEvidenceFileSecurity(
            Optional<? extends SchemeBasicAuth> basicAuth,
            Optional<String> oAuth2Auth) {
        Utils.checkNotNull(basicAuth, "basicAuth");
        Utils.checkNotNull(oAuth2Auth, "oAuth2Auth");
        this.basicAuth = basicAuth;
        this.oAuth2Auth = oAuth2Auth;
    }
    
    public DeleteDisputeEvidenceFileSecurity() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SchemeBasicAuth> basicAuth() {
        return (Optional<SchemeBasicAuth>) basicAuth;
    }

    @JsonIgnore
    public Optional<String> oAuth2Auth() {
        return oAuth2Auth;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeleteDisputeEvidenceFileSecurity withBasicAuth(SchemeBasicAuth basicAuth) {
        Utils.checkNotNull(basicAuth, "basicAuth");
        this.basicAuth = Optional.ofNullable(basicAuth);
        return this;
    }

    public DeleteDisputeEvidenceFileSecurity withBasicAuth(Optional<? extends SchemeBasicAuth> basicAuth) {
        Utils.checkNotNull(basicAuth, "basicAuth");
        this.basicAuth = basicAuth;
        return this;
    }

    public DeleteDisputeEvidenceFileSecurity withOAuth2Auth(String oAuth2Auth) {
        Utils.checkNotNull(oAuth2Auth, "oAuth2Auth");
        this.oAuth2Auth = Optional.ofNullable(oAuth2Auth);
        return this;
    }

    public DeleteDisputeEvidenceFileSecurity withOAuth2Auth(Optional<String> oAuth2Auth) {
        Utils.checkNotNull(oAuth2Auth, "oAuth2Auth");
        this.oAuth2Auth = oAuth2Auth;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDisputeEvidenceFileSecurity other = (DeleteDisputeEvidenceFileSecurity) o;
        return 
            Objects.deepEquals(this.basicAuth, other.basicAuth) &&
            Objects.deepEquals(this.oAuth2Auth, other.oAuth2Auth);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            basicAuth,
            oAuth2Auth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteDisputeEvidenceFileSecurity.class,
                "basicAuth", basicAuth,
                "oAuth2Auth", oAuth2Auth);
    }
    
    public final static class Builder {
 
        private Optional<? extends SchemeBasicAuth> basicAuth = Optional.empty();
 
        private Optional<String> oAuth2Auth = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder basicAuth(SchemeBasicAuth basicAuth) {
            Utils.checkNotNull(basicAuth, "basicAuth");
            this.basicAuth = Optional.ofNullable(basicAuth);
            return this;
        }

        public Builder basicAuth(Optional<? extends SchemeBasicAuth> basicAuth) {
            Utils.checkNotNull(basicAuth, "basicAuth");
            this.basicAuth = basicAuth;
            return this;
        }

        public Builder oAuth2Auth(String oAuth2Auth) {
            Utils.checkNotNull(oAuth2Auth, "oAuth2Auth");
            this.oAuth2Auth = Optional.ofNullable(oAuth2Auth);
            return this;
        }

        public Builder oAuth2Auth(Optional<String> oAuth2Auth) {
            Utils.checkNotNull(oAuth2Auth, "oAuth2Auth");
            this.oAuth2Auth = oAuth2Auth;
            return this;
        }
        
        public DeleteDisputeEvidenceFileSecurity build() {
            return new DeleteDisputeEvidenceFileSecurity(
                basicAuth,
                oAuth2Auth);
        }
    }
}

