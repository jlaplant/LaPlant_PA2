import java.util.Scanner;
public class BMI {
    public static double bmi(double height, double weight) { //Use floating point variables to account for the decimal places
        return (weight * 703 / Math.pow(height, 2)); //calculate BMI by multiplying weight by 703 divided by height by the power of 2
    }

  public static double body(Scanner kilo ) { //create a class for the body weight and height that will be floating-point variables
      //initialize weight and height variables
      double weight = kilo.nextDouble();
      double height = kilo.nextDouble();

      return bmi(height, weight);

  }

  public static void categories(double bmi) { //create class for the BMI categories
      System.out.printf("BMI = %f\n",bmi);
      //create if else statements to calculate the correct BMI categories
      if (bmi < 18.5) {
          System.out.println("underweight");
      } else if (bmi < 25) {
          System.out.println("Healthy");
      } else if (bmi < 30) {
          System.out.println("overweight");
      } else {
          System.out.println("obese");
      }
  }

	public static void main(String[] args) {
		  Scanner scnr = new Scanner(System.in);
	        double bmi1 = body(scnr);
	        categories(bmi1);

	}

}
