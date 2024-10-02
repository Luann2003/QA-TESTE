import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        
        quickSort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
    
    
	public static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivot = particao(array, left, right);
			quickSort(array, left, pivot - 1);
			quickSort(array, pivot + 1, right);
		}
	}
		
	
	public static int particao(int[] array, int start, int end) {
		
	    int pivot = array[(start + end) / 2];  
		int left = start - 1;
		int right = end + 1;

		while (true) {
			do {
				left++;
			} while (array[left] < pivot);
			do {
				right--;
			} while (array[right] > pivot);

			
			if(left >= right) {
				return right;
			}
			
			int aux = array[left];
			array[left] = array[right];
			array[right] = aux;
			
		}
	}

}
