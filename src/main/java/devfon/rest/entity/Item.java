package devfon.rest.entity;

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
    private Long deadline;
    @Column
    private int finished;

    @Builder
    public Item(String title, String content, PriorityType priority, Long deadline, int finished) {
        this.title = title;
        this.content = content;
        this.priority = priority;
        this.deadline = deadline;
//        this.finished = 0;
        this.finished = finished;
    }
}