package com.we.sew.site.core;

/**
 * @author Vladyslav_Yemelianov
 */
public class Core {

    public static class TimeEntityInfo {
        public static final String CREATION_TIME = "creation_time";
        public static final String UPDATE_TIME = "update_time";
    }

    public static class StatusEntity {
        public static final String STATUS_ID = "id_entity_status";
    }

    public static class EntityStatus {
        public static final String TABLE_NAME = "entity_status";
        public static final String ID = "id";
        public static final String VALUE = "value_name";
    }

    public static class Image {
        public static final String TABLE_NAME = "image";

    }
    public static class Employee {
        public static final String TABLE_NAME = "employee";
        public static final String AVATAR_ID = "id_avatar";
    }

    private Core(){}
}
