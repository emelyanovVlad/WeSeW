package com.we.sew.site.client.view.command;

import com.we.sew.site.client.view.Validation;
import com.we.sew.site.client.web.validation.EmailNotExist;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author Vladyslav_Yemelianov
 */
public class SiteUserRegistrationCommand extends SignInCommand {
    @NotBlank(message = Validation.Msg.NOT_BLANK)
    @Pattern(regexp = Validation.INTERNATIONAL + "{1,30}")
    private String firstName;

    @NotBlank(message = Validation.Msg.NOT_BLANK)
    @Pattern(regexp = Validation.INTERNATIONAL + "{1,30}")
    private String lastName;

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
