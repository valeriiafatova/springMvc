package com.university.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lerafatova on 26.07.17.
 */
@Entity
@Table(name = "courses")
public class Course extends BaseEntity{
    public Course() {
    }

    public Course(Integer id, String title, String description) {
        super(id);
        this.title = title;
        this.description = description;
    }

    private String title;

    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
