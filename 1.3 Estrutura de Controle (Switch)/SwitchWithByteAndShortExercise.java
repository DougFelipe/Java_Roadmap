
/*
Uso de `switch` com `byte` e `short`

O `switch` pode ser usado com tipos de dados `byte` e `short`.

Neste exemplo, avaliamos um valor `byte` e um valor `short` usando a estrutura `switch`.
*/
public class SwitchWithByteAndShortExercise {
    public static void main(String[] args) {
        byte byteValue = 2;
        short shortValue = 3;

        switch (byteValue) {
            case 1:
                System.out.println("Byte value is one.");
                break;
            case 2:
                System.out.println("Byte value is two.");
                break;
            default:
                System.out.println("Unknown byte value.");
                break;
        }

        switch (shortValue) {
            case 2:
                System.out.println("Short value is two.");
                break;
            case 3:
                System.out.println("Short value is three.");
                break;
            default:
                System.out.println("Unknown short value.");
                break;
        }
    }
}
