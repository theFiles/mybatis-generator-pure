package com.lidaye.mybatis.generator.entity;

import java.io.Serializable;
import java.util.Date;

public class PosUser implements Serializable {
    private Integer id;

    private String nickName;

    private String phone;

    private String password;

    private String sex;

    private String userPhoto;

    private String userDisable;

    private Date createDate;

    private String remarks;

    private String number;

    private Integer agentId;

    private String salt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserDisable() {
        return userDisable;
    }

    public void setUserDisable(String userDisable) {
        this.userDisable = userDisable == null ? null : userDisable.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nickName=").append(nickName);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", userPhoto=").append(userPhoto);
        sb.append(", userDisable=").append(userDisable);
        sb.append(", createDate=").append(createDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", number=").append(number);
        sb.append(", agentId=").append(agentId);
        sb.append(", salt=").append(salt);
        sb.append("]");
        return sb.toString();
    }
}