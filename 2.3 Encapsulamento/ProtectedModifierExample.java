
/*
Modificador protected:
O modificador protected oferece uma visibilidade restrita, mais do que private mas menos do que public. 
Membros protected são acessíveis dentro da mesma classe, pacote e subclasses.

Explicação:
Neste exemplo, temos uma classe 'Parent' no pacote 'family' com um atributo 'familyName' 
declarado como protected. Uma subclasse 'Child' também no pacote 'family' pode acessar 
o atributo 'familyName' diretamente devido ao modificador protected.

NOTA: Este código não pode ser executado diretamente sem criar pacotes apropriados.
*/

// Suponha que isso esteja em um pacote chamado 'family'
class Parent {
    protected String familyName;
}

class Child extends Parent {
    void displayFamilyName() {
        System.out.println("Family Name: " + familyName);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.familyName = "Smith";
        child.displayFamilyName();
    }
}

