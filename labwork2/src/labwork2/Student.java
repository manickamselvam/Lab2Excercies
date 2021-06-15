package labwork2;

public class Student {

public static void main(String[] args) {
	Stest s1 = new Stest();
	Stest s2 = new Stest();
	s1.name = "Nikith";
	s1.city = "Namakkal";
	s1.age = 25;
	s2.name = "Raja";
	s2.city = "Trichy";
	s2.age = 30;
	s1.printData();
	s2.printData();
	s1.m=22;
	s2.m=23;
	Stest.m=24;
	
	System.out.println(s1.m);
	System.out.println(s2.m);
	System.out.println(Stest.m);
}

}
class Stest{
	String name,city;
	int age;
	static int m;

	void printData() {
		System.out.println(name);
		System.out.println(city);
		System.out.println(age);
	}
}
