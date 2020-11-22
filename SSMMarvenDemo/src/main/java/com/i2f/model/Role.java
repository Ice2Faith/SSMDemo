package com.i2f.model;

import java.sql.Timestamp;

public class Role {
    public interface RoleType{
        int SUPER_ADMIN_ID=1;
        int NORMAL_ADMIN_ID=2;
    }
    private Integer id;
    private String names;
    private Integer orderNum;
    private Integer refCount;
    private String descInfo;
    private Timestamp createTime;
    private Timestamp lastModifyTime;
    private Integer CreatorAdminId;
    private Integer state;
    private String other;

    public Role(int id) {
        this.id = id;
    }

    public Role() {

    }

    public Role(int id, String names, int orderNum, int refCount, String descInfo, Timestamp createTime, Timestamp lastModifyTime, int creatorAdminId, int state, String other) {
        this.id = id;
        this.names = names;
        this.orderNum = orderNum;
        this.refCount = refCount;
        this.descInfo = descInfo;
        this.createTime = createTime;
        this.lastModifyTime = lastModifyTime;
        CreatorAdminId = creatorAdminId;
        this.state = state;
        this.other = other;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getRefCount() {
        return refCount;
    }

    public void setRefCount(int refCount) {
        this.refCount = refCount;
    }

    public String getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Timestamp lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public int getCreatorAdminId() {
        return CreatorAdminId;
    }

    public void setCreatorAdminId(int creatorAdminId) {
        this.CreatorAdminId = creatorAdminId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", orderNum=" + orderNum +
                ", refCount=" + refCount +
                ", descInfo='" + descInfo + '\'' +
                ", createTime=" + createTime +
                ", lastModifyTime=" + lastModifyTime +
                ", CreatorAdminId=" + CreatorAdminId +
                ", state=" + state +
                ", other='" + other + '\'' +
                '}';
    }
}
