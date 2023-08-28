
/*
Operadores Bit a Bit

Operam a nível de bits e incluem AND bit a bit (`&`), OR bit a bit (`|`), XOR bit a bit (`^`), complemento bit a bit (`~`), deslocamento à esquerda (`<<`), deslocamento à direita (`>>`) e deslocamento à direita com preenchimento zero (`>>>`).

Neste exemplo, realizamos algumas operações bit a bit.
*/
public class BitwiseOperatorsExercise {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        System.out.println("a & b = " + (a & b));   // Bitwise AND
        System.out.println("a | b = " + (a | b));   // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b));   // Bitwise XOR
        System.out.println("~a = " + (~a));         // Bitwise Complement
        System.out.println("a << 1 = " + (a << 1)); // Left Shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right Shift
    }
}
