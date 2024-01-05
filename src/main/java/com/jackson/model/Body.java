package com.jackson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Body(
        @JacksonXmlCData String content, String adds) {
}
