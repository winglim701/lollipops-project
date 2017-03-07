import java.util.*;

import com.sqa.wc.helpers.*;

/**
 *   File Name: BasicApp.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 6, 2017
 *
 */

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */
public class BasicApp {

	static String appName = "Basic Fundamentals";
	static String user;
	static int numOfLollipops;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set the user cariable to the value returned from the helper method of
		// AppBasics given an appName
		user = AppBasics.welcomeUserAndName(appName);
		// Exectute the core method the calculate cups of coffee
		requestNumOfLollipops();
		// Call the farewell method of the AppBasics helper class given the app
		// name and username
		AppBasics.farewellUser(appName, user);
	}

	/**
	*
	*/
	private static void requestNumOfLollipops() {
		String input;
		double output;
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many lollipops would you like " + user + "? ");
		input = scanner.nextLine();
		numOfLollipops = Integer.parseInt(input.trim());
		System.out.print("How many more lollipops were added in the in the afternoon by a generous guest" + user + "?");
		String input1 = scanner.nextLine();
		int numOfLollipops1 = Integer.parseInt(input1.trim());
		System.out.print("How many times the lollipops were multiplied by caring Crusty the Clown" + user + "?");
		String input2 = scanner.nextLine();
		int numOfLollipops2 = Integer.parseInt(input2.trim());
		System.out.print("how many children all shared the total lollipops by the end of the day" + user + "?");
		String input3 = scanner.nextLine();
		int numOfLollipops3 = Integer.parseInt(input3.trim());
		System.out.println("Each child has "
				+ (output = (numOfLollipops + numOfLollipops1) * numOfLollipops2 / numOfLollipops3) + " lollipops");
	}
}