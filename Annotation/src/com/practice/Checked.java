package com.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Checked {

    // menambahkan attribute dan ketika menambahkan default value pada atribut maka pada saat memanggil annotation Checked tidak
    // diwajibkan untuk menambahkan attribute name. namun ketika suatu atribut tidak ditambahkan default value, maka pada saat
    // memanggil annotation Checked maka harus menambahkan value dari attribute name.
    String name();

    String[] tags() default {};
}
