
# Polimorfismo em Java

Polimorfismo é um dos quatro pilares da programação orientada a objetos (junto com a encapsulamento, herança e abstração). A palavra "polimorfismo" vem do grego e significa "muitas formas".

## Tópicos Principais

1. **Definição de Polimorfismo**
   - Polimorfismo refere-se à capacidade de uma variável, função ou objeto ter múltiplas formas. Em Java, é realizado principalmente usando herança e interfaces.

2. **Polimorfismo em Tempo de Execução**
   - Também conhecido como polimorfismo dinâmico. Em tempo de execução, a JVM determina o objeto a ser chamado com base na referência do objeto real.

3. **Polimorfismo em Tempo de Compilação**
   - Também conhecido como polimorfismo estático. Em tempo de compilação, o compilador Java determina o método a ser chamado com base na referência da classe.

4. **Uso de `instanceof` com Polimorfismo**
   - A palavra-chave `instanceof` é usada para testar se um objeto é uma instância de uma classe, subclasse ou interface.

5. **Uso de `super` com Polimorfismo**
   - A palavra-chave `super` é usada para se referir à superclasse imediata de uma classe.

6. **Métodos `final` e Polimorfismo**
   - Métodos marcados como `final` não podem ser sobrescritos, o que significa que o polimorfismo não se aplica a eles.

7. **Classes Abstratas**
   - Uma classe que é declarada usando a palavra-chave `abstract` é conhecida como classe abstrata. Não pode ser instanciada, mas pode ser subclassificada.

8. **Métodos Abstratos**
   - Métodos que são declarados mas não têm implementação. Eles precisam ser implementados em uma subclasse.

9. **Interfaces e Polimorfismo**
   - Em Java, uma classe pode implementar várias interfaces, o que é uma forma de alcançar o polimorfismo.

10. **Sobrescrita de Métodos e Exceções**
    - Regras para sobrescrita de métodos quando as exceções estão envolvidas.

11. **Classe `Object` e Polimorfismo**
    - A classe `Object` é a raiz de todas as classes em Java. Cada classe em Java é diretamente ou indiretamente uma subclasse da classe `Object`.

12. **Método `equals` e Polimorfismo**
    - O método `equals` da classe `Object` é usado para verificar a igualdade de dois objetos. Pode ser sobrescrito para fornecer implementação personalizada.

13. **Método `hashCode` e Polimorfismo**
    - O método `hashCode` retorna um valor hash para o objeto. Se dois objetos são iguais, seus códigos hash também devem ser iguais.

14. **Covariância de Tipos de Retorno**
    - A partir do Java 5, é possível sobrescrever um método alterando o tipo de retorno do método sobrescrito, desde que o novo tipo de retorno seja um subtipo do tipo de retorno original.

15. **Polimorfismo e Cast**
    - Conversão entre tipos (classes e interfaces) relacionados por herança.

Espero que esta lista forneça um entendimento claro sobre os tópicos cruciais de polimorfismo em Java e sua interação com modificadores de acesso.
