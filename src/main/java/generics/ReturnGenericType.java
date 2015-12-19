//: generics/ReturnGenericType.java
package generics; /* Added by Eclipse.py */

class ReturnGenericType<T extends HasF> {
  private T obj;
  public ReturnGenericType(T x) { obj = x; }
  public T get() { return obj; }
} ///:~
