/**
 * note
 */
public class Note {

    private String name ;
    private Integer num_of_feet;


    public Note(String name, Integer num_of_feet){
        this.name = name;
        this.num_of_feet = num_of_feet;
    
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + this.name + ".");
        System.out.println("I have "+this.num_of_feet+ " feet(s)" );

    }

    public static void main(String[] args) {
        Note test = new Note("Alice",4);
        test.sayHello();
    }
}
