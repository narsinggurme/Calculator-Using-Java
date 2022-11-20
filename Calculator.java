import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;

        while(true){
            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op =='/' || op == '%'){
                
                System.out.println("Enter two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
              
                in.close();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2!=0){
                    ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'x'){
                break;
            }
            else{
                System.out.println("Invalid operation");
                
            }
            System.out.println(ans);
            
        }
        
    }
}