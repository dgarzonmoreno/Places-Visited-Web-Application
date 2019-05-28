package com.example.demo.models;

public class User {

    private String name;
    private String id;
    private String dob;

    public User(String name, String id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDob() {
        return dob;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setId(String newId)
    {
        id = newId;
    }

    public void setDob(String newDob)
    {
        dob = newDob;
    }
}
