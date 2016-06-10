package com.we.sew.site.client.bean;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * @author Vladyslav_Yemelianov
 */
public class UserRegistrationBean {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Pattern(regexp = "[A-Za-z0-9\\.]{4,50}")
    private String password;
    @NotBlank
    @Pattern(regexp = Validation.INTERNATIONAL + "{1, 30}")
    private String firstName;
    @NotBlank
    @Pattern(regexp = Validation.INTERNATIONAL + "{1, 30}")
    private String lastName;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
