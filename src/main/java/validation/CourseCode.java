package validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //define default course Code
        public String value() default "LUV";
    //define default Error Message
        public String message() default "Must Start with LUV";
    //define default groups
        public Class<?>[] groups() default {};

    //define default payloads
        public Class<? extends Payload>[] payload() default{};
}
