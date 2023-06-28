package com.buddycoach.usermanagerservice.model;

import java.util.Date;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Date dateOfBirth;
    private String roles;
    private Boolean enabled;

            //Enable --> En principio los usuarios solo se podrán registrar bajo invitación

    // Constructores
    public User() {
    }

    public User(Long id, String name, String email, String password, Date dateOfBirth, String roles, Boolean enabled) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.roles = roles;
        this.enabled = enabled;
    }

    // Getters y Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    // Métodos toString
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", dateOfBirth="
                + dateOfBirth + ", roles=" + roles + ", enabled=" + enabled + "]";
    }
}
