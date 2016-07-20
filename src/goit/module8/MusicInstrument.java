package goit.module8;

public class MusicInstrument {

    private String name;
    private String size;
    private String color;

    public MusicInstrument (String name, String size, String color){
        this.setName(name);
        this.setSize(size);
        this.setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
