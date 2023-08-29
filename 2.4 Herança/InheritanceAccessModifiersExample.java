
/*
Herança e Modificadores de Acesso:
A herança é afetada pelos modificadores de acesso. Por exemplo, membros `private` não são acessíveis nas subclasses.

Explicação:
Neste exemplo, a classe 'Rectangle' possui um atributo privado 'length' e um atributo protegido 'width'. 
A subclasse 'Square' pode acessar 'width' diretamente devido ao modificador protegido, mas não pode acessar 'length'.
*/

class Rectangle {
    private int length = 10;
    protected int width = 5;
    
    public int getLength() {
        return length;
    }
}

class InheritanceAccessModifiersExample extends Rectangle {
    void displayDimensions() {
        // System.out.println("Length: " + length);  // This will result in an error
        System.out.println("Length: " + getLength());  // Accessing using public method
        System.out.println("Width: " + width);  // This is accessible
    }

    public static void main(String[] args) {
        InheritanceAccessModifiersExample rect = new InheritanceAccessModifiersExample();
        rect.displayDimensions();
    }
}

