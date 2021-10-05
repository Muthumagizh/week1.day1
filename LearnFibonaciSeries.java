package week1.day1;

public class LearnFibonaciSeries {

	public static void main(String[] args) {
		int a = 8;
		int i = 0;
		int j = 1;
		for (int b = 0; b < a; b++) {
			
			int k = i + j;
			System.out.println(i);
			i = j;
			j = k;

		}
	}

}
