// cálculo de fatorial
import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int limite = input.nextInt();
        
        int fatorial = 1;
        
        for (int i = 1; i <= limite; i++){
            fatorial *= i;
        }System.out.println(fatorial);
    }
}