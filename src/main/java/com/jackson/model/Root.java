package com.jackson.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="Root", namespace = "https://lqm/name")
@JsonIgnoreProperties(ignoreUnknown = true)
public record Root(@JacksonXmlProperty(namespace = "https://lqm/name1", localName = "Lqm:lqm") Header header, @JacksonXmlProperty(namespace = "https://lqm/name2", localName = "Lqm:body")Body body) {

}
