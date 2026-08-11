public class LearnOperators {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    System.out.println("a + b = " + (a + b));   // 30
    System.out.println("a - b = " + (a - b));   // -10
    System.out.println("a * b = " + (a * b));   // 200
    System.out.println("a / b = " + (a / b));   // 0
    System.out.println("b % a = " + (b % a));   // 0
    // Joining two pieces of text
    System.out.println("Hello" + "World");        // HelloWorld

// Left to right: "The Sum is " + 10 becomes text, then + 20 joins as text
    System.out.println("The Sum is " + a + b);    // The Sum is 1020

// Left to right: 10 + 20 are numbers, so they ADD first (30), then join the text
    System.out.println(a + b + " is the sum");    // 30 is the sum

// Parentheses force the maths to happen first
    System.out.println("a - b = " + (a - b));     // a - b = -10

    int x = 10;
    System.out.println(x++);   // 10 (returns 10, then x becomes 11)
    System.out.println(++x);   // 12 (x becomes 12, then returns 12)


    // Relational operators on primitives — use ==
    System.out.println("a == b: " + (a == b));   // compares values, fine for primitives
    System.out.println("a != b: " + (a != b));
    System.out.println("a < b: "  + (a < b));

// Comparing objects — use equals() to compare values
    String fruit1 = "apple";
    String fruit2 = "apple";
    String fruit3 = new String("apple");

    System.out.println(fruit1.equals(fruit3)); // true  — same text content
    System.out.println(fruit1 == fruit3);      // true — same object in memory
  }
}