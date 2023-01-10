package com.bootcoding.restaurant.exception;

public class UserService {
    public void test() throws Exception, MyException, UserServiceException {
        UserHelper userHelper = new UserHelper();
        try{
            userHelper.test();
        }catch (NumberFormatException ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace();
            MyException exm = new MyException(ex.getMessage());
            UserServiceException usn = new  UserServiceException(ex.getMessage());
            throw exm;


        }finally {
            System.out.println(" I finally executed! ");
        }
    }
}
