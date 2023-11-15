import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the first integer
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        
        // Read the second integer
        /*System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();
        
        // Ensure firstNumber is less than or equal to secondNumber
        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        
        // Display the range and count of integers
        System.out.print("Integers between " + firstNumber + " and " + secondNumber + ": ");
        int count = 0;
        
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.print(i + " ");
            count++;
        }
        
        System.out.println("\nCount of integers: " + count);
        
        scanner.close();
    }
}
*/
// Ensure that the input is greater than two
if(firstNumber<2){
  System.exit(0);
}
 System.out.print("even Integers between " + 2 + " and " + firstNumber + " : ");
for(int i =2; i<=firstNumber;i+=2){
  System.out.print(i+" ");
  

  }
  scanner.close();
  }
  
  }