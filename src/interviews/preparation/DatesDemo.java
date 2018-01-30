package interviews.preparation;

import java.util.Arrays;
import java.util.HashMap;

public class DatesDemo {
	static String[] reformatDate(String[] dates) {
        HashMap<String, Integer> days = new HashMap<String, Integer>(); // 1st - index 0, 2nd - index 1 etc
        // Add days format to map
        days.put("1st", 01);
        days.put("2nd", 02);
        days.put("3rd", 03);
        days.put("4th", 04);
        days.put("5th", 05);
        days.put("6th", 06);
        days.put("7th", 07);
        days.put("8th", 8);
        days.put("9th", 9);
        days.put("10th", 10);
        days.put("11th", 11);
        days.put("12th", 12);
        days.put("13th", 13);
        days.put("14th", 14);
        days.put("15th", 15);
        days.put("16th", 16);
        days.put("17th", 17);
        days.put("18th", 18);
        days.put("19th", 19);
        days.put("20th", 20);
        days.put("21st", 21);
        days.put("22nd", 22);
        days.put("23rd", 23);
        days.put("24th", 24);
        days.put("25th", 25);
        days.put("26th", 26);
        days.put("27th", 27);
        days.put("28th", 28);
        days.put("29th", 29);
        days.put("30th", 30);
        days.put("31st", 31);


        
        // Add months' format to map
        HashMap<String, Integer> months = new HashMap<String, Integer>(); // for 01 - Jan, 02 - Feb etc
        months.put("Jan", 01);
        months.put("Feb", 02);
        months.put("Mar", 03);
        months.put("Apr", 04);
        months.put("May", 05);
        months.put("Jun", 06);
        months.put("Jul", 07);
        months.put("Aug", 8);
        months.put("Sep", 9);
        months.put("Oct", 10);
        months.put("Nov", 11);
        months.put("Dec", 12);


        String[] retDates = new String[dates.length];
    
        int index = 0;
        for(int i = 0; i < dates.length; i++) {
            String[] dateSplit = dates[i].split(" "); // Split individual date by " " to get three indices 21st,Oct,2052
            // Retrieve Month's value and year's value from respective maps
            String addString = dateSplit[2] + "-" + months.get(dateSplit[1]) + "-" + days.get(dateSplit[0]);
            // Add each iteration of dates to the retDates
            retDates[index++] = addString;
        }
        // return result dates here
        return retDates;
    

}
	
	public static void main(String[] args) {
		String[] str = {"21st Oct 2052", "22nd Nov 2099"};
		//String[] res = reformatDate(str);
		//System.out.println(Arrays.asList(res));
		int x = 4;
		System.out.println(-(~x));
	}


}
