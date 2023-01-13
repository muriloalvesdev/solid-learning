## [Liskov Substitution Principle](https://pt.wikipedia.org/wiki/Princ%C3%ADpio_da_substitui%C3%A7%C3%A3o_de_Liskov)
________________________________________
## Princípio de substituição de Liskov
________________________________________

"Uma classe derivada deve ser substuível por sua classe `base`".

 Se seguirmos o LSP temos como consequência aumento na confianca da utilizacão do polimorfismo e também
 na utilizacão de classes derivadas referindo-se as classes base sem medo de ter um resultado inesperado.
 
A classe [Incorrect.java]() dessa vez não está totalmente errada, um dos exemplos está correto. 
Vamos entender:

O seguinte código:
```
Cliente cliente = new ClienteContratado("murilo", LocalDateTime.now());
boolean isPremium = cliente.isPremium(); 
```

Funciona, pois, `ClienteContratado.java` é a classe derivada de `Cliente` e estamos aplicando o polimorfismo
para aplicar o princípio `LSP` onde `uma classe deverivada deve poder ser substituída por sua classe base`. ‘Show’!

No segundo caso:
```
Cliente cliente = new ClienteAlvo("murilo", null);
boolean isPremium = cliente.isPremium(); 
```

Não funciona, pois, ClienteAlvo.java não possui uma implementacao do método `isPremium()` por ainda não ter uma data
de cadastro especificada, ou seja, LSP nos ajudou a entender que `ClienteAlvo.java` não pertence (nesse cenário hipotético) a `Cliente.java`. 

Conclusão: linhas `8 e 9` deste arquivo.