package com.home.composite;

/**
 * 组合模式
 * @author GTsung
 * @date 2021/11/3
 */
public class Main {

    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tempDir = new Directory("temp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tempDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 100));
        binDir.add(new File("latex", 100));

        rootDir.printList("");
    }
}
