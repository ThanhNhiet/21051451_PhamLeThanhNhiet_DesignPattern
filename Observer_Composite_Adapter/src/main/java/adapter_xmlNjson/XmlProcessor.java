package adapter_xmlNjson;

public class XmlProcessor {
    public String parseXML(String data) {
        //cut <data><data/> from data
        String xmlData = data.substring(6, data.length() - 7);
        return xmlData;
    }
}
