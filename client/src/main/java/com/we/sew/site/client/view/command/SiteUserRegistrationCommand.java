package com.we.sew.site.client.view.command;

import com.we.sew.site.client.view.Validation;
import com.we.sew.site.client.web.validation.EmailExist;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Vladyslav_Yemelianov
 */
public class SiteUserRegistrationCommand {
    @NotBlank(message = Validation.Msg.NOT_BLANK)
    @Pattern(regexp = Validation.EMAIL, message = Validation.Msg.EMAIL)
	@EmailExist
    private String email;

    @NotBlank(message = Validation.Msg.NOT_BLANK)
    @Size(min = 6, max = 40, message = Validation.Msg.PASSWORD)
    private String password;

    @NotBlank(message = Validation.Msg.NOT_BLANK)
    @Pattern(regexp = Validation.INTERNATIONAL + "{1,30}")
    private String firstName;

    @NotBlank(message = Validation.Msg.NOT_BLANK)
    @Pattern(regexp = Validation.INTERNATIONAL + "{1,30}")
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
