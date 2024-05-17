package Test;
import java.util.Scanner;
public class Matris {
    
    public static void main(String[] arges){
        Scanner sc= new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int[][] A=new int[3][3];
        int[][] B=new int[3][3];
        int[][] C=new int[3][3];
       
        System.out.println("avali");
        String nameA=sc.nextLine();
        int rowA=sc.nextInt();
        int columA=sc.nextInt();
        A=matris(nameA,rowA,columA);
       
        System.out.println("dovomi");
        String nameB=sc1.nextLine();
        int rowB=sc1.nextInt();
        int columB=sc1.nextInt();
        B=matris(nameB,rowB,columB);
        
        if(rowA==rowB){
            if(columA==columB){
                for(int i=0;i<rowA;i++){
                    for(int j=0;j<columA;j++){
                        C[i][j]=A[i][j]*B[i][j];
                    }
                }
                System.out.println("matris hasel zarb = ");
                for(int i=0;i<rowA;i++){
                    for(int j=0; j<columA;j++){
                      System.out.print(C[i][j] + " ");  
                        
                    }
                    System.out.print("\n");
                }
        
            }
            else{
                System.out.println("nadorost");
            }
        }
        else{
            System.out.println("nadorost");
        }
        
        
    }

    
    
    
    
    public static int[][] matris(String a, int s,int d){
        int[][] z=new int[3][3];
        Scanner sc= new Scanner(System.in);
        
        System.out.println("deraye haye matris " + a + " ra vared konid.");
        for(int i=0;i<s;i++){
            for(int j=0; j<d;j++){
                int y=sc.nextInt();
                z[i][j]=y;
            }
        }
        System.out.println("matris " + a +" = ");
        for(int i=0;i<s;i++){
            for(int j=0; j<d;j++){
              System.out.print(z[i][j] + " ");  
                
            }
            System.out.print("\n");
        }
        return z;
    }

}
