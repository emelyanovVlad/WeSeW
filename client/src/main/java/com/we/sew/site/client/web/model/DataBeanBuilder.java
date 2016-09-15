package com.we.sew.site.client.web.model;

/**
 * @author vladyslav.yemelianov
 */
public class DataBeanBuilder {
    public static DataBean ok() {
        return new DataBean();
    }

    public static DataBean ok(Object data) {
        return new DataBean(data);
    }

    public static DataBean err() {
        return new DataBean(DataBeanStatus.ERROR.getValue());
    }

    public static DataBean err(Object data) {
        return new DataBean(DataBeanStatus.ERROR.getValue(), data);
    }
}
