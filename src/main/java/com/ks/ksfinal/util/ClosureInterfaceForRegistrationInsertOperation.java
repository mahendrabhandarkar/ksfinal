package com.ks.ksfinal.util;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClosureInterfaceForRegistrationInsertOperation implements ClosureInterface<RegistrationBasicDetailViewModel, Object> {


	@Autowired
	private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
	@Override
	public Object execute(RegistrationBasicDetailViewModel srcModel) {
		return new Object();
	}
}