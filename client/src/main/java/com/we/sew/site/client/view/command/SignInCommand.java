package com.we.sew.site.client.view.command;

import com.we.sew.site.client.view.Validation;
import com.we.sew.site.client.web.validation.EmailNotExist;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author vladyslav
 */
public class SignInCommand {
	@NotBlank(message = Validation.Msg.NOT_BLANK)
	@Pattern(regexp = Validation.EMAIL, message = Validation.Msg.EMAIL)
	@EmailNotExist
	private String email;

	@NotBlank(message = Validation.Msg.NOT_BLANK)
	@Size(min = 6, max = 40, message = Validation.Msg.PASSWORD)
	private String password;


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
}
