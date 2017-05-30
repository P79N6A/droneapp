package com.fimi.soul.biz.update;

import com.fimi.soul.entity.UpdateVersonBean;
import java.util.Comparator;

public class m implements Comparator {
    public int compare(Object obj, Object obj2) {
        return ((UpdateVersonBean) obj).getSort() > ((UpdateVersonBean) obj2).getSort() ? 1 : -1;
    }
}
