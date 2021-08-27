// calcular a potencia de um numero
import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int base = input.nextInt();
        int expoente = input.nextInt();
        int potencia = 1;
        
        for(int i = 0; i < expoente; i++){
            potencia *= base;
        }
        System.out.println(potencia);
    }
}