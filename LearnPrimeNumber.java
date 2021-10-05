package week1.day1;

public class LearnPrimeNumber {

	public static void main(String[] args) {
int i=13;
boolean flag=false;

for(int j=2; j<i/2;j++)
{
	if(i%j==0)
	{
		flag=true;
		break;
	}
	}
if (flag==true) {
	System.out.println("Not prime");
} else {
	System.out.println("Prime");

}
}
	

}
