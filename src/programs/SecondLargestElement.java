package programs;

//program to find second largest number in an array method 2
public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 12, 2, 14, 7, 32, 31, 18, 23, 22, 11 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(arr[arr.length - 2]);
	}

}
