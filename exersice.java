import java.util.Scanner;

public class exersice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        /*for(int i=1;i<=number;i++){
          for(int j=1;j<=number-1;j++)
          System.out.print(" ");
          for(int j=1;j<=2*i-1;j++)
          System.out.print("*");
          System.out.println();
        }*/
        for(int i=1;i<=number;i++){
          if(i==1||i==number)
          for(int j=1;j<=number;j++)
            System.out.print(" * ");
            else
            for(int j=1;j<=number;j++)
              if(j==1||j==number)
              System.out.print(" * ");
              else
              System.out.print(" ");
              System.out.println();


        }

        }
        

        }

        