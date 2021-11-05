package com.home.chain;

/**
 * @author GTsung
 * @date 2021/11/5
 */
public abstract class Support {

    private String name;

    // 下一个处理类
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this);
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved");
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }

    protected abstract boolean resolve(Trouble trouble);


}
