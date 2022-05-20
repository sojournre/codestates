package com.company.annotation;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Documented
@Target({FIELD, TYPE, TYPE_USE})
@interface CustomAnnotation {
}

@Repeatable(ToDos.class)
@interface ToDo {
    String value();
}

@interface ToDos {
    ToDo[] value();
}

@ToDo("abc")
@ToDo("gdcg")
@CustomAnnotation
public class AnnotationExample {
    @CustomAnnotation
    int i;
}
