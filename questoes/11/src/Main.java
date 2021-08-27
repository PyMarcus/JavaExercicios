//somar numeros até que 0 seja digitado
import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        boolean condicao = true;
        int soma = 0;
        
        while(condicao){
            int valor = input.nextInt();
            
            if (valor == 0){
                condicao = false;
            }else{
                soma += valor;
            }
    }System.out.println(soma);
}
}