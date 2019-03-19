package com.xinqushi.validation.pojo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class User {
    @NotNull
    private String id;
    @NotNull
    @Length(min = 3)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
