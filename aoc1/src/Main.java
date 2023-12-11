import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)
            throws FileNotFoundException,ArrayIndexOutOfBoundsException {
        File calibrationValue = new File("calibrationValues.txt");
        Scanner myReader = new Scanner(calibrationValue);

        HashMap<String, Integer> numbers = new HashMap<>();
            numbers.put("one",1);
            numbers.put("two",2);
            numbers.put("three",3);
            numbers.put("four",4);
            numbers.put("five",5);
            numbers.put("six",6);
            numbers.put("seven",7);
            numbers.put("eight",8);
            numbers.put("nine",9);



            int firstDigit=0, lastDigit=0;
            long twoDigitNumber =0l;

            while (myReader.hasNextLine()) {
                boolean isFirstDigit=false;
                String calibrationRow = myReader.nextLine();
                char[] row = calibrationRow.toCharArray();
                for(char x:row){
                    int asciiValue=Character.getNumericValue(x);
                    if(asciiValue>=0 && asciiValue<=9){
                        if(isFirstDigit==false){
                            firstDigit=asciiValue;
                            isFirstDigit=true;
                        }
                        System.out.println(asciiValue);
                        lastDigit=asciiValue;
                    }
                }
                twoDigitNumber+=firstDigit*10+lastDigit;
                System.out.println("first digit: "+firstDigit+" last digit: "+lastDigit+" two digit number: "+twoDigitNumber);
                System.out.println("-----------------------------");


            }
            myReader.close();
        }

}