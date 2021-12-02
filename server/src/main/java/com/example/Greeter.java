   /**
    * Info about java package
    */
package greater.java;

/**
 * This is a class.
 */
public class Greeter {

   /**
    * This is a constructor.
    */
  public Greeter() {

  }
  /**
   * @param someone name of person
   * @return greeting string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
