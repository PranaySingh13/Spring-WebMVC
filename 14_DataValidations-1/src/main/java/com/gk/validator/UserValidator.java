package com.gk.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.gk.command.User;
/*
 * Server side Validation
 */
public class UserValidator implements Validator {

	/* It will check whether the command class is right class or not for data
	 * validations on the basis of Class type.
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	/*
	 * It will include Data Validation logic . If any Validation error is identified
	 * then we have to use rejectValue() method
	 */
	@Override
	public void validate(Object command, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "uName", "uname.required");
		ValidationUtils.rejectIfEmpty(errors, "uPassword", "upwd.required");
		ValidationUtils.rejectIfEmpty(errors, "uAge", "uage.required");
		ValidationUtils.rejectIfEmpty(errors, "uEmailId", "uemail.required");
		ValidationUtils.rejectIfEmpty(errors, "uMobile", "umobile.required");

		User user = (User) command;
		if (!user.getuPassword().equals("") && user.getuPassword().length() < 6) {
			errors.rejectValue("uPassword", "upwd.minLength");
		}
		if (!user.getuPassword().equals("") && user.getuPassword().length() > 10) {
			errors.rejectValue("uPassword", "upwd.maxLength");
		}
		if (user.getuAge() < 18 || user.getuAge() > 30) {
			errors.rejectValue("uAge", "uage.range");
		}
		if (!user.getuEmailId().equals("") && !user.getuEmailId().endsWith("@gmail.com")) {
			errors.rejectValue("uEmailId", "uemail.invalid");
		}
		if (!user.getuMobile().equals("") && !user.getuMobile().startsWith("+91-")) {
			errors.rejectValue("uMobile", "umobile.invalid");
		}
	}

}
