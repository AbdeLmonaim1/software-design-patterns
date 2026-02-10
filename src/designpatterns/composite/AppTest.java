package designpatterns.composite;

public class AppTest {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        root.addComponent(new File("pom.xml"));
        root.addComponent(new File(".gitignore"));
        Folder src = (Folder) root.addComponent(new Folder("src"));
        src.addComponent(new Folder("java"));
        Folder main = (Folder) src.addComponent(new Folder("main"));
        Folder resources = (Folder) src.addComponent(new Folder("resources"));
        main.addComponent(new File("Folder.java"));
        resources.addComponent(new File("application.properties"));
        root.display();
    }
}
