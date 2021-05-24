package TESTapi;

import java.util.ArrayList;

public class Personm {
    int age;

    public Personm(int age) {
        this.age = age;
    }

    public Personm() {
    }

    @Override
    public String toString() {
        return "Personm{" +
                "age=" + age +
                '}';
    }
}
class Student extends Personm{
    String name;

    public Student(int age, String name) {
        super(age);
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Personm> al = new ArrayList<Personm>();
        al.add(new Personm(12));
        al.add(new Personm(10));
        al.add(new Personm(18));
        show(al);

        ArrayList<Student> al2 = new ArrayList<Student>();
        al2.add(new Student("nana"));
        al2.add(new Student("jana"));
        al2.add(new Student("rana"));
        al2.add(new Student("uana"));
        show(al2);
    }
//泛型受限， 泛型的上限， 只要是Person或者他的子类， 都可以传进来
    //extends A 只要是A或者A的子类都行
    //下限 super A 只要A 或者A 的父类都行
    public static void show(ArrayList<? extends Personm> al){
        for (Personm p : al){
            System.out.println(p);
        }
    }
    /*public static void show(ArrayList<Student> al2){
        for (Student student : al2){
            System.out.println(student);
        }
    }

     */

}
