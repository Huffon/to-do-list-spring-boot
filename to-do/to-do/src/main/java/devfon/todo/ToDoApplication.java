package devfon.todo;

import devfon.todo.entity.Item;
import devfon.todo.entity.PriorityType;
import devfon.todo.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class ToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ItemRepository itemRepository) throws Exception {
		return (args) -> {
			LongStream.rangeClosed(1, 2).forEach(index ->
					itemRepository.save(Item.builder()
							.title("할 일" + index)
							.content("콘텐츠" + index)
							.priority(PriorityType.mid)
							.finished(1)
							.deadline((long)20181101 + (long)index)
							.build())
			);
			LongStream.rangeClosed(3, 4).forEach(index ->
					itemRepository.save(Item.builder()
							.title("할 것" + index)
							.content("콘텐츠" + index)
							.priority(PriorityType.low)
							.build())
			);
			LongStream.rangeClosed(5, 6).forEach(index ->
					itemRepository.save(Item.builder()
							.title("할 분" + index)
							.content("콘텐츠" + index)
							.priority(PriorityType.high)
							.deadline((long)20181101 + (long)index)
							.build())
			);
		};
	}
}