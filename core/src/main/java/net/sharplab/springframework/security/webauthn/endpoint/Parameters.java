package net.sharplab.springframework.security.webauthn.endpoint;

import java.io.Serializable;
import java.util.Objects;

public class Parameters implements Serializable {

    private String username;
    private String password;
    private String credentialId;
    private String clientDataJSON;
    private String authenticatorData;
    private String signature;
    private String clientExtensionsJSON;

    public Parameters(String username, String password, String credentialId, String clientDataJSON, String authenticatorData, String signature, String clientExtensionsJSON) {
        this.username = username;
        this.password = password;
        this.credentialId = credentialId;
        this.clientDataJSON = clientDataJSON;
        this.authenticatorData = authenticatorData;
        this.signature = signature;
        this.clientExtensionsJSON = clientExtensionsJSON;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCredentialId() {
        return credentialId;
    }

    public String getClientDataJSON() {
        return clientDataJSON;
    }

    public String getAuthenticatorData() {
        return authenticatorData;
    }

    public String getSignature() {
        return signature;
    }

    public String getClientExtensionsJSON() {
        return clientExtensionsJSON;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameters that = (Parameters) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(credentialId, that.credentialId) &&
                Objects.equals(clientDataJSON, that.clientDataJSON) &&
                Objects.equals(authenticatorData, that.authenticatorData) &&
                Objects.equals(signature, that.signature) &&
                Objects.equals(clientExtensionsJSON, that.clientExtensionsJSON);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, password, credentialId, clientDataJSON, authenticatorData, signature, clientExtensionsJSON);
    }
}