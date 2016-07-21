package goitOnline3.module8;

public class MusicInstrument {

    private String name;
    private String price;
    private String color;
    private String description;

   MusicInstrument (String name, String price, String color, String description) {
       this.setName(name);
       this.setPrice(price);
       this.setColor(color);
       this.setDescription(description);
   }


    public String getName() {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

