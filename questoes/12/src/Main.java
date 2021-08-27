import java.util.Scanner;

// somar 2 numeros até que ambos sejam 0
class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int soma = 0, valor1, valor2;
        
       while(true){
            valor1 = input.nextInt();
            valor2 = input.nextInt();
            if (valor1 == 0 && valor2 == 0){
                break;
            }
            soma = valor1 + valor2;
            System.out.println(soma);
        }
    }
}