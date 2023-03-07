package week6.mouseEvents;

public class Food {
    static int count;
    private String flavor = "sweet";

    Food(String s) {
        flavor = s;
    }

    void setFlavor(String s) {
        flavor = s;
    }

    String getFlavor() {
        return flavor;
    }

    static public void main(String[] args) {
        Food pepper = new Food("spicy");
        Food chile = pepper;
        pepper.setFlavor("smoky");
        System.out.println(chile.getFlavor());
    }
}