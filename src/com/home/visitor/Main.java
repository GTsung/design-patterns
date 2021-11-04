package com.home.visitor;


/**
 * 访问者模式，用于将数据结构及处理分隔开
 * @author GTsung
 * @date 2021/11/4
 */
public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tempDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        root.add(binDir);
        root.add(tempDir);
        root.add(usrDir);
        binDir.add(new File("vi", 1000));
        binDir.add(new File("latex", 3000));
        root.accept(new ListVisitor());

    }
}
