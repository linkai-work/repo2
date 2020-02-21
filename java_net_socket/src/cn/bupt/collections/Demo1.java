package cn.bupt.collections;

public class Demo1{
    public static void main(String[] args){
        String s1="apple";
        String s2="apple";
        System.out.println(s1==s2);    //true
        System.out.println(s1.equals(s2));    //equals比较的是内容，true
        String s3=new String("apple");
        String s4=new String("apple");
        System.out.println(s3==s4);  //false
        System.out.println(s3.  equals(s4));  //true
        System.out.println(232);
        System.out.println(12);
    }
}
