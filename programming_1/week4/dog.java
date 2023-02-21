public class dog {
    public String name;
    public String breed;

    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Bow wow");
    }

    public static void main(String[] args) {
        dog John = new dog("John", "Corgi");
        System.out.println("Hi. My name is " + John.name + " and I am ad " + John.breed + " !");
        John.bark();
    }
}
