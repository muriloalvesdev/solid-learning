## [Dependency Inversion Principle](https://pt.wikipedia.org/wiki/Princ%C3%ADpio_da_invers%C3%A3o_de_depend%C3%AAncia)
________________________________________
## Princípio da inversão de dependência
________________________________________

ISP — "Devemos depender de abstracões e não de implementacões."

"Módulos de alto nível não devem depender de módulos de baixo nível, ambos 
devem depender da abstracão. Abstracões não devem depender de detalhes, 
detalhes devem depender de abstracões." — Uncle Bob

Dependa de abstracões e não de implementacões, porque implementacões criam dependências.

Bob diz sobre `abstracão`, ou seja, uma dependência de algo que ainda vai ser implementado.

Vamos ao exemplo? 

```
inteface LeitorAquivo {
    public void ler(String caminho);
}

class LerTxt : LeitorArquivo {
    @Override
    public void ler(String caminho) {
        // implementacao
    }
}
```

Temos uma interface e uma implementacão específica de arquivos txt.

```
class Test {

    private LerTxt leitor;
    
    @Test
    public void ler() {
        leitor.ler("/tmp/file.txt");
    }
}
```

Perceba que o teste acima está injetando como dependência o `LerTxt` 
e a questão é que o teste deve `ler arquivos` e não somente arquivos txt. Entende?

O correto seria:

```
class Test {

    private LeitorArquivo leitor;
    
    @Test
    public void ler() {
        leitor.ler("/tmp/file.txt");
    }
}
```

Se por algum momento o sistema passe a ler diversos tipos de arquivos, 
essa classe de teste poderá realizar essa operacão sem dificuldades.

Por exemplo:
```
class Test {

    private LeitorArquivo leitor;
    
    @ParameterizedTests
    @ArgumentSource(PathsProvider::class)
    public void ler(Paths paths) {
        leitor.ler(paths);
    }
}
```

Se `Paths` tiver 4 tipos de arquivos e 4 implementacões utilizando a interface `LeitorArquivo`, pra cada
`path` o teste vai executar a respetiva implementacão, ou seja, independente de quantas implementacões existam
esse teste continuará sem ser modificado e continuará realizando os testes de quaisquer implementacões de leitura de arquivos.