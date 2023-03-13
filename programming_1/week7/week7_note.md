# Week 7 : Arrays and ArrayLists

| Section List                                            |
| ------------------------------------------------------- |
| [Reading Section](#reading-section)                     |
| [Assignment Theme](#assignment-theme)                   |
| [Section 7.1 Array Details](#section-71-array-details ) |

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
