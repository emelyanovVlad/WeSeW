package com.we.sew.site.core.util.filler;

import com.we.sew.site.core.model.abs.TimeEntityInfo;
import com.we.sew.site.core.util.filler.api.EntityFiller;
import org.springframework.stereotype.Component;

/**
 * @author Vladyslav_Yemelianov
 */
@Component
public class CreationTimeEntityInfoFiller implements EntityFiller<TimeEntityInfo>{
    @Override
    public void fill(TimeEntityInfo el) {
        long currentTime = System.currentTimeMillis();
        el.setCreationTime(currentTime);
        el.setUpdateTime(currentTime);
    }
}
