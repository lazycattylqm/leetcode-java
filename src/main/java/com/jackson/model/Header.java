package com.jackson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Header(String name,
                     @JacksonXmlProperty(localName = "SvcId", isAttribute = true) String service,
                     String content) {
}
