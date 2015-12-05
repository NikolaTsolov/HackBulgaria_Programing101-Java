package tasks;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	
	private int day;
	private int monts;
	private int years;
	
	private int hours;
	private int minutes;
	
	private static final SimpleDateFormat ft = new SimpleDateFormat("%d:%d:%d %d.%d.%d");

	public Time(int d, int m, int y, int h, int min){
		this.day = d;
		this.monts = m;
		this.years = y;
		
		this.hours = h;
		this.minutes = m;
	}
	
	public Time(){
		Calendar c = Calendar.getInstance();
		ft.format(c.getTime());
	}
	public static Time now(){
		return new Time();
	}
	
	@Override
	public String toString(){
		return String.format("%d:%d:%d %d.%d.%d", hours, minutes, years, day, monts, years);
	}
	
	public static void main(String[] args) {
		
		Time t = Time.now();
		System.out.println(t);
	}
}

