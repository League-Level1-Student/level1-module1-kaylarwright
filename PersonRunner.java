
public class PersonRunner {
	
public static void main(String[] args) {
	Person n = new Person();
	Person a = new Person();
	Person m = new Person();
	n.setSuperpower("speed");
	a.setSuperpower("strength");
	m.setSuperpower("invisibility");
	n.setName("Kevin");
	a.setName("James");
	m.setName("Kayla");
	System.out.println(n.toString());
	System.out.println(a.toString());
	System.out.println(m.toString());
}
}
