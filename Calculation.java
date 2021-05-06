import java.text.DecimalFormat;

public class Calculation {
	
	public static String calculation(double operand1, double operand2, String operator) {
		double ans;
		switch(operator) {
		case "+":
			ans = operand1 + operand2;
			break;
		case "-":
			ans = operand1 - operand2;
			break;
		case "*":
			ans = operand1 * operand2;
			break;
		case "/":
			ans = operand1 / operand2;
			break;
		default:
			ans = 0;
			break;
		}
		DecimalFormat df = new DecimalFormat();
		String result = df.format(ans);
		return result;
	}
}