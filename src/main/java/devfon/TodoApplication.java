package devfon;

import devfon.rest.entity.Item;
import devfon.rest.entity.enums.FinishedType;
import devfon.rest.entity.enums.PriorityType;
import devfon.rest.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(ItemRepository itemRepository) throws Exception {
        return (args) -> {
            LongStream.rangeClosed(1, 5).forEach(index ->
                    itemRepository.save(Item.builder()
                            .title("할 일" + index)
                            .content("콘텐츠" + index)
                            .priority(PriorityType.high)
                            .deadline("20181111")
                            .finished(FinishedType.ING)
                            .build())
            );
        };
    }
}
