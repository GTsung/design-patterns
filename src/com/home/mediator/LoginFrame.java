package com.home.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 仲裁者，用于调整多个类之间的关系，即不让各个类之间相互通信，而是使用一个中间人的角色将所有类做调节
 * @author GTsung
 * @date 2021/11/7
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {

    // 访问者，不需要密码用户即可登录
    private ColleagueCheckbox checkGuest;
    // 需要用户名密码登录
    private ColleagueCheckbox checkLogin;
    // 用户名
    private ColleagueTextField textUser;
    // 密码
    private ColleagueTextField textPass;

    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(4, 2));
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("username:"));
        add(textUser);
        add(new Label("password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        // 设置启用禁用
        colleaguesChanged();
        pack();
        show();
    }

    @Override
    public void createColleagues() {

        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textUser.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    @Override
    public void colleaguesChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {

        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
