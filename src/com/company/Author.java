package com.company;

public class Author {
    private String name;
    private String email;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("change to email: " + email + "\n");
    }

    public String toString() {
        return "Author:\nname: " + name + "\nemail: " + email + "\n";
    }
}
