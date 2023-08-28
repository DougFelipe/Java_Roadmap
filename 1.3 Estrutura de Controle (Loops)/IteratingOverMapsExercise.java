
/*
Iteração sobre mapas (HashMap, TreeMap)

Usando loops para iterar sobre chaves e valores em mapas.

Neste exemplo, iteramos sobre um HashMap para imprimir suas chaves e valores.
*/
import java.util.HashMap;
import java.util.Map;

public class IteratingOverMapsExercise {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
