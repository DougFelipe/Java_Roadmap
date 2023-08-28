
/*
Performance e otimização de loops

Técnicas para otimizar loops e entender o impacto da performance.

Neste exemplo, comparamos a performance entre loops usando diferentes tamanhos de listas.
*/
public class LoopPerformanceExercise {
    public static void main(String[] args) {
        long startTime, endTime;
        
        int[] numbers = new int[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        
        startTime = System.currentTimeMillis();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with regular for loop: " + (endTime - startTime) + " ms");
        
        startTime = System.currentTimeMillis();
        for (int num : numbers) {
            num = num * 2;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with for-each loop: " + (endTime - startTime) + " ms");
    }
}
