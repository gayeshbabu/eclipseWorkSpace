package examplearrays;

public class StringArray {

	public static void main(String[] args) {

		String[] daysOfWeek = { "sunday", "monday", "tuesday", "wednesday", "thrusday", "friday", "saturday" };

		String daysWithMostCharacters = " ";
		for (String day : daysOfWeek) {
			if (day.length() > daysWithMostCharacters.length()) {
				daysWithMostCharacters = day;
				

			}
		}
		System.out.println("days With Most Number of Character " + daysWithMostCharacters);

		for (int i = 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
			
		}
		System.out.println();
		for (int i=daysOfWeek.length-1; i>=0; i--) {
			System.out.println(daysOfWeek[i]);

		}
	}
}
