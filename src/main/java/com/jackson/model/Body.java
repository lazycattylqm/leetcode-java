package com.jackson.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;

public record Body(
        @JacksonXmlCData String content, String adds) {
}
