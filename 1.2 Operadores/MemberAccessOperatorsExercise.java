
/*
Operadores de Acesso a Membros

Como o ponto (`.`) para acessar membros de um objeto ou classe.

Neste exemplo, usamos o operador de acesso a membros para acessar e modificar um campo de um objeto.
*/
class SampleClass {
    int field;
}

public class MemberAccessOperatorsExercise {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.field = 10;

        System.out.println("Field value: " + obj.field);
    }
}
