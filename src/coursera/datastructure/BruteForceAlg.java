package coursera.datastructure;

public class BruteForceAlg {
	public int count(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0)
						count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 30, -40, -20, -10, 40, 0, 10, 5 };
		int i = new BruteForceAlg().count(arr);
		System.out.println("i value is "+i);
				System.out.println("---------gana bajana----------------------------");
		System.out.println("-------------------------------------");
	}
}
