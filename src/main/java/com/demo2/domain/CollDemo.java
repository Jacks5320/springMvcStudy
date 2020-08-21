package com.demo2.domain;

import java.util.List;
import java.util.Map;

/**
 * 封装集合类型参数：一步到位，普通集合、引用类型集合、引用类型中包含引用类型的集合
 */
public class CollDemo {
    private List<String> list;
    private List<Account> userList;
    private Map<String,String> map;
    private Map<String,Account> userMap;

    @Override
    public String toString() {
        return "CollDemo{" +
                "list=" + list +
                ", userList=" + userList +
                ", map=" + map +
                ", userMap=" + userMap +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<Account> getUserList() {
        return userList;
    }

    public void setUserList(List<Account> userList) {
        this.userList = userList;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, Account> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, Account> userMap) {
        this.userMap = userMap;
    }
}
