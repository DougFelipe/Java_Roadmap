## 1. Conceito de Herança
Herança é um dos pilares da orientação a objetos que permite criar uma nova classe com base em uma classe existente. A nova classe herda atributos e comportamentos da classe base.
## 2. Classe Base (Superclasse) e Classe Derivada (Subclasse)
Na herança, a classe da qual outra classe herda é chamada de superclasse ou classe base, enquanto a classe que herda é chamada de subclasse ou classe derivada.
## 3. Uso da palavra-chave `extends`
Em Java, a herança é implementada usando a palavra-chave `extends`. A subclasse `extends` a superclasse.
## 4. Sobrescrita de Métodos (`@Override`)
A subclasse pode fornecer implementações específicas para métodos herdados, chamado de sobrescrita de métodos. Isso é feito usando a anotação `@Override`.
## 5. Uso de `super`
O `super` é uma palavra-chave em Java que se refere ao objeto da superclasse imediata. É usado para chamar o construtor da superclasse e para acessar métodos e atributos da superclasse.
## 6. Hierarquia de Herança
É possível ter uma cadeia de classes que herdam umas das outras, formando uma hierarquia de herança.
## 7. Herança e Modificadores de Acesso
A herança é afetada pelos modificadores de acesso. Por exemplo, membros `private` não são acessíveis nas subclasses.
## 8. Herança e Construtores
Os construtores não são herdados, mas a subclasse pode chamar o construtor da superclasse usando a palavra-chave `super`.
## 9. Bloco de Inicialização `static` e Herança
Em uma hierarquia de classes, os blocos de inicialização `static` são chamados na ordem em que as classes são carregadas na memória.
## 10. Classe `Object` - A Raiz de Todas as Classes
Em Java, todas as classes herdam implicitamente da classe `Object`, que é a superclasse de todas as classes em Java.
## 11. Herança Múltipla e Interfaces
Java não suporta herança múltipla com classes devido à ambiguidade. No entanto, uma classe pode implementar várias interfaces, o que é uma forma de herança múltipla.
## 12. Final com Classes e Métodos
A palavra-chave `final` pode ser usada para impedir a herança. Se uma classe é declarada como `final`, ela não pode ser estendida. Se um método é `final`, ele não pode ser sobrescrito.
## 13. Métodos e Atributos Estáticos e Herança
Métodos e atributos estáticos pertencem à classe, e não ao objeto. Mesmo quando herdados, eles não pertencem à instância da subclasse.
## 14. Polimorfismo e Herança
O polimorfismo permite que referências de tipo de superclasse se refiram a objetos de subclasse, permitindo comportamentos dinâmicos em tempo de execução.
## 15. Classes Abstratas
Uma classe abstrata é aquela que não pode ser instanciada por si só e precisa ser estendida por outras classes. É usada para representar entidades abstratas e pode conter métodos abstratos (sem corpo).