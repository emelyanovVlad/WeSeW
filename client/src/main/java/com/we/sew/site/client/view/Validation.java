package com.we.sew.site.client.view;

/**
 * @author Vladyslav_Yemelianov
 */
public class Validation {
    public static final String INTERNATIONAL = "[A-ZА-Я][a-zа-я]";
    public static final String EMAIL = "[\\w\\.\\_\\-]+@[\\w]+\\.[\\w]{2,5}";

    public static class Msg {
        public static final String EMAIL = "Not valid email";
        public static final String NOT_BLANK = "Cannot be empty";
        public static final String PASSWORD = "Password should be be between 6 and 40 symbols.";
    }

    private Validation(){}
}
