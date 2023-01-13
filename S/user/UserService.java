class UserService {

    private final UserRepository repository;

    UserService(UserRepository repository) {
        this.repository = repository
    }

    public void salvar(User user) {
        repository.salvar(user)
    }

    public void deletar(String id) {
        repository.deletar(id)
    }

    public void buscar(String id) {
        repository.buscar(id)
    }

}