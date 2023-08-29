
/*
Uso de `final` com Herança:
A palavra-chave `final` pode ser usada para evitar que uma classe seja herdada, um método seja sobrescrito ou um atributo seja modificado.

Explicação:
Neste exemplo, a classe 'ImmutableBox' é declarada como `final`, o que significa que nenhuma outra classe pode herdar dela.
*/

final class ImmutableBox {
    private int width;
    private int height;

    ImmutableBox(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        ImmutableBox box = new ImmutableBox(10, 20);
        System.out.println("Width: " + box.getWidth());
        System.out.println("Height: " + box.getHeight());
    }
}

// The following code will result in a compilation error:
// class ExtendedBox extends ImmutableBox {}  // Cannot inherit from final class

