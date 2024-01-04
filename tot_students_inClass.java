import java.util.Scanner;
import java.util.ArrayList;


class stud{
    String name;
    int id;
    int age;
    static int count=0;

    void stud( String name,int id,int age)
{
    this.name=name;
    this.id = id ;
    this.age  = age;
     count++; 
}
     void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Id   : " +this.id );
        System.out.println("age : "+this.age);
     }
    public static int total(){
        return count;
    }
}   

public class tot_students_inClass {
    public static void main(String[] args) {
        stud obj=new stud();
        Scanner sc=new Scanner(System.in);
         ArrayList<stud> cls = new ArrayList<stud>();
    System.out.println("Enter the number of students: ");
     int n=sc.nextInt();
     sc.nextLine();
     for(int i=0;i<n;i++){
     String nm=sc.nextLine();
     int d=sc.nextInt();
     int a=sc.nextInt();
     sc.nextLine();
     
     obj.stud(nm,d,a);
     }
     for(stud i:cls){
        i.display();
        System.out.println();
} 
    System.out.println("strength of clas is :"+obj.total());  
      sc.close();
}
   
}
    
