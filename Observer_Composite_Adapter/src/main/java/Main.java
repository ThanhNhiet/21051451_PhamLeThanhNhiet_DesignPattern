import adapter_xmlNjson.*;
import composite_folderNfile.File;
import composite_folderNfile.Folder;
import observer_coPhieu.ConcreteInvestor;
import observer_coPhieu.ConcreteStock;
import observer_coPhieu.Investor;
import observer_quanLyTrangThaiCV.ConcreteTask;
import observer_quanLyTrangThaiCV.ConcreteTeamMember;
import observer_quanLyTrangThaiCV.TeamMember;

public class Main {
    private static void CoPhieu_ObserverPattern(){
        ConcreteStock stock = new ConcreteStock("AAPL");
        Investor investor1 = new ConcreteInvestor("Nguyễn A");
        Investor investor2 = new ConcreteInvestor("Trần B");

        stock.registerInvestor(investor1);
        stock.registerInvestor(investor2);

        System.out.println("First change price: 150");
        stock.setPrice(150);
        System.out.println("\nSecond change price: 160");
        stock.setPrice(160);
    }

    public static void QLtrangThaiCV_ObserverPartern () {
        ConcreteTask task = new ConcreteTask("phat trien chuc nang aaa");
        TeamMember member1 = new ConcreteTeamMember("Linh");
        TeamMember member2 = new ConcreteTeamMember("Hai");

        task.registerTeamMember(member1);
        task.registerTeamMember(member2);

        task.setStatus("Dang thuc hien");
        task.setStatus("Hoan thanh");
    }

    public static void CompositePattern() {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.jpg");
        File file3 = new File("file3.pdf");

        Folder subFolder1 = new Folder("SubFolder1");
        Folder subFolder2 = new Folder("SubFolder2");

        // root
        Folder rootFolder = new Folder("RootFolder");

        subFolder1.add(file1);
        subFolder1.add(file2);
        subFolder2.add(file3);

        rootFolder.add(subFolder1);
        rootFolder.add(subFolder2);

        rootFolder.display();
    }

    public static void AdapterPattern() {
        XmlProcessor xmlProcessor = new XmlProcessor();
        JSonProcessor jsonProcessor = new JSonProcessor();
        
        DataAdapter xmlToJsonAdapter = new Xml2JSonAdapter(xmlProcessor);
        DataAdapter jsonToXmlAdapter = new JSon2XmlApdater(jsonProcessor);

        String xmlData = "<data>xml</data>";
        System.out.println("JSON data: " + xmlToJsonAdapter.convert(xmlData));

        String jsonData = "{ \"data\":\"json\" }";
        System.out.println("XML data: " + jsonToXmlAdapter.convert(jsonData));
    }

    public static void main(String[] args) {
//        CoPhieu_ObserverPattern();
//        QLtrangThaiCV_ObserverPartern();
//        CompositePattern();
        AdapterPattern();
    }
}