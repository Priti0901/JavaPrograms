package programs;

public class FindSumInSingleDigit {

	public static void main(String[] args) {
		int num1 = 12123123;
		while(num1>9) {
			num1=getSum(num1);
		}
		System.out.println("sum of given no in one digit is: "+num1);
	}
	static int getSum(int number) {
		int num = number;
		int reminder;
		int sum=0;
		while(num>=1) {
			reminder=num%10;
			sum = sum+reminder;
			num=num/10;
		}
		return sum;
	}
}
