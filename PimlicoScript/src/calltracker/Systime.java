package calltracker;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Systime {

	public static void main(String[] args) {
	       //getting current date and time using Date class
	       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	       Date dateobj = new Date();
	       System.out.println(df.format(dateobj));

	}
}
