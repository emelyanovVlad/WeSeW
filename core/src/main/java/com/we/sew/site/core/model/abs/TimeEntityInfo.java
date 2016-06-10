package com.we.sew.site.core.model.abs;

import com.we.sew.site.core.Core;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Vladyslav_Yemelianov
 */
@MappedSuperclass
public abstract class TimeEntityInfo {
    @Column(name = Core.TimeEntityInfo.CREATION_TIME, nullable = false)
    private long creationTime;
    @Column(name = Core.TimeEntityInfo.UPDATE_TIME, nullable = false)
    private long updateTime;

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeEntityInfo that = (TimeEntityInfo) o;

        if (creationTime != that.creationTime) return false;
        return updateTime == that.updateTime;

    }

    @Override
    public int hashCode() {
        int result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (updateTime ^ (updateTime >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TimeEntityInfo{");
        sb.append("creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }
}
