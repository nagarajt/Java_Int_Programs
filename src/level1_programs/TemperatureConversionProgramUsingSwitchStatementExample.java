package level1_programs;

import java.util.Scanner;

public class TemperatureConversionProgramUsingSwitchStatementExample {
	 public static void main(String[] args) {
		 
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter 1 for Fahrenheit to Celsius \n"
                      + "Enter 2 for Celsius to Fahrenheit conversion : ");
         int operation = scanner.nextInt();
         
         System.out.print("Enter temperature : ");
         float temperature = scanner.nextFloat();
         
         float convertedTemperature = 0f;
         
         /*
          * Perform temperature conversion using switch statement in Java.
          */
         switch (operation) {
         
         //Fahrenheit to Celsius temperature conversion
         case 1:
                convertedTemperature = ((temperature - 32) * 5) / 9;
                System.out.println(temperature + " Fahrenheit " + " in Celsius = "
                             + convertedTemperature);
                break;
                
         //Celsius to Fahrenheit temperature conversion
         case 2:
                convertedTemperature = (9 * temperature / 5) + 32;
                System.out.println(temperature + " Celsius " + " in Fahrenheit = "
                             + convertedTemperature);
                break;

         default: // optional
                System.out.println("Enterd temerature is Invalid");
                break; // optional
         }
  }

}
