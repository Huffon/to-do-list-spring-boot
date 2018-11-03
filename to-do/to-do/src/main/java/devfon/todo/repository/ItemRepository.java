package devfon.todo.repository;

import devfon.todo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByTitle(String title);
}
