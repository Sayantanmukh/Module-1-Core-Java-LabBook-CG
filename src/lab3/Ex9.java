package lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Ex9 {
	static void Duration(LocalDate date1) {
		//LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(date1, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
	
		
	}
	public static void main(String[] args) throws ParseException {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter date");
			String d=sc.nextLine();
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d);
		//	Ex9.Duration(date1);
			
		}

}
