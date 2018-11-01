package f_oop2;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setSecond(100000);
		t.setMinute(330);
		t.setHour(117);
		t.setDay(0);
		
		int second = t.getSecond();
		int minute = t.getMinute();
		int hour = t.getHour();
		int day = t.getDay();
		
		System.out.print(day + "일  ");
		System.out.print(hour + "시  ");
		System.out.print(minute + "분  ");
		System.out.println(second + "초");
	}
}

class Time{
	private int day;
	private int hour;
	private int minute;
	private int second;
//	public int minutePlus;
//	public int hourPlus;
//	public int dayPlus;
	
//	일
	public void setDay(int day){
////		day += dayPlus;
		this.day = day;
	}
	public int getDay(){
		return day;
	}
	
//	시간
	public void setHour(int hour){
//		hour += hourPlus;
//		if(hour > 23){
			this.hour = hour%24;
			setDay(day + hour/24);
//			this.dayPlus = hour/24;
//		} else {
//			this.hour = hour;
//		}
	}
	public int getHour(){
		return hour;
	}
	
//	분
	public void setMinute(int minute){
//		minute += minutePlus;
//		if(minute > 59){
			this.minute = minute%60;
			setHour(hour + minute/60);
//			this.hourPlus = minute/60;
//		} else {
//			this.minute = minute;
//		}
	}
	public int getMinute(){
		return minute;
	}
	
//	초
	public void setSecond(int second){
//		if(second > 59){
			this.second = second%60;
			setMinute(minute + second/60);
//			this.minutePlus = second/60;
//		} else {
//			this.second = second;
//		}
	}
	public int getSecond(){
		return second;
	}
	
}