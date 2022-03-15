package com.practice;

public class ValidationRuntimeException extends RuntimeException{
    public ValidationRuntimeException(String message){
        super(message);
    }

    public static void validate2(Login login) {

        if (login.username() == null ){
            throw new NullPointerException("Username is Null !");
        }else if (login.username().isBlank()){
            throw new ValidationRuntimeException("Username is Blank !");
        }else if (login.password() == null){
            throw new NullPointerException("Password is Null !");
        }else if (login.password().isBlank()){
            throw new ValidationRuntimeException("Password is Blank !");
        }
    }

}
