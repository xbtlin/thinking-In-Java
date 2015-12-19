//: generics/Manipulator2.java
package generics; /* Added by Eclipse.py */

class Manipulator2<T extends HasF> {
  private T obj;
  public Manipulator2(T x) { obj = x; }
  public void manipulate() { obj.f(); }
} ///:~
