package com.newton.springexample.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    public Category() {

    }

    public Category(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        if (id == null) {
            if (category.id != null) {
                return false;
            }
        } else if (!id.equals(category.id)) return false;
        return true;
    }
}
