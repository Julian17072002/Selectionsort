
public class Selectionsort {

	public static void main(String[] args) {

	
	int[] unsortiert = { 6, 8, 2, 4, 1, 2, 3, 1, 1 };
	int[] sortiert = selectionsort(unsortiert);

	for (int i = 0; i < sortiert.length; i++) {
		System.out.print(sortiert[i] + ", ");
	}

}

public static int[] selectionsort(int[] sortieren) {
	for (int i = 0; i < sortieren.length - 1; i++) {
		for (int j = i + 1; j < sortieren.length; j++) {
			if (sortieren[i] > sortieren[j]) {
				int temp = sortieren[i];
				sortieren[i] = sortieren[j];
				sortieren[j] = temp;
			}
		}
	}

	return sortieren;
}
}
