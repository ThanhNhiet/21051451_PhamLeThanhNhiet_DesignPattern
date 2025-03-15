package adapter_xmlNjson;

public class Xml2JSonAdapter implements DataAdapter {
    private XmlProcessor xmlProcessor;

    public Xml2JSonAdapter(XmlProcessor xmlProcessor) {
        this.xmlProcessor = xmlProcessor;
    }

    @Override
    public String convert(String data) {
        String xmlData = xmlProcessor.parseXML(data);
        return "{ \"data\": \"" + xmlData + "\" }"; // JSON format
    }
}
