package com.home.abstractFactory;

import com.home.abstractFactory.factory.Factory;
import com.home.abstractFactory.factory.Link;
import com.home.abstractFactory.factory.Page;
import com.home.abstractFactory.factory.Tray;
import com.home.abstractFactory.listfactory.ListFactory;

/**
 * 抽象工厂
 * @author GTsung
 * @date 2021/10/28
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = Factory.getFactory(ListFactory.class);

        Link people = factory.createLink("人民日报", "www.people.cn");
        Link gmw = factory.createLink("光明日报", "www.gu.cn");
        Link google = factory.createLink("谷歌", "www.google.cn");
        Link youtube = factory.createLink("油管", "www.youtube.cn");

        Tray news = factory.createTray("报纸");
        news.add(people);
        news.add(gmw);

        Tray website = factory.createTray("网站");
        website.add(google);
        website.add(youtube);

        Page page = factory.createPage("靠腰", "毛泽东");
        page.add(news);
        page.add(website);

        page.output();

    }
}
