import java.util.Scanner;


//calcular a soma dos pesos das pessoas com + de 30 anos
class Main{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        
        int qntDePessoas = input.nextInt();
        float soma = 0;       
        
        for (int i = 0; i < qntDePessoas; i++){
           int idade = input.nextInt();
           float peso = input.nextFloat();
           if (idade > 30){
               soma += peso;
           }
        }
        System.out.println(soma);
        
    }
}