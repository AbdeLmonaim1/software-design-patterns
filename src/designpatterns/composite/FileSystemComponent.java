package designpatterns.composite;

public abstract class FileSystemComponent {
    protected String name;
    protected int level;

    public FileSystemComponent(String name) {
        this.name = name;
        level = 0;
    }
    public abstract void display();
    protected String tabs(){
        String tabs = "";
        for (int i = 0; i < level; i++) {
            tabs = tabs + "\t";
        }

        return tabs;
    }
}
