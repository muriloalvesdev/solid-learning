________________________________________
## [Open/Closed Principle](https://pt.wikipedia.org/wiki/Princ%C3%ADpio_do_aberto/fechado)
________________________________________
## Princípio aberto/fechado
________________________________________

Este príncipio nos diz que objetos ou entidades devem estar abertos para estensão e fechados para modificaão.

"Entidades de software devem ser abertas para extensão, mas fechadas para modificação, isto é, 
a entidade pode permitir que o seu comportamento seja estendido sem modificar seu código-fonte."

Dessa vez, a Incorrect.java contém uma implementacão comum que vemos no nosso dia a dia (vai dizer que não? rs)
Basicamente calculamos o bônus a ser recebido pelos funcionários a partir do tipo do contrato do mesmo.

E se surgirem mais tipos de contratacões? Adicionar outro IF pode estar nos seus planos, mas estaríamos modificando a classe, e isso
acaba quebrando o princípio `aberto/fechado`.

Alterar uma classe já existente para implementar um novo comportamento acaba que podemos 
estar modificando algo que não deveria ser modificado. (quem nunca?)

[Vamos a solucão]()

Agora qualquer tipo de contrato que venha a existir terá que implementar a interface `Bonus` 
e ter a sua própria implementacão do cálculo a partir da interface.

Os mais experientes devem ter percebido que a aplicacão do 
princípio OCP lembra muito o `Design Pattern` [Strategy](https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm#:~:text=In%20Strategy%20pattern%2C%20a%20class,as%20per%20its%20strategy%20object.) e sim, é exatamente isso!
