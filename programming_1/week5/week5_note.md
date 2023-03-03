#

| Section Link                             |
| ---------------------------------------- |
| [Section5.8](#section-58-nested-classes) |
| [Discussion Theme](#discussion-theme)|
| [Weekly Journal](#weekly-journal)|

## Section 5.8 (Nested Classes)

In Java, `a nested class is any class whose definition is inside the definition of another class.` (In fact, a class can even be nested inside a method, which must, of course, itself be inside a class.)

- Nested classes can be either named or anonymous.

The definition of a `static nested class looks just like the definition of any other class, except that it is nested inside another class and it has the modifier static as part of its declaration`

suppose a class named WireFrameModel represents a set of lines in three-dimensional space. (Such models are used to represent three-dimensional objects in graphics programs.) Suppose that the WireFrameModel class contains a static nested class, Line, that represents a single line. The definition of the WireFrameModel class with its nested Line class would look, in outline, like this:

```java
public class WireFrameModel {

   . . . // other members of the WireFrameModel class

   static public class Line {
         // Represents a line from the point (x1,y1,z1)
         // to the point (x2,y2,z2) in 3-dimensional space.
      double x1, y1, z1;
      double x2, y2, z2;
   } // end class Line

   . . . // other members of the WireFrameModel class

} // end WireFrameModel
```

- When you compile the above class definition, two class files will be created. `Even though the definition of Line is nested inside WireFrameModel, the compiled Line class is stored in a separate file.` The name of the class file for Line will be WireFrameModel$Line.class.

`Non-static nested classes` are referred to as `inner classes.` Inner classes are not, in practice, very different from static nested classes, but a non-static nested class is actually associated with an object rather than with the class in which its definition is nested

- Any non-static member of a class is not really part of the class itself (although its source code is contained in the class definition) ... It's as if each object that belongs to the containing class has its own copy of the nested class  

the rule for deciding whether a nested class should be static or non-static is simple: If the nested class needs to use any instance variable or instance method from the containing class, make the nested class non-static. Otherwise, it might as well be static.

## Discussion Theme

```text
Give examples showing how "super" and "this" are useful with inheritance in Java. Include examples of using "super" and "this" both as constructors and as variables.
```

Simply put, `this` is used for its current instance of the class. By using the `this` keyword, we can refer the value in "this object".

Below is an example of class with using this keyword

```java
public class Animal {

    private String name ;
    private Integer num_of_feet;


    public Animal(String name, Integer num_of_feet){
        this.name = name;
        this.num_of_feet = num_of_feet;
    
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + this.name + ".");
        System.out.println("I have "+this.num_of_feet+ " feet(s)" );

    }

    public static void main(String[] args) {
        Animal mark = new Animal("Mark",4);
        mark.sayHello();
    }
}

```

When creating an instance, you can specify the name of the Person object with the name "Alice" as below

```java
Person alice = new Person("Alice");
```

If we then try to call the sayHello() method for alice, we would be able to retrieve the this.name instance variable which was referred when creating the alice object.

alice.sayHello();

>`Hello, my name is Alice.`

Using `this` is not a compulsory and it does not cause any error by not using it at all. However, utilizing `this` can reduce confusion between the member variables and parameter , which will usually have same names. We can also use `this` to invoke class constructor and methods.

`super` on the other hand is a variable which you can use only in subclass to 'refer to the object that contains the method'. In other words, if you want to refer a method from a superclass , you can use super.xxx as way to inherit the method.

```java
public class super_example {
    public void speak() {
        System.out.println("I am a human");
    }
}

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
```

The above code is an example of super. The super_example_two class extends (Inherits) the super_example class, in which has the method called "speak()" from the original super_example. The spaek() method written in the super_example_two invokes the super.speak(). We are however adding another line with println method after the super.speak() to override the original  method. By doing so, we are not only inheriting the original , but making a new unique method.

## Weekly Journal

This week's reading section from Eck's "Introduction to Programming Using Java" was quite challenging. It focused on several topics such as "this" and "super" keywords, interfaces, and nested classes. Although I found the reading to be tough, I was able to submit my coding assignment before the deadline, and it worked correctly. However, I am still not confident about how "this" works and how it played its role in the assignment.

The "this" keyword is used to refer to the current object instead of local variables. We typically use the this.xxx notation to access an object's attributes or methods. However, I found the examples provided by Eck to be confusing, which led to my lack of confidence in using the "this" keyword.  It seems there are many other resources including videos to watch to fully understand the concept of this notation and when to use. However, programming in the end requires many practices and real world implementation to grasp the concept. That being said , to improve my understanding, I plan to write more code for my week assignment notes and also find additional examples from repositories like github.

On the other hand, I found the "super" keyword to be clearer than "this." The super.xxx notation is used to call methods or variables from the superclass in a child class. It is essential to use the super keyword because calling the same method without it will override the superclass method. Overall, I think I have a better understanding of the "super" keyword than "this." In addition to the keywords, the reading also covered interfaces and nested classes. Interfaces are similar to abstract classes in that they ensure limited access and security. However, they must be called from other classes. Nested classes, on the other hand, are classes that are contained within another class. They ensure limited access, such as private or protected, and can be useful for organizing code.

Overall, this week's reading contained relatively complex and advanced techniques. While I found the concepts challenging, I was able to complete the coding assignment on time. However, I am still not confident in using the "this" keyword and plan to write more code to get used to it. The "super" keyword, on the other hand, was more straightforward, and I feel comfortable using it. The sections on interfaces and nested classes were relatively straightforward, and I believe that I have a good understanding of these topics. In conclusion, I will continue to practice writing code and look for additional resources to improve my understanding of these concepts.

References

Reference
Javanotes 9, Section 5.6 -- The Basic Java Application. (n.d.). <https://math.hws.edu/javanotes/c2/s1.html>
Javanotes 9, Section 5.7 -- The Basic Java Application. (n.d.). <https://math.hws.edu/javanotes/c2/s1.html>
Javanotes 9, Section 5.8 -- The Basic Java Application. (n.d.). <https://math.hws.edu/javanotes/c2/s1.html>
