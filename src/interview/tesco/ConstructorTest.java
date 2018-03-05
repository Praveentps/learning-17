package interview.tesco;

public class ConstructorTest {
    public static void main(String[] args) {
        A a=new A();
        a.dosomething();

        B b=new B();
        b.dosomething();

        C c=new C();
        c.dosomething();

        D d=new D();
        d.dosomething();
    }
}

class A{
    A(){
        this.dosomething();
    }

    public void dosomething() {
        System.out.println("A");
    }
}

class B extends A{
    @Override
    public void dosomething(){
        System.out.println("B");
    }
}

class C extends A{
    @Override
    public void dosomething(){
        System.out.println("C");
    }
}

class D extends A{

}
