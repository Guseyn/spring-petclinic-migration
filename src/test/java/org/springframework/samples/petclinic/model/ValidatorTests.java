package org.springframework.samples.petclinic.model;

import org.junit.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Locale;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@ConfigurationProperties("app")
public class ValidatorTests {

    private Validator createValidator() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.afterPropertiesSet();
        return localValidatorFactoryBean;
    }

    @Test
    public void shouldNotValidateWhenFirstNameEmpty() {

        LocaleContextHolder.setLocale(Locale.ENGLISH);
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("smith");

        Validator validator = createValidator();
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        assertEquals(1, constraintViolations.size());
        ConstraintViolation<Person> violation = constraintViolations.iterator().next();
        assertEquals("firstName", violation.getPropertyPath().toString());
        assertEquals("may not be empty", violation.getMessage());
    }

}
