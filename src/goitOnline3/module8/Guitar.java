package goitOnline3.module8;

public class Guitar  {

    private String name = "Guitar";
    private String price = "default";
    private String color = "default";
    private String description = "description";

    Guitar (String name, String price, String color, String description){
        super();
        this.name = name;
        this.price = price;
        this.color = color;
        this.description = description;
    }

    public  String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }
}
