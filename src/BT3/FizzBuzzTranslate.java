package BT3;

public class FizzBuzzTranslate {
    public String getNumber(String number) {
        int numberFirst = Integer.parseInt(number);
        String resultNumber = "";
        if (numberFirst % 3 == 0 && numberFirst % 5 == 0) {
            resultNumber = "FizzBuzz";
        } else if (numberFirst % 3 == 0) {
            resultNumber = "Fizz";
        } else if (numberFirst % 5 == 0) {
            resultNumber = "Buzz";
        } else {
            resultNumber = numberFirst + "";

        }
        return resultNumber;
    }

    public String getNumberString(String numberString) {
        String numberStringFirst = numberString;
        String resultNumberString = "";
        for (int i = 0; i < numberStringFirst.length(); i++) {
            if (numberString.charAt(i)=='3') {
                resultNumberString = "Fizz";

            } else if (numberString.charAt(i)=='5') {
                resultNumberString = "Buzz";
            }
        }
        return resultNumberString;

    }

    public String getNumberRead(int num) {
        String str_output = "";
        if (num < 10) {
            switch (num) {
                case 0:
                    str_output = "Khong";
                    break;
                case 1:
                    str_output = "Mot";
                    break;
                case 2:
                    str_output = "Hai";
                    break;
                case 3:
                    str_output = "Ba";
                    break;
                case 4:
                    str_output = "Bon";
                    break;
                case 5:
                    str_output = "Nam";
                    break;
                case 6:
                    str_output = "Sau";
                    break;
                case 7:
                    str_output = "Bay";
                    break;
                case 8:
                    str_output = "Tam";
                    break;
                default:
                    str_output = "Chin";

            }
        } else if (num < 100) {
            int chuc, donVi;
            chuc = num / 10;
            donVi = num % 10;
            switch (chuc) {
                case 1:
                    str_output += "Mot chuc";
                    break;
                case 2:
                    str_output += "Hai chuc";
                    break;
                case 3:
                    str_output = "Ba chuc";
                    break;
                case 4:
                    str_output = "Bon chuc";
                    break;
                case 5:
                    str_output = "Nam chuc";
                    break;
                case 6:
                    str_output = "Sau chuc";
                    break;
                case 7:
                    str_output = "Bay chuc";
                    break;
                case 8:
                    str_output = "Tam chuc";
                    break;
                default:
                    str_output = "Chin chuc";
            }
            switch (donVi) {
                case 0:
                    str_output += " Khong don vi";
                    break;
                case 1:
                    str_output += " Mot don vi";
                    break;
                case 2:
                    str_output += " Hai don vi";
                    break;
                case 3:
                    str_output += " Ba don vi";
                    break;
                case 4:
                    str_output += " Bon don vi";
                    break;
                case 5:
                    str_output += " Nam don vi";
                    break;
                case 6:
                    str_output += " Sau don vi";
                    break;
                case 7:
                    str_output += " Bay don vi";
                    break;
                case 8:
                    str_output += " Tam don vi";
                    break;
                default:
                    str_output += " Chin don vi";
            }
        } else {
            int tram, chuc, dvi;
            tram = num / 100;
            chuc = (num % 100) / 10;
            dvi = num % 10;
            switch (tram) {
                case 1:
                    str_output += "Mot tram";
                    break;
                case 2:
                    str_output += "Hai tram";
                    break;
                case 3:
                    str_output = "Ba tram";
                    break;
                case 4:
                    str_output = "Bon tram";
                    break;
                case 5:
                    str_output = "Nam tram";
                    break;
                case 6:
                    str_output = "Sau tram";
                    break;
                case 7:
                    str_output = "Bay tram";
                    break;
                case 8:
                    str_output = "Tam tram";
                    break;
                case 9:
                    str_output = "Chin tram";
            }
            switch (chuc) {
                case 1:
                    str_output += " Mot chuc";
                    break;
                case 2:
                    str_output += " Hai chuc";
                    break;
                case 3:
                    str_output += " Ba chuc";
                    break;
                case 4:
                    str_output += " Bon chuc";
                    break;
                case 5:
                    str_output += " Nam chuc";
                    break;
                case 6:
                    str_output += " Sau chuc";
                    break;
                case 7:
                    str_output += " Bay chuc";
                    break;
                case 8:
                    str_output += " Tam chuc";
                    break;
                case 9:
                    str_output += " Chin chuc";
            }
            switch (dvi) {
                case 1:
                    str_output += " Mot don vi";
                    break;
                case 2:
                    str_output += " Hai don vi";
                    break;
                case 3:
                    str_output += " Ba don vi";
                    break;
                case 4:
                    str_output += " Bon don vi";
                    break;
                case 5:
                    str_output += " Nam don vi";
                    break;
                case 6:
                    str_output += " Sau don vi";
                    break;
                case 7:
                    str_output += " Bay don vi";
                    break;
                case 8:
                    str_output += " Tam don vi";
                    break;
                case 9:
                    str_output += " Chin don vi";
            }
        }
        return "PHIEN AM: " + str_output;



    }
}
