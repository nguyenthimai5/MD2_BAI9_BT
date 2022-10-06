package BT1;

public class NextDayCalculator {

    public  String getNextDay(String currentDay) {
     String[] arrList=currentDay.split("-");
     int day=Integer.parseInt(arrList[2]);
     int month=Integer.parseInt(arrList[1]);
     int year=Integer.parseInt(arrList[0]);
     int nextDay=day+1;
     int nextMonth=month+1;
     int nextYear=year+1;
     String nextDate="";

        if (month != 2) {
            if (month <= 12 && month > 0) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                    if (day > 0 && day < 31) {
                      nextDate= year+"-"+month+"-"+nextDay;
                    } else {
                        nextDate= year+"-"+nextMonth+"-"+1;

                    }
                } else if (month == 12) {
                    if (day > 0 && day < 31) {
                        nextDate= year+"-"+month+"-"+nextDay;

                        System.out.printf("%d/%d/%d\n", nextDay, month, year);
                    } else {
                        nextDate= nextYear+"-"+1+"-"+1;
                    }

                } else {
                    if (day > 0 && day < 30) {
                        nextDate= year+"-"+month+"-"+nextDay;
                    } else {
                        nextDate= year+"-"+nextMonth+"-"+1;
                    }
                }
            } else {
                System.err.println("Vui long nhap thang tu 1-12!");
            }


        } else {
            if (year % 4 == 0 && year % 400 == 0) {
                if (day > 0 && day < 29) {
                    nextDate= year+"-"+month+"-"+nextDay;

                } else {
                    nextDate= year+"-"+nextMonth+"-"+1;

                }
            } else {
                if (day > 0 && day < 28) {
                    nextDate= year+"-"+month+"-"+nextDay;
                } else {
                    nextDate= year+"-"+nextMonth+"-"+1;

                }

            }

        }
        return nextDate;
    }
}
