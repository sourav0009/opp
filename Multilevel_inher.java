class A{
    void display_a(){
        System.out.println("This is class a method");
    }
}
class B extends A{
    void display_b(){
        System.out.println("This is class b method");
    }
}
class C extends B{
    void display_c(){
        System.out.println("This is class c method");
    }
}
public class Multilevel_inher {
    public static void main(String[] args) {
		C obj = new C();
		obj.display_a();
		obj.display_b();
		obj.display_c();
	}
}
