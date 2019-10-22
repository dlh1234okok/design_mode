package com.dlh.builder.example.entity;

/**
 * @author: dulihong
 * @date: 2019/2/15 13:27
 */
public class UserEntity {

    private String id;

    private String Name;

    private String pwd;

    private String card;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
