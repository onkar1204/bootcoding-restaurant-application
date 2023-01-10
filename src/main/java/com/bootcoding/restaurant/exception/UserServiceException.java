package com.bootcoding.restaurant.exception;

public class UserServiceException extends Exception {
    public UserServiceException(String message){
        super();
        System.out.println(" User Service Exception Invope");
    }
    public UserServiceException(String message, Throwable t){
        super(message, t);
    }


}
