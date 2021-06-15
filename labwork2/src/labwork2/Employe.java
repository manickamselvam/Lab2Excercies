package labwork2;

public class Employe {
int empid;
String empname;
Employe(int id,String name){
	this.empid=id;
	this.empname=name;
}
void info() {
	System.out.println("Id:  "+empid+" Name:  "+empname);
}
public static void main(String[] args) {
	Employe obj1 = new Employe(123, "manick");
	Employe obj2 = new Employe(124, "manickam");
	obj1.info();
	obj2.info();
}
}
