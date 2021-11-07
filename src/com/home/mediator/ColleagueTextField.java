package com.home.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @author GTsung
 * @date 2021/11/7
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {

    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.WHITE : Color.LIGHT_GRAY);
    }

    // 发生变化通知仲裁者
    public void textValueChanged(TextEvent e) {
        mediator.colleaguesChanged();
    }
}
