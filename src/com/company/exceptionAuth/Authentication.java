package com.company.exceptionAuth;

public class Authentication {

    public static void main(String[] args) {
        String login = "E_not17";
        String pass = "DfeGt023ds_45";
        String confirmPass = "DfeGt023ds_45";

        System.out.println(checkAuthentication(login, pass, confirmPass));
    }

    static boolean checkAuthentication(String login, String pass, String confirmPass) {
        try {
            String regEx = "\\w{5,20}";
            if (!login.matches(regEx)) {
                throw new WrongLoginException("Invalid login");
            }
            if (!pass.matches(regEx) || !pass.equals(confirmPass)) {
                throw new WrongPasswordException("Invalid pass");
            }
        } catch (WrongPasswordException | WrongLoginException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }

}

class WrongLoginException extends Exception {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
