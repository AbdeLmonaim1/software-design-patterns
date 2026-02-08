package designpatterns.decorator;

public abstract class Drink {
    protected String description;
    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
