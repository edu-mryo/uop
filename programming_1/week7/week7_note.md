# Week 7 : Arrays and ArrayLists

| Section List                                            |
| ------------------------------------------------------- |
| [Reading Section](#reading-section)                     |
| [Assignment Theme](#assignment-theme)                   |
| [Section 7.1 Array Details](#section-71-array-details ) |
| [Section 7.2 Array Processing](#section-72-array-processing)|

## Reading Section

```text
Read the following:

Chapter 3, Section 3.8
Chapter 4, Section 4.3
Chapter 5, Section 5.1
Chapter 7
```

## Assignment Theme

```text
What are wrapper classes and why are they useful for ArrayLists? In your answer, include examples of autoboxing and unboxing.
```

## Reply draft to the assignment

```Text

Wrapper classes are classes that wrap primitive data types such as int, char, byte, float, and double. They are useful for ArrayLists because they allow you to store primitive data types in ArrayLists as objects. This is useful because ArrayLists only store objects, not primitive data types.

For example, you can create an ArrayList of ints like this:

```text

ArrayList<Integer> list = new ArrayList<>();

```

You can then add ints to the list like this:

```text

list.add(1);
list.add(2);

```

When you retrieve an int from the list, you will get an Integer object back. For example:

```text

Integer int = list.get(0);

```

Autoboxing is the automatic conversion of primitive data types to their corresponding wrapper classes. Unboxing is the automatic conversion of wrapper classes to their corresponding primitive data types.

For example, if you have an Integer object, you can unbox it to get an int like this:

```text
int int = (int) list.get(0);
```

Autoboxing and unboxing are useful because they make it easier to work with primitive data types in Java.

## Section 7.1 Array Details

- Arrays in Java are objects, so an array variable can only refer to an array; it does not contain the array.
  - The value of an array variable can also be null. In that case, it does not refer to any array, and an attempt to refer to an array element such as A[i] will cause a `NullPointerException`.
  - Arrays are created using a special form of the new operator. For example,`int[] A = new int[10];` creates a new array with base type int and length 10, and it sets the variable A to refer to the newly created array.

- Arrays are often processed using for loops.
  - A for loop makes it easy to process each element in an array from beginning to end. For example, if namelist is an array of Strings, then all the values in the list can be printed using

```java
for (int i = 0; i < namelist.length; i++) {
    System.out.println( namelist[i] );
}
```

- This type of processing is so common that there is an alternative form of the for loop that makes it easier to write. The alternative is called a for-each loop. It is probably easiest to start with an example. Here is a for-each loop for printing all the values in an array of Strings:

```java
for ( String name : namelist ) {
    System.out.println( name );
}
```

The meaning of `for (String name : namelist)` is `"for each String, name, in the array, namelist, do the following"`.

- The for-each loop is not always appropriate.
  - For example, there is no simple way to use it to process the items in just a part of an array, or to process the elements in reverse order. However, it does make the code a little simpler when you do want to process all the values, in order. since it eliminates any need to use array indices.

- it's important to note that a `for-each loop processes the values in the array, not the elements` (where an element means the actual memory location that is part of the array and that holds the value). For example, consider the following incorrect attempt to fill an array of integers with 17's:

```java
int[] intList = new int[10];
for ( int item : intList ) {   // INCORRECT! DOES NOT MODIFY THE ARRAY!
   item = 17;
}
```

- The assignment statement item = 17 assigns the value 17 to the loop control variable, item. However, this has nothing to do with the array. When the body of the loop is executed, the value from one of the elements of the array is copied into item. The statement item = 17 replaces that copied value but has no effect on the array element from which it was copied; the value in the array is not changed. The loop is equivalent to

```java
int[] intList = new int[10];
for ( int i = 0; i < intList.length; i++ ) {
   int item = intList[i];
   item = 17;
}
```

which certainly does not change the value of any element in the array.

- Before Java 5, every method in `Java had a fixed arity. (The arity of a method is defined as the number of parameters in a call to the method.)` In a fixed arity method, the number of parameters must be the same in every call to the method and must be the same as the number of formal parameters in the method's definition. Java 5 introduced variable arity methods. In a variable arity method, different calls to the method can have different numbers of parameters.

- When the method is called, the values of all the actual parameters that correspond to the variable arity parameter are placed into an array, and it is this array that is actually passed to the method. That is, in the body of a method, a variable arity parameter of type T actually looks like an ordinary parameter of type T[]. The length of the array tells you how many actual parameters were provided in the method call. In the average example, the body of the method would see an array named numbers of type double[]. The number of actual parameters in the method call would be numbers.length, and the values of the actual parameters would be numbers[0], numbers[1], and so on. A complete definition of the method would be:

```java
public static double average( double... numbers ) {
        // Inside this method, numbers is of type double[].
   double sum;      // The sum of all the actual parameters.
   double average;  // The average of all the actual parameters.
   sum = 0;
   for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];  // Add one of the actual parameters to the sum.
   }
   average = sum / numbers.length;
   return average; // (Will be Double.NaN if numbers.length is zero.)
```

## Section 7.2 Array Processing
