package com.example.mapperdome.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyAnnotation {
    /**
     * 别名数组
     * @return String[]，默认空字符串
     */
    String[] value() default "";
}
