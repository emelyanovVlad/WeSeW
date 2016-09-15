package com.we.sew.site.client.web.model;

/**
 * @author vladyslav.yemelianov
 */
public enum DataBeanStatus {
    OK(200), ERROR(500);

    private final int value;

    DataBeanStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
