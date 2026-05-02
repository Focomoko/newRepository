package com.example.spring.DTO;

public class UserRequestDTO {
    private String name;
    private int age;
    private Boolean deleted;

    public UserRequestDTO(String name, int age, Boolean deleted) {
        this.name = name;
        this.age = age;
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
