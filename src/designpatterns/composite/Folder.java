package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }
    public FileSystemComponent addComponent(FileSystemComponent component){
        component.level = this.level+1;
        this.components.add(component);
        return component;
    }
    public void removeComponent(FileSystemComponent component){
        this.components.remove(component);
    }

    @Override
    public void display() {
        System.out.println(tabs()+"Folder : "+name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
}
