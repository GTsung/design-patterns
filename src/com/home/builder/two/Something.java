package com.home.builder.two;

/**
 * @author GTsung
 * @date 2021/10/27
 */
public class Something {

    private String name;

    private int age;

    private String sex;

    public Something() {
    }

    public Something(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "[name=\'"+this.name+"\',age=\'"+this.age+"\',sex=\'"+this.sex+"\'];";
    }

    public static SomethingBuilder builder() {
        return new SomethingBuilder();
    }

    public static class SomethingBuilder {
        private String name;

        private int age;

        private String sex;

        private SomethingBuilder() {
        }

        public SomethingBuilder age(int age) {
            this.age = age;
            return this;
        }

        public SomethingBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SomethingBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Something build() {
            return new Something(name, age, sex);
        }

    }
}
