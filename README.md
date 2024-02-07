# The Math Class

We've worked with a basic set of arithmetic operators (i.e+, -,*, /, %).  However, when it comes to more complex calculations, we need a little more help.


The Math class is a built-in library of common math methods (functions) and constants that we can access to compute beyond the basic set of operators.  The [documentation and full list of methods can be found here](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html).  Below is a list of common methods that we access:

|Operation|Command|Description|
|---|---|---|
|Power|Math.pow(double dblBase, double dblExponent)|Compute the powers operation given a base and exponent|
|Squareroot|Math.sqrt(double dblNumber)|computes the squareroot of a given number|
|Round|Math.round(double dblNumber)|round as a number to its' closest whole number|
|Convert Degrees to Radians|Math.toRadians(double dblDegrees)|converts a given angle in degrees to radians|
|Convert Radians to Degrees|Math.toDegrees(double radians)|given an angle in radians, convert it to degrees.|
|Cosine|Math.cos(dbl radians)|given an angle in radians, compute the `cos` of that angle|
|Sine|Math.sin(dble radians)|given an angle in radians, compute the `sin` of that angle|
|Tangent|Math.tan(dble radians)|given an angle in radians, compute the `tan` of that angle|
|PI|Math.PI|pi constant|

## Example
Write a program `Hypotenuse.java` that lets you enter the two sides of a right angled triangle, and then prints the hypotenuse.


```
/*
* Write a program Hypotenuse.java that lets you enter the two sides of a right angled triangle,
* and then prints the hypotenuse.
* @author: E. Fabroa
*
*/

public class Hypotenuse extends ConsoleProgram{

   public void run() {
       // Create variables for sideA, sideB, hypotenuse
       double dblSideA;
       double dblSideB;

       double dblHypSqrd;
       double dblHypotenuse;

       // Get values for sideA, sideB
       dblSideA = readDouble("Enter the length of side A: ");
       dblSideB = readDouble("Enter the length of side B: ");

       // Compute hypotenuse**2 = sideA**2 + sideB**2
       dblHypSqrd = Math.pow(sideA, 2) + Math.pow(sideB, 2);
       dblHypotenuse = Math.sqrt(hypSqrd);

       // Output hypotenuse
       System.out.println("The hypotenuse of the right triangle is " + dblHypotenuse);
    }
}     
```
# Working with Angles
When using trigonometric functions like Math.cos or Math.Sin, you must supply the angle in radians.  You can use the Math.toRadians() method to convert from degrees to radians.

      //a radians example
       double angle_deg = 45.0;
       double cos_angle = Math.cos(Math.toRadians(angle_deg));







