package es.unileon.prg1.date;

public class date{
    //Se declaran las variables
    private int day;
    private int month;
    private int year;


    public Date () {
        this.day = 2022;
        this.month = 8;
        this.year = 9;
    }



    public Date(int day, int month, int year){
        /*Se comprueba que el año sea correcto*/
        if (year <= 0){
            System.out.println("The year is incorrect. It cannot be negative");
        } else{
            this.year = year;
        }
        /*Se comprueba que el mes sea correcto*/
        if ((month < 1) || (month > 12)){
            System.out.println("The month is incorrect. Enter values between 1 and 12");
        } else{
            this.month = month;
        }
        /*Se comprueba que el dia sea correcto*/
        switch(this.month){
            /*Se comprueba que el dia sea correcto de febrero se introduzca bien*/
            case 2:
                if (day <= 0 || day > 28){
                    System.out.println("The day is incorrect. Enter values between 1 and 28");
                }
                else{
                    this.day = day;
                }
                break;
            /*Se comprueba que el dia sea correcto de los meses de 31 dias*/
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day <= 0 || day > 31){
                    System.out.println("The day is incorrect. Enter values between 1 and 31");
                }
                else{
                    this.day = day;
                }
                break;
            /*Se comrpueba que el dia sea correcto de los meses de 30 dias*/
            case 4:
            case 6:
            case 9:
            case 11:
            if (day <= 0 || day > 30){
                System.out.println("The day is incorrect. Enter values between 1 and 30");
            }
            else{
                this.day = day;
            }
            break;
        }
    }
    /*Constructor mediante el cual se clona la fecha*/
    public Date (Date anotherDate){
        this.day = anotherDate.getDay();
        this.month = anotherDate.getMonth();
        this.year = anotherDate.getYear();
    }

    /*Metodo que devuelve el dia*/
    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        switch(this.month){
            /*Se comrpueba que el dia sea correcto de febrero se introduzca bien*/
            case 2:
                if (day <= 0 || day > 28){
                    System.out.println("The day is incorrect. Enter values between 1 and 28");
                }
                else{
                    this.day = day;
                }
                break;
            /*Se comrpueba que el dia sea correcto de los meses de 31 dias*/
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day <= 0 || day > 31){
                    System.out.println("The day is incorrect. Enter values between 1 and 31");
                }
                else{
                    this.day = day;
                }
                break;
            /*Se comrpueba que el dia sea correcto de los meses de 30 dias*/
            case 4:
            case 6:
            case 9:
            case 11:
            if (day <= 0 || day > 30){
                System.out.println("The day is incorrect. Enter values between 1 and 30");
            }
            else{
                this.day = day;
            }
            break;
        }
    }

    /*Metodo que devuelve el mes*/
    public int getMonth(){
        return this.month;
    }
    /*Metodo cambia el valor del mes por el introducido*/
    public void setMonth(int month){
        if (month > 0 && month <13){
            this.month = month;
        }            
        else {
            System.out.println("The month is incorrect. Enter values between 1 and 12");
        }
    }

    /*Metodo que devuelve el año*/
    public int getYear(){
        return this.year;
    }
    
    /*Metodo cambia el valor del año por el introducido*/
    public void setYear(int year){
        if (!(year < 0)){
            this.year = year;
        }
        else {
            System.out.println("The year is incorrect. It cannot be negative");
        }
    }

    /*Este metodo comprueba si dos fechas tienen el mismo año */
    public boolean isSameYear (Date date){
        if (this.getYear() == getYear()){
            return true;
        } 
        else {
            return false;
        }
    }

    /*Este metodo comprueba si dos fechas tienen el mismo mes */
    public boolean isSameMonth (Date date){
        if (this.getMonth() == getMonth()){
            return true;
        } 
        else {
            return false;
        }
    }

    /*Este metodo comprueba si dos fechas tienen el mismo dia */
    public boolean isSameDay (){
        if (this.getDay() == getDay()){
            return true;
        } 
        else {
            return false;
        }
    }

    public boolean isSame (){
        
    }






}