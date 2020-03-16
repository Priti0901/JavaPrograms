package programs;

/*
 * Armstrong number is a number that is equal to the sum of cubes of its digits for example
 0, 1, 153, 370, 371 etc.
 */
public class ArmstrongNo {

	public static void main(String[] args) {
		int r, temp, sum = 0;
		int n = 153;
		temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + (r * r * r);
		}
		if (temp == sum)
			System.out.println("Armstrong no");
		else
			System.out.println("Not a Armstrong no");
	}

}
