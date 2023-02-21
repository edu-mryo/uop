| Section Link                                                                                                          |
| --------------------------------------------------------------------------------------------------------------------- |
| [Section5.1 (Objects, Instance Methods and Variables)](#section-51)                                                   |
| [Section5.2 (Constructor and Object Initialization)](#section-52)                                                     |
| [Section5.3 (Programming With Object)](#section-53)                                                                   |
| [Section5.4 (Designing Class)](#section-54-desgining-class)                                                           |
| [Section 5.5 (Inheritance, Polymorphism and Abstract Class)](#section-55-inheritance-polymorphism-and-abstract-class) |
| [Section 5.6 (This and Super)](#section-56-this-and-super)                                                            |
| [Section 5.7 (Interfaces)](#section-57-interfaces)                                                                    |




# Section 5.1

OBJECT-ORIENTED PROGRAMMING (OOP) represents an attempt to make programs more closely model the way people think about and deal with the world.

To some extent, OOP is just a change in point of view. We can think of an object in standard programming terms as nothing more than a set of variables together with some subroutines for manipulating those variables

As I have mentioned before, in the context of object-oriented programming, subroutines are often referred to as methods.

From the point of view of programming, it is more exact to say that classes are used to create objects. A class is a kind of factory—or blueprint—for constructing objects. The non-static parts of the class specify, or describe, what variables and methods the objects will contain

```
class UserData {
    static String name;
    static int age;
}
```

![img](images/player_data_class_instance.png)
- There is no such variable as PlayerData.name or PlayerData.age, since non-static variables do not become part of the class itself. 
- PlayerData class can be used to create objects. There can be many objects created using the class, and each one will have its own variables called name and age. 
- This is what it means for the non-static parts of the class to be a template for objects: Every object gets its own copy of the non-static part of the class. We can visualize the situation in the computer's memory after several objects have been created like this:

**every object contains a name and an age. An object that is created from a class is called an *instance* of that class, and as the picture shows, every object "knows" which class was used to create it.**
- An object that is created using a class is said to be an instance of that class. We will sometimes say that the object belongs to the class. The variables that the object contains are called instance variables. The methods (that is, subroutines) that the object contains are called instance methods

```
public class Student {

   public String name;  // Student's name.
   public double test1, test2, test3;   // Grades on three tests.
   
   public double getAverage() {  // compute average test grade
      return (test1 + test2 + test3) / 3;
   }
   
}  // end of class Student
```

What is static in class and what happens when you try to define value to a static class variable
![img](images/what_is_static_in_class.png)
![img](images/static_behaviour.png)

<br>
 <red>In Java, no variable can ever hold an object.
A variable can only hold a reference to an object. </red>

- Instead of holding an object itself, a variable holds the information necessary to find the object in memory. This information is called a reference or pointer to the object. In effect, a reference to an object is the address of the memory location where the object is stored. 
  - ```std = new Student();```   

```
Student std, std1,       // Declare four variables of
          std2, std3;    //   type Student.

std = new Student();     // Create a new object belonging
                         //   to the class Student, and
                         //   store a reference to that
                         //   object in the variable std.

std1 = new Student();    // Create a second Student object
                         //   and store a reference to
                         //   it in the variable std1.

std2 = std1;             // Copy the reference value in std1
                         //   into the variable std2.

std3 = null;             // Store a null reference in the
                         //   variable std3.
                         
std.name = "John Smith";  // Set values of some instance variables.
std1.name = "Mary Jones";

     // (Other instance variables have default
     //    initial values of zero.)
```

![img](images/instance_example.png)
- In this picture, when a variable contains a reference to an object, the value of that variable is shown as an arrow pointing to the object. Note, by the way, that the Strings are objects! The variable std3, with a value of null, doesn't point anywhere. The arrows from std1 and std2 both point to the same object. This illustrates a Very Important Point:

```
When one object variable is assigned
to another, only a reference is copied.
The object referred to is not copied.
```

When you make a test "if (std1 == std2)", you are testing whether the values stored in std1 and std2 are the same. But the values that you are comparing are references to objects; they are not objects. So, you are testing whether std1 and std2 refer to the same object.

![img](images/valu_assignment_for_objects.png)


to find out what its value is by providing a public accessor method that returns the value of the variable. 

```
public String getTitle() {
    return title;
}
```

By convention, the name of an accessor method for a variable is obtained by capitalizing the name of variable and adding "get" in front of the name. 


You might also want to allow "write access" to a private variable. That is, you might want to make it possible for other classes to specify a new value for the variable. 

```
public void setTitle( String newTitle ) {
   title = newTitle;
}
```

you might wonder why not just make the variable public? The reason is that getters and setters are not restricted to simply reading and writing the variable's value. 

a getter method might keep track of the number of times that the variable has been accessed:
```
public String getTitle() {
    titleAccessCount++;  // Increment member variable titleAccessCount.
    return title;
}
```

and a setter method might check that the value that is being assigned to the variable is legal:

```
public void setTitle( String newTitle ) {
   if ( newTitle == null )   // Don't allow null strings as titles!
      title = "(Untitled)";  // Use an appropriate default value instead.
   else
      title = newTitle;
}
```

 If you've used a getter and setter from the beginning, you can make the modification to your class without affecting any of the classes that use your class. 

# Section 5.2

Unlike other subroutines, a constructor can only be called using the new operator, in an expression that has the form

`new class-name ( parameter-list )`

A constructor call is more complicated than an ordinary subroutine or function call. It is helpful to understand the exact steps that the computer goes through to execute a constructor call:

- First, the computer gets a block of unused memory in the heap, large enough to hold an object of the specified type.
- It initializes the instance variables of the object. If the declaration of an instance variable specifies an initial value, then that value is computed and stored in the instance variable. Otherwise, the default initial value is used.
- The actual parameters in the constructor, if any, are evaluated, and the values are assigned to the formal parameters of the constructor.
- The statements in the body of the constructor, if any, are executed.
A reference to the object is returned as the value of the constructor call.

Java uses a procedure called garbage collection to reclaim memory occupied by objects that are no longer accessible to a program. It is the responsibility of the system, not the programmer, to keep track of which objects are "garbage."

# Section 5.3

object-oriented programming encourages programmers to produce generalized software components that can be used in a wide variety of programming projects.

A string can be built up from smaller pieces using the + operator, but this is not always efficient. If str is a String and ch is a character, then executing the command "str = str + ch;" involves creating a whole new string that is a copy of str, with the value of ch appended onto the end. **Copying the string takes some time. Building up a long string letter by letter would require a surprising amount of processing.** 
   - The class **StringBuilder** makes it possible to be efficient about building up a long string from a number of smaller pieces. To do this, you must make an object belonging to the StringBuilder class. For example:

      - `StringBuilder builder = new StringBuilder();`

<br>

`Random randGen = new Random();`
 
 - if N is a positive integer, then `randGen.nextInt(N)` generates a random integer in the range from 0 to **N-1**. For example, this makes it a little easier to roll a pair of dice. Instead of saying "die1 = (int)(6*Math.random())+1;", one can say "die1 = randGen.nextInt(6)+1;"

<br>

One of the major features of object-oriented programming is the **ability to create subclasses of a class**. 
   - The subclass inherits all the properties or behaviors of the class, but can modify and add to what it inherits.

      - every class in Java (with just one exception) is a subclass of some other class. If you create a class and don't explicitly make it a subclass of some other class, then ***it automatically becomes a subclass of the special class named Object, in package java.lang.*** (Object is the one class that is not a subclass of any other class.)

<br>
<br>


- Well-designed classes are software components that can be reused without editing. 

- A well-designed class is not carefully crafted to do a particular job in a particular program. Instead, it is crafted to model some particular type of object or a single coherent concept.

- A large programming project goes through a number of stages, starting with specification of the problem to be solved, followed by analysis of the problem and design of a program to solve it. 
   - Then comes coding, in which the program's design is expressed in some actual programming language. This is followed by testing and debugging of the program. 
   - After that comes a long period of maintenance, which means fixing any new problems that are found in the program and modifying it to adapt it to changing requirements. 
   
   --> Together, these stages form what is called the software life cycle


Large, complex programming projects are only likely to succeed if a careful, systematic approach is adopted during all stages of the software life cycle. The systematic approach to programming, using accepted principles of good design, is called *software engineering.*


# Section 5.4 (Desgining Class)

// Return here for code analysis

# Section 5.5 (Inheritance, Polymorphism and Abstract Class)

The central new idea in object-oriented programming—the idea that really distinguishes it from traditional programming—is to allow classes to express the similarities among objects that share some, but not all, of their structure and behavior. 
   Such similarities can be expressed `using inheritance and polymorphism.`

<br>

 Subclassing is used mainly in one situation: There is an existing class that can be adapted with a few changes or additions. 
   - This is much more common than designing groups of classes and subclasses from scratch. The existing class can be extended to make a subclass.

```
public class subclass-name extends existing-class-name {
   .
   .   // Changes and additions.
   .
}
```

<br>

### Example of Subclssing

<br>

```
public class BlackjackHand extends Hand {

    /**
     * Computes and returns the value of this hand in the game
     * of Blackjack.
     */
    public int getBlackjackValue() {

        int val;      // The value computed for the hand.
        boolean ace;  // This will be set to true if the
                      //   hand contains an ace.
        int cards;    // Number of cards in the hand.

        val = 0;
        ace = false;
        cards = getCardCount();  // (method defined in class Hand.)

        for ( int i = 0;  i < cards;  i++ ) {
                // Add the value of the i-th card in the hand.
            Card card;    // The i-th card; 
            int cardVal;  // The blackjack value of the i-th card.
            card = getCard(i);
            cardVal = card.getValue();  // The normal value, 1 to 13.
            if (cardVal > 10) {
                cardVal = 10;   // For a Jack, Queen, or King.
            }
            if (cardVal == 1) {
                ace = true;     // There is at least one ace.
            }
            val = val + cardVal;
         }

         // Now, val is the value of the hand, counting any ace as 1.
         // If there is an ace, and if changing its value from 1 to 
         // 11 would leave the score less than or equal to 21,
         // then do so by adding the extra 10 points to val. 

         if ( ace == true  &&  val + 10 <= 21 )
             val = val + 10;

         return val;

    }  // end getBlackjackValue()

} // end class BlackjackHand
```
- Since BlackjackHand is a subclass of Hand, an object of type BlackjackHand contains all the instance variables and instance methods defined in Hand, plus the new instance method named getBlackjackValue(). 
    - For example, if bjh is a variable of type BlackjackHand, then the following are all legal: bjh.getCardCount(), bjh.removeCard(0), and bjh.getBlackjackValue(). The first two methods are defined in Hand, but are inherited by BlackjackHand.

<br>

- There is one more access modifier, `protected`, that comes into the picture when subclasses are taken into consideration. 
  - When protected is applied as an access modifier to a method or member variable in a class, that member can be used in subclasses—direct or indirect—of the class in which it is defined, `but it cannot be used in non-subclasses. `
  - When you declare a method or member variable to be protected, `you are saying that it is part of the implementation of the class, rather than part of the public interface of the class`. However, you are allowing subclasses to use and modify that part of the implementation.


<br>

 The class that does the inheriting is said to be a `subclass of the class from which it inherits`. If class B is a subclass of class A, we also say that class A is a superclass of class B.
 
 ![img](images/class_subclass.png)

 <br>

 ```
 class B extends A {
    .
    .  // additions to, and modifications of,
    .  // stuff inherited from class A
    .
}
```

<br>

 `An abstract class is one that is not used to construct objects, but only as a basis for making subclasses. An abstract class exists only to express the common properties of all its subclasses.` 
   - A class that is not abstract is said to be concrete. You can create objects belonging to a concrete class, but not to an abstract class.
   -  A variable whose type is given by an abstract class can only refer to objects that belong to concrete subclasses of the abstract class.

# Section 5.6 (this and super)

A `static` member of a class has a simple name that can only be used inside the class definition; for use outside the class, it has a full name of the form class-name.simple-name.

 when we are working inside a class and use a simple name to refer to an instance variable like test1, where is the object that contains the variable?
 -  The solution to this riddle is simple: Suppose that a reference to "test1" occurs in the definition of some instance method. The method is part of some particular object of type Student. When that method gets executed, the occurrence of the name "test1" refers to the test1 variable in that same object
    -  `This intent of the name, "this," is to refer to "this object,"`

```
public class Student {

    private String name;  // Name of the student.
    
    public Student(String name) {
         // Constructor.  Create a student with specified name.
       this.name = name;
    }
      .
      .   // More variables and methods.
      .
}
```

Java also defines another special variable, named "super", for use in the definitions of instance methods. 
- The variable super is for use in a subclass. Like this, super refers to the object that contains the method
- Let's say that you use a method call super.doSomething() in a class that you are writing. Now, super doesn't know anything about any doSomething() method in the same class. It only knows about things in the superclass of that class, so super.doSomething() represents an attempt to execute a method named doSomething() from the superclass
    - `The reason super exists is so you can get access to things in the superclass that are hidden by things in the subclass `

# Section 5.7 (Interfaces)

Some object-oriented programming languages, such as C++, allow a class to extend two or more superclasses. This is called multiple inheritance
- Such multiple inheritance is not allowed in Java. 
- However, Java does have a feature that can be used to accomplish many of the same goals as multiple inheritance: interfaces.

In Java, `interface` is a reserved word with an additional, technical meaning. An "interface" in this sense consists of a set of instance method interfaces, without any associated implementations.
- A class can implement an interface by providing an implementation for each of the methods specified by the interface. Here is an example of a very simple Java interface: