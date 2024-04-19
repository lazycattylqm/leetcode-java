package com.jackson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"attrB", "attrA", "content", "adds"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Body {
        @JacksonXmlProperty(localName = "AtrA", isAttribute = true)
        String attrA;

        @JacksonXmlProperty(localName = "AtrB", isAttribute = true)
        String attrB;
        @JacksonXmlCData String content; String adds;
}
