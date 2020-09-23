package org.springframework.samples.petclinic;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public class PetClinicConfiguration {
    private String techSupportContact;
    private String apiToken;
    private String oauthSecret;
    private String name;
    private String port;
    private String accessKey;
    private String secretKey;

    public String getTechSupportContact() {
        return techSupportContact;
    }

    public void setTechSupportContact(String techSupportContact) {
        this.techSupportContact = techSupportContact;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getOauthSecret() {
        return oauthSecret;
    }

    public void setOauthSecret(String oauthSecret) {
        this.oauthSecret = oauthSecret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
