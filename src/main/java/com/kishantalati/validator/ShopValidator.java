package com.kishantalati.validator;

import com.kishantalati.model.Shop;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created with IntelliJ IDEA.
 * User: kishan talati
 * Date: 09/07/15
 * Time: 5:51 PM
 */
@Component
public class ShopValidator implements Validator {

    private final static String EMPLOYEES_NUMBER = "employees";

    @Override
    public boolean supports(Class<?> clazz) {
        return Shop.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Shop shop = (Shop) target;

        Integer emplNumber = shop.getEmployees();

        ValidationUtils.rejectIfEmpty(errors, "name", "shop.name.empty");
        ValidationUtils.rejectIfEmpty(errors, EMPLOYEES_NUMBER, "shop.employees.empty");

        if (emplNumber != null && emplNumber < 1)
            errors.rejectValue(EMPLOYEES_NUMBER, "shop.employees.lessThenOne");

    }

}
