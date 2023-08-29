
/*
Objetos e Pacotes:
Objetos podem ser parte de pacotes, que ajudam a organizar e modularizar o código.

Explicação:
Para simplificar, este exemplo não criará um pacote real. Mas, em um cenário real, 
você pode ter um pacote chamado 'utilities' e uma classe 'Utility' dentro desse pacote. 
Para acessar essa classe de outro pacote, você usaria 'import utilities.Utility;'

NOTA: Este código não pode ser executado diretamente sem criar pacotes apropriados.
*/

// Suponha que isso esteja em um pacote chamado 'utilities'
class Utility {
    public void displayMessage() {
        System.out.println("This is a utility method.");
    }
}

public class ObjectsAndPackages {

    public static void main(String[] args) {
        // Suponha que você tenha importado a classe Utility de utilities
        Utility util = new Utility();
        util.displayMessage();
    }
}
