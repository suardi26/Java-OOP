package com.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Untuk annotation NotBlank dapat digunakan pada Field/attribute sesuai dengan target dari annotation.
@Target({ElementType.FIELD})

// Untuk Retention harus Runtime untuk bisa dibaca oleh reflection.
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {
}
