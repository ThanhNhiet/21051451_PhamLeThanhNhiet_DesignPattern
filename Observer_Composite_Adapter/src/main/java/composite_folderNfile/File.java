package composite_folderNfile;
//leaf
public class File extends Component{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("file: " + name);
    }
}
