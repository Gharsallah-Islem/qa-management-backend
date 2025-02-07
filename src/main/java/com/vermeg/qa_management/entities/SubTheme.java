package com.vermeg.qa_management.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subthemes",
        uniqueConstraints = @UniqueConstraint(columnNames = {"name", "theme_id"}))
@Getter
@Setter
public class SubTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "theme_id", nullable = false)
    private Theme theme;
    public SubTheme() {
    }
    public SubTheme(Integer id, String name, Theme theme) {
        this.id = id;
        this.name = name;
        this.theme = theme;
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
    public Theme getTheme() {
        return theme;
    }
    public void setTheme(Theme theme) {
        this.theme = theme;
    }
    @Override
    public String toString() {
        return "SubTheme{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theme=" + theme +
                '}';
    }

}


