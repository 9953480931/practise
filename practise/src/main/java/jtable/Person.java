package jtable;

public class Person {
 String name;
 String age;
 Country country;
 boolean flag;
public Person(String name, String age, Country country,boolean flag) {
	super();
	this.name = name;
	this.age = age;
	this.country = country;
	this.flag=flag;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public boolean isFlag() {
	return flag;
}
public void setFlag(boolean flag) {
	this.flag = flag;
}
 
}
