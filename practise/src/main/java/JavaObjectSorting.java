
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Employee(String name, int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name) ;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
}

public class JavaObjectSorting  {

    /**
     * This class shows how to sort primitive arrays, 
     * Wrapper classes Object Arrays
     * @param args
     */
    public static void main(String[] args) {
        //sort primitives array like int array
        int[] intArr = {5,9,1,10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        
        //sorting String array
        String[] strArr = {"A", "C", "B", "Z", "E"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        
        //sorting list of objects of Wrapper classes
        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.sort(strList);
        for(String str: strList) System.out.print(" "+str);
        
        List<Employee> listEmp = new ArrayList<Employee>();
        
        listEmp.add(new Employee("S", 2));
        listEmp.add(new Employee("A", 1));
        listEmp.add(new Employee("F", 4));
        listEmp.add(new Employee("S", 5));
        listEmp.add(new Employee("E", 7));
        
        Collections.sort(listEmp);
        System.out.println(listEmp);
      
    }

}