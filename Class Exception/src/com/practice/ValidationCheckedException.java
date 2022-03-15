package com.practice;


public class ValidationCheckedException extends Throwable{
    
    private String message;

    public ValidationCheckedException(String message){
        this.message = message;
    }

    public String getMessage(){

        return this.message;
    }

    // sebenanrnya method diatas sudah ada di super class 'Throwable'.
    // public Validation(String message){
    //     super(message);
    // }


    public static void validate(Login login) throws ValidationCheckedException {

        if (login.username() == null ){
            throw new ValidationCheckedException("Username is Null !");
        }else if (login.username().isBlank()){
            throw new ValidationCheckedException("Username is Blank !");
        }else if (login.password() == null){
            throw new ValidationCheckedException("Password is Null !");
        }else if (login.password().isBlank()){
            throw new ValidationCheckedException("Password is Blank !");
        }
    }

    public static void validate1(Login login) throws ValidationCheckedException, NullPointerException {

        if (login.username() == null ){
            throw new NullPointerException("Username is Null !");
        }else if (login.username().isBlank()){
            throw new ValidationCheckedException("Username is Blank !");
        }else if (login.password() == null){
            throw new NullPointerException("Password is Null !");
        }else if (login.password().isBlank()){
            throw new ValidationCheckedException("Password is Blank !");
        }
    }
}
