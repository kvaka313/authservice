package com.infopulse.configuration;

import org.keycloak.admin.client.Keycloak;

public interface KeycloakConnection {
    Keycloak getKeycloakClient();
}
