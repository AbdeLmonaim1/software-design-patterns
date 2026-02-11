package designpatterns.composite;

public class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(tabs()+"File : "+name);
    }
}
