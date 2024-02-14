class Program1 extends ConsoleProgram {

  /**
  * A program that takes two sides of a right-angle triagnle from the user 
  * and calculates the hypotenuse
  * @author: W. Tammy
  */
  
  public void run() {
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblHypotenuse;

    
    // Get lenghts of side A and side B from user 
    dblSideA = readDouble("Enter the length of side A: ");
    dblSideB = readDouble("Enter the length of Side B: ");

    // Calculate hyoptenuse: c = sqrt(a^2 + b^2)\
    dblHypotenuse = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2));
    
    // Output results
    System.out.println("The hypotenuse of this right-angle triangle is " + dblHypotenuse);
  }
}
