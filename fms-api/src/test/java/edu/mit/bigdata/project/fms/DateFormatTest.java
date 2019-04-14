package edu.mit.bigdata.project.fms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		Date curDate = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        String dateToStr = "Sat, 23 Mar 2019 16:15:41 IST"; //format.format(curDate);
        System.out.println(dateToStr);
 
        try {
            Date strToDate = format.parse(dateToStr);
            System.out.println(strToDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}

}
