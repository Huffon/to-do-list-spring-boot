package com.devfon.todo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String title;
    @Column(nullable = false)
    private String content;
    @Column(nullable = true)
    private String deadline;
    @Column
    private Date createdDate = new Date();
    @Column
    private Boolean finished = false;

    public void Add (Long id, String title, String content, String deadline){
        this.id = id;
        this.title = title;
        this.content = content;
        this.deadline = deadline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }
}
