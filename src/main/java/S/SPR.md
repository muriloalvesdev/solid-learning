________________________________________
## [Single Responsability Principle](https://en.wikipedia.org/wiki/Single-responsibility_principle)
________________________________________
## Princípio da Responsabilidade Única
________________________________________

"Esse princípio nos diz que uma classe deve ter *1* e *somente 1* motivo para mudar. A classe deve 
ser 'especializada' em apenas um único assunto e possuir apenas uma responsabilidade dentro das nossas
aplicacões."

[Exemplo de uma classe com mais de uma responsabilidade](https://github.com/muriloalvesdev/solid-learning/blob/main/src/main/java/s/Incorret.java)
A classe `Incorrect.java` citada acima contém mais de uma responsabilidade. 
Ela é responsável por realizar busca, criacao e delecao de pedidos e usuarios, e como vimos, 
isso vai contra o *princípio de responsabilidade única*.

- Exemplos corretos:
  - OrderService: essa classe agora contém uma responsabilidade, manipular informacoes referente a pedidos.
  - OrderRepository: essa classe tem a responsabilidade de ser o intermediador entre a camada de servico e a base de dados dos pedidos.

O mesmo vale para as [classes referente ao usuário](https://github.com/muriloalvesdev/solid-learning/tree/main/src/main/java/s/user).

Devemos nos atentar também que SRP não se limita só a classes, podemos utilizá-lo também em métodos/funcões. 
Apenas aplicando esse princípio os seus códigos já estarão mais limpo e de fácil manutencão.