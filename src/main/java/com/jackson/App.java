package com.jackson;

import com.ctc.wstx.stax.WstxInputFactory;
import com.ctc.wstx.stax.WstxOutputFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.jackson.model.Body;
import com.jackson.model.Header;
import com.jackson.model.Root;

import javax.xml.stream.XMLInputFactory;

public class App {

    public static void main(String[] args) throws JsonProcessingException {
        XMLInputFactory input = new WstxInputFactory();
        input.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, false);

        XmlMapper xmlMapper = new XmlMapper(new XmlFactory(input, new WstxOutputFactory()));
        xmlMapper.setDefaultUseWrapper(false);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
//        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        xmlMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
//        xmlMapper.getFactory().getXMLOutputFactory().setProperty(ToXmlGenerator.Feature.WRITE_XML_DECLARATION.name(), true);
        Body body = new Body("content", "adds");
        Header header = new Header("name", "service", "content");
        Root root = new Root(header, body);
        System.out.println(xmlMapper.writeValueAsString(root).replaceAll("wstxns[0-9]*:", "").replaceAll(":wstxns[0-9]*", "").replace("xmlns=\"\"", ""));

        String xml ="""
                <?xml version='1.0' encoding='UTF-8'?><Root xmlns="https://lqm/name"><Lqm:lqm xmlns="https://lqm/name1" SvcId="service"><name >name</name><content >content</content></Lqm:lqm><Lqm:body xmlns="https://lqm/name2"><content ><![CDATA[content]]></content><adds >adds</adds></Lqm:body></Root>
                """;


        Root root1 = xmlMapper.readValue(xml, Root.class);
        System.out.println(root1.toString());

    }
}
