package week1.day1;

public class LearnCondition {
	public static void main(String[] args) {
		int integer = 5;
		if (integer % 3 == 0 && integer % 5 == 0)

		{
			System.out.println("Trizz-Fizz");
		} else if (integer % 3 == 0)

		{
			System.out.println("Trizz");
		} else if (integer % 5 == 0)

		{
			System.out.println("Fizz");
		}
	}

}
