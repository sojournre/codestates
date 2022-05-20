package com.company.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BackendFramework {
    enum Frameworks {SPRING, DJANGO, EXPRESS}

    Frameworks backendFramework() default Frameworks.EXPRESS;
}

class KimCoding {
    @BackendFramework()
    private String kimCodingBackend;
}
