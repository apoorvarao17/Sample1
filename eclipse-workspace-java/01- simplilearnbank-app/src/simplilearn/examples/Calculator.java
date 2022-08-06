package simplilearn.examples;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s1 = getInput("Enter a numeric value:");
		String s2 = getInput("Enter a numeric value:");
		
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double result = addTwoValues(d1,d2);
		System.out.println("The answer is:" + result);*/
		
		double resultOfMultiple = addMultipleValues(1,2,3,4,5);
		System.out.println("The answer is:" + resultOfMultiple);
		

	}

	private static double addMultipleValues(double ...values) {
		double result =0;
		for(double d:values) {
			result += d;
		}
		return result;
	}
}
