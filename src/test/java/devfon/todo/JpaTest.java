package devfon.todo;

import devfon.entity.Item;
import devfon.entity.enums.PriorityType;
import devfon.repository.ItemRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaTest {

    private final String title = "운동하기";

    @Autowired
    ItemRepository itemRepository;

    @Before
    public void init() {
        Item item = itemRepository.save(Item.builder()
                .title("운동하기")
                .priorityType(PriorityType.high)
                .content("윗몸일으키기")
                .deadline("20181101")
                .finished(false)
                .build());
    }

    @Test
    public void 생성_테스트() {
        Item item = itemRepository.findByTitle(title);
        assertThat(item.getContent(), is("윗몸일으키기"));
        assertThat(item.getDeadline(), is("20181101"));
    }
}