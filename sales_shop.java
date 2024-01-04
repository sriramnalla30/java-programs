import java.util.Scanner;
class product{
    String name;
    int price;
    int qty;
  product(String name,int price ,int qty)
{
  this.name=name;
  this.price=price;
  this.qty =qty;
}
public int total(){
    return price*qty;
}
public void update(int q){
    this.qty=this.qty+q;
}
 
  } 

public class sales_shop {
    public static void main(String[] args) {
        System.out.println("enter the no of products :");
        Scanner sc = new Scanner (System.in );
        int n=sc.nextInt();
        sc.nextLine();
        product obj[]=new product[n];
        for(int i=0 ;i<obj.length;++i){
            System.out.println("name:");
            String na=sc.nextLine();
            System.out.println("price");   
            int p=sc.nextInt();
            System.out.println("quantity:");
            int q=sc.nextInt();
            sc.nextLine();
      boolean b=false;
            for(int j=0;j<i;j++){
                if(obj[j].name.equals(na)){
                    obj[j].update(q);
                    b=true;
                    break;
                } 
            }
            if(!b){
               obj[i]=new  product(na,p,q);
            }
        }

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].name + ": rupee" + obj[i].total());
        }   
    }
}
