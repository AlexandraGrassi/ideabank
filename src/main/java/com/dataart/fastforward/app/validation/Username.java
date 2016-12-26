package com.dataart.fastforward.app.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author logariett on 26.12.2016.
 */
@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {})
@Pattern.List({
//    @Pattern(regexp = "^(?!(admin))$", message = "{error.validation.username.forbidden}"),
    @Pattern(regexp = "^[A-Za-z0-9_-]+$", message = "{error.validation.username.characters}")
})
public @interface Username {
    String message() default "Field doesn't match bean validation constraints.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
