package com.aeontronix.techmanager.client.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ConfigFile {
    @JsonProperty("active")
    private String activeProfile;
    private Map<String,ConfigProfile> profiles;
}
