public class Minutes_To_Years_and_Days_Calculator {
    public static void printYearsAndDays(long minutes){
            long hours = minutes/60;
            long days = hours/24;
            long years = days/365;
            long new_days = days -365*years;
            String str_days = Long.toString(new_days);
            String str_years = Long.toString(years);
            String str_minutes = Long.toString(minutes);
            System.out.println(str_minutes+" min =" +str_years+ " y and "+str_days+"d");


    }

    public static void main(String[] args) {
        printYearsAndDays(561600 );
    }
}
