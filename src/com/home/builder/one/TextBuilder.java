package com.home.builder.one;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("==============\n");
        buffer.append(title );
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("!!!").append(str).append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(items[i]);
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("=================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
