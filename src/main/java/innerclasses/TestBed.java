//: innerclasses/TestBed.java
package innerclasses; /* Added by Eclipse.py */
// Putting test code in a nested class.
// {main: TestBed$Tester}

public class TestBed {
  public void f() { System.out.println("f()"); }
  public static class Tester {
    public static void main(String[] args) {
      TestBed t = new TestBed();
      t.f();
    }
  }
} /* Output:
f()
*///:~
