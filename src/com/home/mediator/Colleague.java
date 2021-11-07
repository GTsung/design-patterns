package com.home.mediator;


public interface Colleague {

    /**
     * 设置仲裁者
     * @param mediator
     */
    void setMediator(Mediator mediator);

    /**
     * 此组员是否可用
     * @param enabled
     */
    void setColleagueEnabled(boolean enabled);
}
