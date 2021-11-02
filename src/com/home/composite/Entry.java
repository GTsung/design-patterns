package com.home.composite;

/**
 * 文件与目录的抽象类，leaf角色与composite角色的基类
 *
 * @author GTsung
 * @date 2021/11/3
 */
public abstract class Entry {

    // 获取名称
    public abstract String getName();

    // 获取文件大小
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatementException {
        throw new FileTreatementException();
    }

    public void printList() {
        System.out.println("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
