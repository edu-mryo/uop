# Week 6 : GUI

|Section List|
|------------|
|[Section 6.1 (A Basic JavaFX Application)](#section-61-a-basic-javafx-application)|
|[Section 6.2 (Some Basic Classes)](#section-62-some-basic-classes)|
|[Discussion Assignment](#discussion-assignment)|

## Reading

- Chapter 1, Section 6: The Modern User Interface
- Chapter 6: Introduction to GUI Programming, Sections 1, 2, 3, and 6.

## Optional Reading

- Chapter 3, Section 9: Introduction to GUI Programming
- Chapter 6, Section 4: Basic Controls
- Chapter 6, Section 5: Basic Layouts

### Section 6.1 (A Basic JavaFX Application)

- It was only in the mid 1980s that home computers with graphical user interfaces started to become available.
  - Today, most people interact with their computers exclusively through a GUI. A GUI program offers a much richer type of user interface, where the user uses a mouse and keyboard (or other input devices) to interact with GUI components such as windows, menus, buttons, check boxes, text input boxes, scroll bars, and so on.

![image](images/javafx_code.png)
![image](images/java_gui_hierarchy.png)

### Discussion Assignment

```Text
Considering the Java program in section 6.3.3 “Dragging” of Eck (2019), describe what it does in response to specific operations of the mouse (mousePressed, mouseDragged, and mouseReleased), and how it does it. 

You are encouraged to run the SimplePaint program for yourself to test its behavior. Then read through the program carefully to understand how that behavior arises.

Your Discussion should be at least 250 words in length, but not more than 750 words. Once you’ve completed your initial post, be sure to respond to the posts of at least 3 of your classmates.
```

mousePressed(), mouseDragged() and mouseReleased() are mouse events methods, which notifies user action to the programme. These methods are part of the MouseListnener interface (Java.awt.event.MouseLisetener) , which generally covers mouse events for onscreen area. Methods can get triggered by clicks and also movement of the cursor within the onscreen area. We can also trigger methods when the cursor leaves a specific area.

mousePressed():
The mousePressed() method in Java can handle or respond to users mouse click event in the graphical interface (GUI)

One point to note: mousePressed and mouseClicked are different methods and use case. mousePressed() is called after the user presses a mouse Users must be warned that
