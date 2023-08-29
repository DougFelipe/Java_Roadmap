
/*
Definição de Classe:
Uma Classe atua como um modelo ou protótipo a partir do qual os objetos são instanciados. 
Ela define os atributos (variáveis) e métodos (funções) que seus objetos terão.

Explicação:
No exemplo abaixo, temos uma classe simples chamada 'Car' com um atributo 'color' e um método 'drive'.
*/

public class DefinitionClass {
    String color;

    public void drive() {
        System.out.println("The " + color + " car is driving.");
    }

    public static void main(String[] args) {
        DefinitionClass myCar = new DefinitionClass();
        myCar.color = "red";
        myCar.drive();
    }
}
