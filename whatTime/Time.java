package whatTime;

public class Time {
	public static String whatTime(int seconds) {
		int hours;
		int minutes;

		minutes = seconds/60;
		seconds = seconds % 60;
		hours = minutes/60;
		minutes = minutes % 60;
		System.out.println(hours + ":" + minutes + ":" + seconds);
		return hours + ":" + minutes + ":" + seconds;
	}

	public static void main(String[] args) {
		whatTime(60);
	}
}