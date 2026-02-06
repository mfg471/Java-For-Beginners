public class U1_L1
{
  // Hello! In this unit, we will focus on the extreme-beginner topics, like printing to System, and simple data types.
  public static void main(String[] args)
  {
    System.out.println("Hello, world!"); // This line prints to the System, and then adds a new-line character to the end.
    // Each statement also needs to end with a semi-colon (;)
    System.out.print("Hello, computer!"); // This line prints to the System, but does NOT add a new-line character.
    // Concatenation (or combining) of strings doesn't automatically add a space in-between.
    String s = "apple" + "banana";
    System.out.println();
    System.out.print(s); // It will print "applebanana"
  }
}
