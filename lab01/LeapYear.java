package lab1;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year=2104;
        if(year%400==0 || (year%4==0 && year%100!=0)){
        	System.out.println(year+" is a leap year.");
        }
	}

}
