package com.workshop.pages.domain;

/**
 * Created by Astarta on 13.05.2017.
 */
//@Data
public class User {
    String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getName().equals(user.getName())) return false;
        return getPassword().equals(user.getPassword());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getPassword().hashCode();
        return result;
    }
}
