package com.bootcoding.restaurant.exception;

public class ExceptionExample3 {
    public static void main(String[] args) throws Exception, MyException, UserServiceException {
        new UserService().test();

    }

}
