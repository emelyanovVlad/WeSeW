package com.we.sew.site.client.web.model;

/**
 * @author vladyslav.yemelianov
 */
public class DataBean {
    private int status;

    private Object data;

    public DataBean() {
        this.status = DataBeanStatus.OK.getValue();
    }

    public DataBean(int status) {
        this.status = status;
    }

    public DataBean(Object data) {
        this.status = DataBeanStatus.OK.getValue();
        this.data = data;
    }

    public DataBean(int status, Object data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }
}
