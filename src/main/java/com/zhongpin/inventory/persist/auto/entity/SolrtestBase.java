package com.zhongpin.inventory.persist.auto.entity;

import com.zhongpin.zp.persist.base.entity.BaseEntity;
import java.io.Serializable;

public class SolrtestBase extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为solrtest_base.id
     */
    private Integer id;

    /**
     *  ,所属表字段为solrtest_base.no
     */
    private String no;

    /**
     *  ,所属表字段为solrtest_base.name
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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
        sb.append(", no=").append(no);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}