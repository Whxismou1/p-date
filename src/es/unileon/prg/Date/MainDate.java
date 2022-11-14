package es.unileon.prg1.date;

public class MainDate {
    public static void main(String[] args) {
        Date today;
        Date tomorrow;
        
        try {
            
            System.out.println("Enter a day");
            int day = Teclado.readInteger();
            System.out.println("Enter a month");
            int month = Teclado.readInteger();
            System.out.println("Enter a year");
            int year = Teclado.readInteger();
            today = new Date(day, month, year);
            tomorrow = new Date(14,11,2022);
            System.out.println(today.toString());
            System.out.println("The name of the month is: " + today.getMonthName());
            System.out.println("The season is " + today.getSeason());
            System.out.println("The months left until the last day of the year is: " + today.getMonthsLeft());
            System.out.println("The days left of the months: " + today.getDaysLeftOfMonth());
            System.out.println("The months that have the same days: " + today.getMonthsSameDays());
            System.out.println("The days that have passed since the beginning of the year are: " + today.daysPast());
            System.out.println("Numbers of attempts until the computer get the same date: " + today.randomTriesDateEqual());
            System.out.println("The name of the day: " + today.dayWeek(1));
            
            System.out.println("The second date is: " + tomorrow.toString());
            System.out.println("Same day?: " + today.isSameDay(tomorrow));
            System.out.println("Same month?: " + today.isSameMonth(tomorrow));
            System.out.println("Same year?: " + today.isSameYear(tomorrow));
            System.out.println("Same date?: "+ today.isSame(tomorrow));
            
        } catch(DateException e){
            System.out.println(e.getMessage());
            }
    }
}
