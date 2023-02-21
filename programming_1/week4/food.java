/**
 * food
 */

public class food {
    static int count;
    private String flavor = "sweet";

    food(String s) {
        flavor = s;
    }

    void setFlavor(String s) {
        flavor = s;
    }

    String getFlavor() {
        return flavor;
    }

    static public void main(String[] args) {
        food pepper = new food("egg");
        pepper.setFlavor("spicy");
        System.out.println(pepper.getFlavor());
    }
}
