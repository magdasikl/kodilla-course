package com.kodilla.hibernate.manytomany.facade;

public class FacadeProcessingException extends Exception {
    public static String ERR_NOT_COMPANY_NAME = "Brak firmy";
    public static String ERR_NOT_EMPLOYEE_NAME = "Brak pracownika";


    public FacadeProcessingException(String message) {
        super(message);
    }
}
