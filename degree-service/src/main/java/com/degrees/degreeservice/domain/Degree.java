package com.degrees.degreeservice.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Degree {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String category;
    @ElementCollection
    private List<String> honors;

    public Degree() {
    }

    public Degree(String name, String category, List<String> honors) {
        this.name = name;
        this.category = category;
        this.honors = honors;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getHonors() {
        return honors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Degree degree = (Degree) o;

        if (!id.equals(degree.id)) return false;
        if (name != null ? !name.equals(degree.name) : degree.name != null) return false;
        if (category != null ? !category.equals(degree.category) : degree.category != null) return false;
        return honors != null ? honors.equals(degree.honors) : degree.honors == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (honors != null ? honors.hashCode() : 0);
        return result;
    }
}
