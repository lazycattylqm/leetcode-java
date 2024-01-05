package com.jackson.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record Header(String name,
                     @JacksonXmlProperty(localName = "SvcId", isAttribute = true) String service,
                     String content) {
}
