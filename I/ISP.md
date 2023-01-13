## [Interface Segregation Principle](https://en.wikipedia.org/wiki/Interface_segregation_principle)
________________________________________
## Princípio da Segregacão de Interface
________________________________________

Basicamente esse principio nos diz que uma classe `não deve` 
implementar uma ‘interface’ e/ou metodos que não irão utilizar. 

Já viu algo parecido com [isso](https://github.com/muriloalvesdev/solid-learning/blob/main/src/main/java/I/Incorrect.java)?

ISP nos diz ser melhor criar ‘interfaces’ mais específicas do que criar uma ‘interface’ genérica e ter métodos
nao utilizados em algumas das implementacões.

Após aplicarmos o princípio de segregacao de ‘interface’ da forma correta, chegamos a [isso](https://github.com/muriloalvesdev/solid-learning/blob/main/src/main/java/I/Correct.java). 
Agora Winamp implementa uma interface específica! :)