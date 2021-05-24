package TESTapi;

public class genericProgramming<E> {
    public void a(){}
    public void b(E e){}
    public <BB> void c(BB b){}
    //static修饰方法先于对现象存在， 不知到E 是什么， 需要在对象创建后才知道

    //public static void d(E e){}
    //static修饰方法先于对现象存在， 不知到e 是什么， 创建后也不确定， 所以不报错
    public static <BB> void e(BB b){}
    public void f(E[] a){}

    public <QQ> Object g(QQ...q){
        //参数为可变参数， 内部当作数组处理e
        return q;
    }
    public <QQ> QQ[] h(QQ...q){
        //参数为可变参数， 内部当作数组处理e
        return q;
    }
}

class A {
    public static void main(String[] args) {
        //genericProgramming g = new genericProgramming();
        genericProgramming<String> g2 = new genericProgramming<String>();
        g2.b("abc");
        //g2.f(12);
        g2.g();
    }
}
