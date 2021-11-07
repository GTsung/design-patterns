package com.home.mediator;

import java.awt.*;

/**
 * @author GTsung
 * @date 2021/11/7
 */
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 下达启用禁用指示
     * @param enabled
     */
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
