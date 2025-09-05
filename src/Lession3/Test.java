package Lession3;

class A implements MultipleInheritance{

    @Override
    public String foo() {
        return "in Class A";
    }
}

class B implements MultipleInheritance{

    @Override
    public String foo() {
        return "in Class B";
    }
}

interface MultipleInheritance{
    String foo();
}


class C {

}


public class Test {
    public static void main(String[] args) {
        MultipleInheritance obj = new B();
        String s = obj.foo() ;
        System.out.println(s);
    }
}
