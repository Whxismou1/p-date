package es.unileon.prg1.date;

public class Date{
    //Se declaran las variables
    private int day;
    private int month;
    private int year;


    public Date () {
        this.day = 2022;
        this.month = 8;
        this.year = 9;
    }



    public Date(int day, int month, int year) throws DateException{
        /*Se comprueba que el año sea correcto*/
        if (year <= 0){
            throw new DateException("The year "+ year +" is not correct. Enter years with the correct format");
        } else{
            this.year = year;
        }
        /*Se comprueba que el mes sea correcto*/
        if ((month < 1) || (month > 12)){
            throw new DateException("The month "+ month +" is not correct. Enter months between 1-12");
        } else{
            this.month = month;
        }
        /*Se comprueba que el dia sea correcto*/
        switch(this.month){
            /*Se comprueba que el dia de febrero se introduzca bien*/
            case 2:
                if (day <= 0 || day > 28){
                    throw new DateException("The day "+ day +" is not correct. Enter values between 1 and 28");
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
                    throw new DateException("The day "+ day +" is not correct. Enter values between 1 and 31");
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
                throw new DateException("The day "+ day +" is not correct. Enter values between 1 and 30");
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
    
    public Date tomorrow() {
		Date tomorrow = new Date();
		try {
			if(this.getDay()==this.daysOfMonth()) {
				
				tomorrow.setDay(1);
					if(this.getMonth()==12) {
						tomorrow.setMonth(1);
						tomorrow.setYear(this.getYear()+1);
					}else {
						tomorrow.setMonth(this.getMonth()+1);
						tomorrow.setYear(this.getYear());
					}	
			}else {
				tomorrow.setDay(this.getDay()+1);
				tomorrow.setMonth(this.getMonth());
				tomorrow.setYear(this.getYear());
			}
		
		
	}catch(DateException e){
		System.err.println("Date: tomorrow error");
	}
		return tomorrow;
		}

    /*Metodo que nos devuelve la fecha en string */

    /**
     *
     * @return
     */

    @Override
    public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

    /*Metodo que devuelve el dia*/
    public int getDay(){
        return this.day;
    }

    public void setDay(int day) throws DateException{
        switch(this.month){
            /*Se comrpueba que el dia sea correcto de febrero se introduzca bien*/
            case 2:
                if (day <= 0 || day > 28){
                    throw new DateException("The day "+ day +" is not correct. Enter values between 1 and 28");
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
                    throw new DateException("The day "+ day +" is not correct. Enter values between 1 and 31");
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
                throw new DateException("The day "+ day +" is not correct. Enter values between 1 and 30");
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
    public void setMonth(int month) throws DateException{
        if (month > 0 && month <13){
            this.month = month;
        }            
        else {
            throw new DateException("The month "+ month +" is not correct. Enter months between 1-12");
        }
    }

    /*Metodo que devuelve el año*/
    public int getYear(){
        return this.year;
    }
    
    /*Metodo cambia el valor del año por el introducido*/
    public void setYear(int year) throws DateException{
        if (!(year < 0)){
            this.year = year;
        }
        else {
            throw new DateException("The year" + year + "is not correct. Enter year with the correct format");
        }
    }

    /*Este metodo comprueba si dos fechas tienen el mismo dia mediante if */
    public boolean isSameDayWithIf (Date date){
        if (this.getDay() == getDay()){
            return true;
        } 
        else {
            return false;
        }
    }
    /*Este metodo comprueba si dos fechas tienen el mismo dia */
    public boolean isSameDay (Date date){
        return this.getDay() == date.getDay();
    }

    /*Este metodo comprueba si dos fechas tienen el mismo mes mediante el if */
    public boolean isSameMonthWithIf (Date date){
        if (this.getMonth() == getMonth()){
            return true;
        } 
           else {
            return false;
        }
    }

    /*Este metodo comprueba si dos fechas tienen el mismo mes*/
    public boolean isSameMonth (Date date){
        return this.getMonth() == date.getMonth();
    }

    /*Este metodo comprueba si dos fechas tienen el mismo año mediante el if */
    public boolean isSameYearWithIf (Date date){
        if (this.getYear() == getYear()){
            return true;
        } 
        else {
            return false;
        }
    }

    /*Este metodo comprueba si dos fechas tienen el mismo año*/
    public boolean isSameYear(Date date){
        return this.getYear() == date.getYear();
    }

    /*Este metodo comprueba si dos fechas son las mismas mediante el if */
    public boolean isSameWithIf(Date date){
		if (isSameDayWithIf(date)&& isSameMonthWithIf(date) && isSameYearWithIf(date)) {
			return true;
		}else{
			return false;
		}
	}

    /*Este metodo comprueba si dos fechas son las mismas*/
    public boolean isSame(Date date){
		return isSameDay(date)&& isSameMonth(date) && isSameYear(date);
	}

    public String getMonthName(){
        String monthName = " ";
        switch (this.month){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:               
                monthName = "August";
                break;
            case 9:                
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    public String getSeason(){
        String season = "";
        switch (this.month){
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:               
            case 8:                
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
        }
        return season;
    }

    /*Metodo que permite saber cuantos meses faltan hasta el fin de año */
    public String getMonthsLeft(){
		StringBuilder salida = new StringBuilder();
		int aux = this.month;
		
		if (this.month == 12) {
			salida.append("0 months left");
		}

		for (int i = this.month+1 ; i <= 12 ; i++) {
			this.month+=1;
			 salida.append(getMonthName());
			 salida.append(" ");
		}
		this.month= aux;
		return salida.toString();
	}

    /*Metodo que nos devuelve el numero de dias restantes del mes */
	public String getDaysLeftOfMonth(){
		StringBuilder salida = new StringBuilder();
		switch (this.month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				for (int i = this.day + 1; i <= 31 ; ++i ) {
					salida.append(i + "/"+ this.month + "/" +this.year);
					salida.append(" ");
				}
				break;
			case 2:
				for (int i = this.day + 1; i <= 28 ; ++i ) {
					salida.append(i + "/" + this.month + "/" + this.year);
					salida.append(" ");
				}
				break;
			case 4://next
			case 6://next
			case 9://next
			case 11:
				for (int i=this.day+1; i<=30 ; ++i ) {
					
					salida.append(i + "/" + this.month + "/" + this.year);
					salida.append(" ");
				}
				break;
		}
		return salida.toString();
	}

    /*Este metodo devueve los meses que tengan los mismos dias de nuestra mes dado*/

    public String getMonthsSameDays(){
        String months = " ";

        switch(this.month) {
            case 2:
                months = "February";
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                months = "January, March, May, July, August, October & December ";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                months = "April, June, September & November ";
                break;
        }
        return months;
    }

    	public int daysOfMonth(){

		int days_month = 0;

		switch(this.getMonth()){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days_month = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days_month = 30;
				break;
			default: 
				days_month = 28;
		}

		return days_month;
	}
    
    /*Este metodo nos permite mostrar los dias que han pasado desde primcipio de año */
	public int daysPast(){
		int daysPastD=0;
		for (int i = 1; i < this.month; i++) {
		 	switch (i) {
		 		case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					daysPastD += 31;
					break;
				case 2:
					daysPastD += 28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					daysPastD += 30;
					break;
		 	}
		} 
		daysPastD += this.day - 1;
		return daysPastD;
	}
    /*Con este metodo obtenemos el numero de intentos que tarda en generar
     * el ordenador la misma fecha
     */
    public int randomTriesDateEqual() throws DateException{
        int tries = 0;
        int random = 365;

        while(this.daysPast() != random){
            random = (int)(Math.random()*((364-0)+1))+0;
            tries++;
        }
        return tries;
    }

	public String dayWeek(int day) throws DateException {
		
		String dayOfWeek = "";
		int week_day = this.daysPast() % 7;
		
		switch(week_day) {
			case 0:
				dayOfWeek = "Monday";
				break;
			case 1:
				dayOfWeek = "Tuesday";
				break;
			case 2:
				dayOfWeek = "Wednesday";
				break;
			case 3:
				dayOfWeek = "Thursday";
				break;
			case 4:
				dayOfWeek = "Friday";
				break;
			case 5:
				dayOfWeek = "Saturday";
				break;
			case 6:
				dayOfWeek = "Sunday";
				break;
		}    
	    return dayOfWeek;
	}	

}