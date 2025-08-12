# Reverse String (OOP in Java)

##  Overview
This Java program reverses a string **without using built-in reverse functions**.  
It demonstrates **Object-Oriented Programming (OOP)** concepts such as **encapsulation** and **method-based design**.

---

##  Features
- No `StringBuilder.reverse()` or library shortcuts.
- Manual character-by-character reversal.
- Encapsulated string inside a class for clean structure.

---

##  Technologies Used
- **Java** (JDK 8 or higher)

---

##  Code

### StringReverser.java
```java
class StringReverser {
    private String text;

    public StringReverser(String text) {
        this.text = text;
    }

    public String reverse() {
        char[] chars = text.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        return reversed;
    }

    public void displayReversed() {
        System.out.println("Reversed string: " + reverse());
    }
}
