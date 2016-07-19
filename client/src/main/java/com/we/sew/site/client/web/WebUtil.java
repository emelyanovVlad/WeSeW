package com.we.sew.site.client.web;

/**
 * @author Vladyslav_Yemelianov
 */
public class WebUtil {

    public static String redirect(String url) {
        return "redirect:" + url;
    }

    public static class Mapping {
        public static final String ROOT = "/";
        public static final String HOME = "/home";
        public static final String JOIN = "/join";
        public static final String AUTH = "/auth";
		public static final String PROFILE = "/profile";
		public static final String ID = "/{id}";
    }

    public static class View {
        public static final String HOME = "home";
        public static final String JOIN = "join";
    }

    public static class Consts {
		public static final String ERROR = "error";
        public static final String ERRORS = "errors";
		public static final String DATAOBJ = "data_obj";
        public static final String LOGGED_USER = "logged_user";
    }
}
