package com.vermeg.qa_management.entities;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "categories",
        uniqueConstraints = @UniqueConstraint(columnNames = {"name", "subtheme_id"}))
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "subtheme_id", nullable = false)
    private SubTheme subTheme;
    public Category() {
    }
    public Category(Integer id, String name, SubTheme subTheme) {
        this.id = id;
        this.name = name;
        this.subTheme = subTheme;
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
    public SubTheme getSubTheme() {
        return subTheme;
    }
    public void setSubTheme(SubTheme subTheme) {
        this.subTheme = subTheme;
    }
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subTheme=" + subTheme +
                '}';
    }
}
