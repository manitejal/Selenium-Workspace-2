package SeleniumClass1;

public class HomeWork2 {

	public static void main(String[] args) {

		// Define array in double data type and print

		double[] a = { 10.1, 20.1, 30.1, 40.1, };

		for (int b = 0; b < a.length; b++) {
			System.out.println(a[b]);
		}

//======================================================
// We have string called Test automation
		String name = "Test automation";

//need to identify how whether auto text is available

		System.out.println(name.substring(5, 9));

		System.out.println(name.contains("Test")); // dynamic way

// i want you if user pass value 'testing' then it needs to print value is available

		if (name.contains("testing")) {

			System.out.println("Value is available");
		}

//if i pass a value as case sensitve still it needs print that value is available

		if (name.equalsIgnoreCase("TEST")) {

			System.out.println("Value is available");

		}

	}

}
