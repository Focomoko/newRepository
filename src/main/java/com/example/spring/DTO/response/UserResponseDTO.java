package com.example.spring.DTO.response;

public class UserResponseDTO {
    private Long id;
    private String name;
    private int age;
    private Boolean deleted;
    public UserResponseDTO(Long id, String name, int age,Boolean deleted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.deleted = deleted;
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
