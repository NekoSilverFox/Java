/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/10 18:59
 * @Author : NekoSilverfox
 * @FileName: DataObject
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.bigdata.server;

public class DataObject {
    private long id;
    private String name;

    public DataObject(long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
