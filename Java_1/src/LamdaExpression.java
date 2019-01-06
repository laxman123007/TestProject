import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Employee
{
  
  public int ID;
  
  public int Age;
  
  public String Name;

  public Employee(int id , int age, String name)
  {
	  ID = id;
	  Age = age;
	  Name = name;
  }
  
  public String toString()
  {
	  return ID + " " + " " + Age + " " + Name;
  }
}
public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = Arrays.asList(5,6,7,4,3,2);
//		
//		//list.forEach(i -> System.out.println(i));
//		
//		
//		Collections.sort(list, (Integer i, Integer j) -> i-j);
//		
//		list.forEach(i -> System.out.println(i));
		
		 List<Employee> list = new ArrayList<Employee>();
		 
		 list.add(new Employee(1,21,"Laxman"));
		 
		 list.add(new Employee(2,22,"Sumit"));
		 
		 list.add(new Employee(3,23,"Akanksha"));
		 
		 list.add(new Employee(4,24,"Madhur"));
		 
		 Collections.sort(list,(e1,e2) -> e1.Name.compareTo(e2.Name));
		 
		 list.forEach(i -> System.out.println(i));
		 
		 
		 
		 
		 
	
	}

}
