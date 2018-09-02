package com.kmjd.jsylc.zxh.database.dbbean;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "MEMBER_INFORMATION".
 */
@Entity
public class MemberInformation {

    @Id
    private Long id;
    private String level;
    private String money;
    private String user;
    private String verify;

    @Generated(hash = 2001256111)
    public MemberInformation() {
    }

    public MemberInformation(Long id) {
        this.id = id;
    }
    public MemberInformation(String level, String money, String user, String verify) {
        this.level = level;
        this.money = money;
        this.user = user;
        this.verify = verify;
    }
    @Generated(hash = 814951889)
    public MemberInformation(Long id, String level, String money, String user, String verify) {
        this.id = id;
        this.level = level;
        this.money = money;
        this.user = user;
        this.verify = verify;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

}
