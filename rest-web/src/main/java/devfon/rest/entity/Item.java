package devfon.rest.entity;

import devfon.rest.entity.enums.FinishedType;
import devfon.rest.entity.enums.PriorityType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Entity
@Table
public class Item implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    @Enumerated(EnumType.STRING)
    private PriorityType priority;
    @Column
    private String deadline;
    @Column
    @Enumerated(EnumType.STRING)
    private FinishedType finished;

    @Builder
    public Item(String title, String content, PriorityType priority, String deadline, FinishedType finished) {
        this.title = title;
        this.content = content;
        this.priority = priority;
        this.deadline = deadline;
        this.finished = finished;
    }

    public void update(Item item) {
        this.title = item.getTitle();
        this.content = item.getContent();
        this.priority = item.getPriority();
        this.deadline = item.getDeadline();
        this.finished = item.getFinished();
    }
}