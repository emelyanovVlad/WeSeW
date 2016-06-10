package com.we.sew.site.core.model;

import com.we.sew.site.core.Core;
import com.we.sew.site.core.model.abs.TimeEntityInfo;

import javax.persistence.*;

/**
 * @author Vladyslav_Yemelianov
 */
@Entity
@Table(name = Core.UserRole.TABLE_NAME)
public class UserRole extends TimeEntityInfo {
    @Id
    @Column(name = Core.UserRole.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = Core.UserRole.VALUE, unique = true, nullable = false)
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (id != userRole.id) return false;
        return value != null ? value.equals(userRole.value) : userRole.value == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserRole{");
        sb.append(super.toString());
        sb.append("id=").append(id);
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
