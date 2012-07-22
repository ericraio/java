public class ArgumentParsingExample {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println("Argument " + (i + 1) + " = " + args[i]);
    }

  //
  // Exit from the program with an error status, for instance
  // we return -1 to indicate that this
  // program exit abnormally

  System.exit(-1);
  }
}
