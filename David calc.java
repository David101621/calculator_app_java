import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("number 1:");
         int num1=input.nextInt();
        
        System.out.print("number 2:");
        int num2=input.nextInt();
      int sum=num1+num2;
        int product=num1*num2;
        int difference=num1-num2;
        double division=(double)num1/num2;
                   
        
        System.out.println("The sum of two integers"+" "+sum); 
                System.out.println("The product of two integers"+" "+product); 
                
            System.out.println("The difference of two integers"+" "+difference); 
                System.out.println("The quiotent of two integers"+" "+division); 
                
        
                   
}
}
