package com.jackson.model;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="Root", namespace = "https://lqm/name")
public record Root(@JacksonXmlProperty(namespace = "https://lqm/name1", localName = "Lqm:lqm") Header header, Body body) {

}
