
/*
Autoboxing e Unboxing

Autoboxing e unboxing são os processos automáticos de conversão entre tipos primitivos e seus 
equivalentes de classes embrulhadoras em Java, como int para Integer.

Neste exemplo, demonstramos autoboxing e unboxing entre int e Integer.
*/
public class AutoboxingUnboxingExercise {
    public static void main(String[] args) {
        // Autoboxing: Convertendo tipo primitivo para objeto
        int primitiveInt = 100;
        Integer integerObject = primitiveInt;

        // Unboxing: Convertendo objeto para tipo primitivo
        int unboxedInt = integerObject;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Integer object (after autoboxing): " + integerObject);
        System.out.println("Int after unboxing: " + unboxedInt);
    }
}
