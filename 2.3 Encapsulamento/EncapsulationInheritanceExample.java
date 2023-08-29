
/*
Encapsulamento e Herança:
A herança pode ser afetada pelos modificadores de acesso. Por exemplo, um membro private não é herdado por uma subclasse.

Explicação:
No exemplo abaixo, temos uma classe 'ParentClass' com um atributo private 'privateData' e um atributo protected 'protectedData'.
A subclasse 'ChildClass' pode acessar 'protectedData' diretamente devido ao modificador protected, mas não pode acessar 'privateData'.
*/

class ParentClass {
    private String privateData = "Private Data in Parent";
    protected String protectedData = "Protected Data in Parent";
}

class EncapsulationInheritanceExample extends ParentClass {
    void displayData() {
        // System.out.println(privateData);  // This will result in an error
        System.out.println(protectedData);  // This is accessible
    }

    public static void main(String[] args) {
        EncapsulationInheritanceExample child = new EncapsulationInheritanceExample();
        child.displayData();
    }
}

