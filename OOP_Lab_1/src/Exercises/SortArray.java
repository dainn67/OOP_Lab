package Exercises;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = {1789, 2035, 1899, 1456, 2013};
		
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
        	sum += arr[i];
        }
        double avgVal = (double)sum / arr.length;
        System.out.print("Sum = " + sum + "\nAverage value = " + avgVal);
	}
}
