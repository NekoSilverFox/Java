/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 13:50
 * @Author : NekoSilverfox
 * @FileName: Proxy
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

public class Proxy implements Rent{
    private Master master;

    public Proxy() {
    }

    public Proxy(Master master) {
        this.master = master;
    }

    @Override
    public void Rent() {
        seeHouse();
        agencyFee();
        writeContract();
        master.Rent();
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public void seeHouse() {
        System.out.println("中介带着你去看房子");
    }

    public void writeContract() {
        System.out.println("中介跟你签合同");
    }

    public void agencyFee() {
        System.out.println("收你中介费");
    }

}
