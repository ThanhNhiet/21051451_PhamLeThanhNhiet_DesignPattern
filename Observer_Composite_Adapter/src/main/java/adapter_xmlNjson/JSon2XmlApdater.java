package adapter_xmlNjson;

public class JSon2XmlApdater implements DataAdapter{
    private JSonProcessor jSonProcessor;

    public JSon2XmlApdater(JSonProcessor jSonProcessor) {
        this.jSonProcessor = jSonProcessor;
    }

    @Override
    public String convert(String data) {
        String jsonData = jSonProcessor.parseJSon(data);
        return "<data>" + jsonData + "</data>"; // XML format
    }
}
