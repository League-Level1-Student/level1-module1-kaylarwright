
public class Person {
	String n = "name";
	String s = "superpower";
public static void main(String[] args) {
	
}
void setName(String n) {
	this.n = n;
}
void setSuperpower(String s) {
	this.s = s;
}
String getName() {
	return this.n;
}
String getSuperpower() {
	return this.s;
}
public String toString() {
	return n + " has mad " + s + " skills";
}
}
