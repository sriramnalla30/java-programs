import java.util.ArrayList;
import java.util.Scanner;

class Employee{
String name,dep;
int  id,sal;
public Employee(String name,int id ,String dep,int sal){
    this.name=name;
    this.id = id ;
    this.dep=dep;
    this.sal=sal;
  
}
boolean check_eng(){
    if((this.dep.equalsIgnoreCase("engineering"))){
        return true;
    }
    return false;
    
}
public void display(){
    System.out.println("\n\tEmployee Name : "+this.name);
}
}
public class employee_classes {
    
    public static void main(String[] args) {
    ArrayList<Employee> emp= new ArrayList<>();
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter the number of employees");
    int n =sc .nextInt();
    sc.nextLine();
    for(int i=0;i<n;i++){
      System.out.println("enter the employee name:");
      String str=sc.nextLine();
      System.out.println("ENTER THE ID NUMBER:");
      int d =sc.nextInt();
          sc.nextLine();
      System.out.println("enter the depition of the employee:");
      String p=sc.nextLine();
      System.out.println("enter the salary of the employee:");
      int s=sc.nextInt();
    emp.add(new Employee(str,d,p,s));
    } 

        
    for (int i = 0; i < n; i++) {
        if (emp.get(i).check_eng()) {
            emp.get(i).display();
        }
    }
}
}