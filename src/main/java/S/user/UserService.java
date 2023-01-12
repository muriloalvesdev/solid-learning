package s.user;


class UserService {

    private final UserRepository repository;

    UserService(UserRepository repository) {
        this.repository = repository
    }

    public void save(User user) {
        repository.save(user)
    }

    public void delete(String id) {
        repository.delete(id)
    }

    public void find(String id) {
        repository.delete(id)
    }

}