package goitOnline3.module8;

public class Piano extends MusicInstrument {

    private String name = "Piano";
    private String price = "default";
    private String color = "default";
    private String description = "description";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
