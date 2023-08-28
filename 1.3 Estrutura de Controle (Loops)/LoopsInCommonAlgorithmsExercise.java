
/*
Uso de loops em algoritmos comuns

Aplicando estruturas de repetição em algoritmos clássicos, como ordenação e busca.

Neste exemplo, implementamos o algoritmo de busca binária usando um loop `while`.
*/
public class LoopsInCommonAlgorithmsExercise {
    public static void main(String[] args) {
        int[] sortedArray = {-10, -3, 0, 5, 9, 12, 15, 22, 36, 72};
        int target = 9;
        
        int result = binarySearch(sortedArray, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            
            if (arr[m] == x) {
                return m;
            }
            
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
