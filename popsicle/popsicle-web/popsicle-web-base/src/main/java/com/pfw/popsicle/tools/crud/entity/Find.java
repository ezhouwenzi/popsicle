package com.pfw.popsicle.tools.crud.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Find {
	HtmlType type();
	String defualtValue() default "";
	ListValue[] list() default {};
}
