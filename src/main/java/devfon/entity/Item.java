package devfon.entity;

import devfon.entity.enums.PriorityType;
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
    private PriorityType priorityType;
    @Column
    private String deadline;
    @Column
    private boolean finished;

    @Builder
    public Item(Long id, String title, String content, PriorityType priorityType, String deadline, boolean finished) {
        this.id = id;
        this.title = title;
        this.priorityType = priorityType;
        this.content = content;
        this.deadline = deadline;
        this.finished = finished;
    }
}