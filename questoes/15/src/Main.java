import java.util.Scanner;

//ler n e calcular a soma dos ímpares até n
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int soma = 0;
        
        int numero = input.nextInt();
        for (int i = 0; i <= numero; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }System.out.println(soma);
    }
}