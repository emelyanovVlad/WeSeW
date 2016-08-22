package com.we.sew.site.client.web.model;

import com.we.sew.site.client.web.WebUtil;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vladyslav
 */
public class ModelViewBuilder {

	public static ModelAndView error(String view, String error) {
		ModelAndView model = createModel(view);
		model.addObject(WebUtil.Consts.ERROR, error);
		return model;
	}

	public static ModelAndView error(String view, Errors errors) {
		ModelAndView model = createModel();
		model.setViewName(view);
		Map<String, String> convertedErrors = getErrorsFrom(errors);
		model.addObject(WebUtil.Consts.ERRORS, convertedErrors);
		return model;
	}

	public static ModelAndView success(String redirectUrl) {
		return createModel(WebUtil.redirect(redirectUrl));
	}

	public static ModelAndView success(String view, Object obj) {
		ModelAndView model = createModel(view);
		model.addObject(WebUtil.Consts.DATA_OBJ, obj);
		return model;
	}

	private static Map<String, String> getErrorsFrom(Errors result) {
		Map<String, String> errors = new HashMap<>();
		for (ObjectError error : result.getAllErrors()) {
			FieldError fieldError = (FieldError) error;
			errors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		return errors;
	}

	private static ModelAndView createModel() {
		return new ModelAndView();
	}

	private static ModelAndView createModel(String viewName) {
		return new ModelAndView(viewName);
	}
}
