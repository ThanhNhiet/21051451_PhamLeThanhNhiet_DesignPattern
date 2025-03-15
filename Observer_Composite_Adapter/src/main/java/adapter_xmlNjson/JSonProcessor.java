package adapter_xmlNjson;

public class JSonProcessor {
    public String parseJSon(String data) {
        //cut { "data": ""} from data
        String jsonData = data.substring(10, data.length() - 3);
        return jsonData;
    }
}
