
/*
Sobrescrita de Métodos (`@Override`):
A subclasse pode fornecer implementações específicas para métodos herdados, chamado de sobrescrita de métodos. 
Isso é feito usando a anotação `@Override`.

Explicação:
Neste exemplo, temos a superclasse 'Bird' e a subclasse 'Sparrow'. A classe 'Sparrow' herda o método 'fly' 
da superclasse 'Bird' e o sobrescreve para fornecer sua própria implementação usando a anotação `@Override`.
*/

class Bird {
    void fly() {
        System.out.println("Bird flies in the sky");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies at a lower altitude");
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
    }
}

