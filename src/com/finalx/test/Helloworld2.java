package com.finalx.test;

/**
 * Created by tengyu on 2016/7/11.
 */
public class Helloworld2 {
    public  static void main(String[] args){
        System.out.println("hello,world");
        String str=new String("hello,world");
        Integer i=2;
        Helloworld2 h2=new Helloworld2();
        h2.test();

    }
    public void test(){
        System.out.println("hello,world,test");
    }
}
class hello extends Helloworld2{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        hello hello = (hello) o;

        if (id != hello.id) return false;
        return name.equals(hello.name);

    }

    @Override
    public String toString() {
        return "hello{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    public String name;
}
