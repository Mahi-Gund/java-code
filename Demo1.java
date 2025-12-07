class A{
}
class B extends A{
}
class D{
}
class Demo1
{
public static void main(String args[]){
A  a1=new A();
System.out.println(a1.instance of B);
//System.out.println(a1.instance of D);
System.out.println(a1.instance of Object);
System.out.println(a1.instance of A);
}
}
