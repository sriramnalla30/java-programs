import java.util.Scanner;

 public class matrix_rotation {
     static void func(int mat[][],int r,int n){

      for(int k=0;k<r;k++){
         int newmat[][]=new int[n][n];
         for (int i = 0; i <n ; i++){
          for(int j=0;j<n;j++){
             if(i==1 & j==1){
                newmat[i][j]=mat[j][i];
             }
             else{
                 newmat[i][j]=mat[j][n-i-1];
             }
         }
         }
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 System.out.print(" "+newmat[i][j]);
             }
         }
         } 
        
     }
    
     public static void main(String args[]){
         System.out.println("enter the matrix sixe");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int mat[][]=new int[n][n];
         System.out.println("enter the nof rotations");
         int r=sc.nextInt();
        
         for (int i = 0; i <mat.length ; i++){
          for(int j=0;j<mat.length;j++){
           mat[n][n]=sc.nextInt();  
          }
         }
         func(mat,r,n);
     }
 }
