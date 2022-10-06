package BT3;

public class FizzBuzzTranslate {
    public String getNumber(String number) {
        int numberFirst=Integer.parseInt(number);
        String resultNumber="";
        if (numberFirst % 3 == 0 && numberFirst % 5 == 0) {
            resultNumber="FizzBuzz";
        } else if (numberFirst % 3 == 0) {
            resultNumber="Fizz";
        } else if (numberFirst % 5 == 0) {
            resultNumber="Buzz";
        } else {
            resultNumber=numberFirst+"";

        }
        return resultNumber;
    }

    public static String getNumberString(String numberString) {
        String numberStringFirst=numberString;
        String numThree="3";
        String numFive="5";
        String resultNumberString="";
        for (int i = 0; i < numberStringFirst.length(); i++) {
            if (numThree.equals(numberString)){
              resultNumberString="Fizz";

            } else if (numFive.equals(numberString)) {
                resultNumberString="Buzz";
           }
        }
        return resultNumberString;

    }
}
