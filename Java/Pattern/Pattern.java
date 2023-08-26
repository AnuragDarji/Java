import java.util.*;

public class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for(int i=1;i<11;i++){
        //  System.out.println(n+"*"+i+"="+n*i);
        // }

        // for(int i=1;i<5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Solid rectangle pattern
        // System.out.print("Enter rows: ");
        // int r = sc.nextInt();
        // System.out.print("Enter cols: ");
        // int c = sc.nextInt();

        // // Outer loop
        // for(int i=1;i<=r;i++){
        //     // inner loop
        //     for(int j=1;j<=c;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Outer loop
        // for(int i=1;i<=r;i++){
        //     // inner loop
        //     for(int j=1;j<=c;j++){
        //         // cell->(i,j)
        //         if(i==1 || j==1 || i==r || j==c){
        //              System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<=n;i++){
        //     for(int k=1;k<=i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //  for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int number = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum = i+j;
        //         if(sum%2 == 0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int k=1;k<=2*(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(int l=1;l<=i;l++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int k=1;k<=2*(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(int l=1;l<=i;l++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
      
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        /* 
                *
               ***
              *****
             *******
             *******
              *****
               ***
                *
        */
        // //upper half
        //  for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //lower half
        //  for(int i=n;i>=1;i--){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
