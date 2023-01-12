package s.order;


class OrderService {

    private final OrderRepository repository;

    OrderService(OrderRepository repository) {
        this.repository = repository
    }

    public void save(Order order) {
        repository.save(order)
    }

    public void delete(String id) {
        repository.delete(id)
    }

    public void find(String id) {
        repository.delete(id)
    }
}