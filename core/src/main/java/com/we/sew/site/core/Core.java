package com.we.sew.site.core;

/**
 * @author Vladyslav_Yemelianov
 */
public class Core {

    public static class TimeEntityInfo {
        public static final String CREATION_TIME = "creation_time";
        public static final String UPDATE_TIME = "update_time";
    }

    public static class StatusedEntity {
        public static final String STATUS_ID = "id_status";
    }

    public static class EntityStatus {
        public static final String TABLE_NAME = "entity_status";
        public static final String ID = "id_entity_status";
        public static final String VALUE = "value_name";
    }

    public static class UserRole {
        public static final String TABLE_NAME = "user_role";
        public static final String ID = "id_user_role";
        public static final String VALUE = "value_name";
    }

    public static class Country {
        public static final String TABLE_NAME = "country";
        public static final String ID = "id_country";
        public static final String TITLE = "title";
        public static final String ABR = "abr";
        public static final String LOGO_PATH = "logo_path";
    }

    public static class Address {
        public static final String TABLE_NAME = "address";
        public static final String ID = "id_address";
        public static final String COUNTRY_ID = "id_country";
        public static final String ADDRESS = "address";
    }

    public static class SiteUser {
        public static final String TABLE_NAME = "site_user";
        public static final String ID = "id_site_user";
        public static final String EMAIL = "email";
        public static final String PASSWORD = "password";
        public static final String FIRST_NAME = "first_name";
        public static final String LAST_NAME = "last_name";
        public static final String BIRTH_DATE = "birth_date";
        public static final String LAST_LOGIN = "last_login";
        public static final String ROLE_ID = "id_user_role";
        public static final String ADDRESS_ID = "id_address";
        public static final String CELL_NUMBER = "cell_number";
        public static final String GENDER = "gender";
    }

    private Core(){}
}
