//: exceptions/InheritingExceptions.java
package exceptions; /* Added by Eclipse.py */
// Creating your own exceptions.

class SimpleException extends Exception {}

public class InheritingExceptions {
  public void f() throws SimpleException {
    System.out.println("Throw SimpleException from f()");
    throw new SimpleException();
  }
  public static void main(String[] args) {
    InheritingExceptions sed = new InheritingExceptions();
    try {
      sed.f();
    } catch(SimpleException e) {
      System.out.println("Caught it!");
    }
  }
} /* Output:
Throw SimpleException from f()
Caught it!
*///:~
