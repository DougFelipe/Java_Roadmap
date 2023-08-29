
# Encapsulamento (modificadores de acesso) em Java

## 1. Definição de Encapsulamento
O **Encapsulamento** é um dos quatro pilares fundamentais da OOP (Programação Orientada a Objetos). Refere-se ao agrupamento de dados (atributos) e os métodos que operam esses dados em uma única unidade ou classe.

## 2. Benefícios do Encapsulamento
O encapsulamento ajuda a proteger a integridade dos dados, evitando acesso direto a eles e permitindo que sejam acessados apenas através de métodos.

## 3. Modificador `private`
O modificador `private` é usado para restringir o acesso. Membros declarados como `private` não são acessíveis fora da classe em que estão presentes.

## 4. Modificador `public`
O modificador `public` oferece visibilidade completa. Membros declarados como `public` são acessíveis de qualquer outra classe.

## 5. Modificador `protected`
O modificador `protected` oferece uma visibilidade restrita, mais do que `private` mas menos do que `public`. Membros `protected` são acessíveis dentro da mesma classe, pacote e subclasses.

## 6. Modificador de Acesso Padrão (sem modificador)
Se você não usar nenhum modificador, ele terá visibilidade de pacote por padrão. Acessível dentro do mesmo pacote, mas não de fora dele.

## 7. Uso de Getters e Setters
Getters e Setters são usados para acessar e atualizar os atributos de uma classe, respectivamente, especialmente quando esses atributos são privados.

## 8. Benefícios da Imutabilidade
Objetos imutáveis são aqueles cujo estado não pode ser alterado após serem criados. Isso traz benefícios em termos de segurança e simplificação.

## 9. Encapsulamento e Construtores
Os construtores também podem ser usados para definir valores iniciais para atributos encapsulados.

## 10. Encapsulamento e Composição
O encapsulamento pode ser usado junto com a composição para criar sistemas robustos, onde componentes individuais são bem encapsulados e interagem uns com os outros.

## 11. Uso de `final` com Atributos
A palavra-chave `final` pode ser usada para criar atributos constantes, que só podem ser inicializados uma vez.

## 12. Uso de Métodos `private`
Métodos `private` ajudam a encapsular a lógica interna de uma classe e são úteis para operações auxiliares.

## 13. Encapsulamento e Herança
A herança pode ser afetada pelos modificadores de acesso. Por exemplo, um membro `private` não é herdado por uma subclasse.

## 14. Encapsulamento e Polimorfismo
O encapsulamento permite que os detalhes internos de uma classe sejam ocultados, enquanto o polimorfismo permite que sejamos flexíveis na forma como interagimos com objetos de diferentes classes.

## 15. Princípio do Menor Privilégio
É sempre recomendado usar o menor nível de acesso possível para membros de uma classe. Isso protege os dados e garante que eles sejam acessados de maneira controlada.

