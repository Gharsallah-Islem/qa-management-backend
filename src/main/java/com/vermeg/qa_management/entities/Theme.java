package com.vermeg.qa_management.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "themes", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
@Getter
@Setter

public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;
    public Theme() {
    }
    public Theme(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Theme{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
