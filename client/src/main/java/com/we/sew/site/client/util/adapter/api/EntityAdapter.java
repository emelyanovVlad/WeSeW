package com.we.sew.site.client.util.adapter.api;

/**
 * @author Vladyslav_Yemelianov
 */
public interface EntityAdapter<R, T> {
    R adapt(T el);
}
