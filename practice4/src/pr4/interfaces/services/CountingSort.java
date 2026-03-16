package pr4.interfaces.services;

public class CountingSort {
    public static int[] sort (int arr[]) {
        int[] count = new int[11];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int[] sorted = new int[arr.length];
        int idx = 0;
        for(int j = 0; j <=10; j++) {
            while(count[j] > 0) {
                sorted[idx] = j;
                idx++;
                count[j]--;
            }
        }
        return sorted;
    }
}
