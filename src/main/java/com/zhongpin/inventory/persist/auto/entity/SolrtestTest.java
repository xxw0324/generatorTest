package com.zhongpin.inventory.persist.auto.entity;

import com.zhongpin.zp.persist.base.entity.BaseEntity;
import java.io.Serializable;

public class SolrtestTest extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为solrtest_test.id
     */
    private String id;

    /**
     *  ,所属表字段为solrtest_test.name
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}