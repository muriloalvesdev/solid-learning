class ClienteContratado implements Cliente {

    public ClienteContratado(String nome, LocalDateTime dataCadastro) {
        super(nome, dataCadastro)
    }

    @Override
    public boolean isPremium() {
        return dataCadastro.year() < 2015
    }

}

class ClienteAlvo implements Cliente {

    public ClienteAlvo(String nome, LocalDateTime dataCadastro) {
        super(nome, dataCadastro)
    }

    @Override
    public boolean isPremium() {
        throw new NotImplementedException();
    }

}