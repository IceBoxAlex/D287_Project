package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.example.demo.domain.Part;

/**
 *
 *
 *
 *
 */
public class InventoryValidator implements ConstraintValidator<ValidInventory, Part> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidInventory constraintAnnotation) {
        //ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(part.getInv() > part.getMaxInv())
        {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Solution: Reduce Inventory, exceeds max Inventory").addConstraintViolation();
            return false;
        } else if (part.getInv() < part.getMinInv())
        {   
            constraintValidatorContext.buildConstraintViolationWithTemplate("Solution: Raise Inventory, below min Inventory").addConstraintViolation();
            return false;
        } else {
            return true;
        }
    }
}
