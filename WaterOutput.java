public class WaterOutput {

    public static void main(String[] args){ // "String args[]" as parameters works too
        int precipitation = 0;  
        int waterOutput = 0;

        //start an if-statement
        if (precipitation < 20){
            waterOutput = 30;
        }else if (precipitation < 31){
            waterOutput = 10; 
        }else if (precipitation < 56){
            waterOutput = 0;
        }else {
            waterOutput = 0;
        }

        System.out.println("The water output should be " + waterOutput);
    }
}