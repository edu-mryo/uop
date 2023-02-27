| Section Link                             |
| ---------------------------------------- |
| [Section5.8](#section-58-nested-classes) |

# Section 5.8 (Nested Classes)

In Java, `a nested class is any class whose definition is inside the definition of another class.` (In fact, a class can even be nested inside a method, which must, of course, itself be inside a class.)

- Nested classes can be either named or anonymous.

<br>

The definition of a `static nested class looks just like the definition of any other class, except that it is nested inside another class and it has the modifier static as part of its declaration`

suppose a class named WireFrameModel represents a set of lines in three-dimensional space. (Such models are used to represent three-dimensional objects in graphics programs.) Suppose that the WireFrameModel class contains a static nested class, Line, that represents a single line. The definition of the WireFrameModel class with its nested Line class would look, in outline, like this:

```
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

<br>

`Non-static nested classes` are referred to as `inner classes.` Inner classes are not, in practice, very different from static nested classes, but a non-static nested class is actually associated with an object rather than with the class in which its definition is nested

- Any non-static member of a class is not really part of the class itself (although its source code is contained in the class definition) ... It's as if each object that belongs to the containing class has its own copy of the nested class

<br>

the rule for deciding whether a nested class should be static or non-static is simple: If the nested class needs to use any instance variable or instance method from the containing class, make the nested class non-static. Otherwise, it might as well be static.
