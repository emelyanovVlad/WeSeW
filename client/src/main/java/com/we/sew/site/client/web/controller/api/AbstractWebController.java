package com.we.sew.site.client.web.controller.api;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vladyslav_Yemelianov
 */
public abstract class AbstractWebController {

    protected Map<String, String> getErrorsFrom(BindingResult result) {
        Map<String, String> errors = new HashMap<>();
        for (ObjectError error : result.getAllErrors()) {
            FieldError fieldError = (FieldError) error;
            errors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return errors;
    }
}
