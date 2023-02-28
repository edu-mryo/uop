public class super_example_two extends super_example {

    public void speak(){
        super.speak();
        System.out.println("I am a male human, to be specific");
    }

    public static void main(String[] args) {
        super_example_two test =new super_example_two();
        test.speak();
    }
}
