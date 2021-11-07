package com.home.mediator;


/**
 * 仲裁者模式的接口
 */
public interface Mediator {

    /**
     * 生成管理的组员
     */
    void createColleagues();

    /**
     * 组员变化时报告给仲裁者
     */
    void colleaguesChanged();
}
