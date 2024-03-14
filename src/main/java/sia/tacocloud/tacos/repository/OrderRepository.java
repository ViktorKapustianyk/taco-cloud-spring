package sia.tacocloud.tacos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import sia.tacocloud.tacos.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
