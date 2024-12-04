public class WaterOutput {

    public static void main(String[] args){ // "String args[]" as parameters works too
        
        // initialization block of variables for later use
        int precipitation = 0;  // in %-age chance of rain
        int waterOutput = 0;    // in liters
        int temp = 99;          // in Fahrenheit

        /*nested conditional if (only this one is mandatory), else if, else statements */

        // if precipation less than 20 ...
        if (precipitation < 20){
            // ... and temperature is less than 80 degrees Fahrenheit ...
            if(temp <= 80){
                // set the sprinklers to pump out 30L of water
                waterOutput = 30;
            }
            // ... if the temperature is higher than 80 degrees Fahrenheit
            else{
                // adjust sprinklers to spray out 50L of water 
                waterOutput = 50;
            }
        }
        // otherwise if precipitation is b/t 20-30 (this elif statement will only run if above if statement does NOT)
        else if (precipitation < 31){
            if(temp <= 80){
                waterOutput = 10; 
            }
            else{
                waterOutput = 25;
            }
        }
        // now if precipitation conditional does NOT match either if or elif statements above ... b/t [31, 55]
        else if (precipitation < 56){
            if(temp <= 80){
                waterOutput = 0;
            }
            else{
                waterOutput = 15;
            }
        }
        // run this if none of the if & elif statements fulfills the conditions
        else {
            waterOutput = 0;
        }

        System.out.println("The water output should be " + waterOutput);
    }
}