import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int numero = input.nextInt();
        if (numero % 2 == 0 && numero % 5 == 0){
            int soma = numero + 5;
            System.out.println(soma);
        }else if (numero % 2 != 0){
            int soma = numero + 8;
            System.out.println(soma);
        }
    }
}