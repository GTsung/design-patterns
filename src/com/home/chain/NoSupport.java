package com.home.chain;

/**
 * 不解决任何问题
 * @author GTsung
 * @date 2021/11/5
 */
public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
