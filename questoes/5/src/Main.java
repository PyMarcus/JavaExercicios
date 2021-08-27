import java.util.Scanner;

//5 -  receber notas av1, av2 e a frequencia, se frequencia for < 50 ou as notas menores q 4, repro
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float nota1, nota2, frequencia, media;
        nota1 = input.nextFloat();
        nota2 = input.nextFloat();
        frequencia = input.nextFloat();
        
        media = (nota1 + nota2) / 2;
        
        if (frequencia < 50 || nota1 < 4.0 && nota2 < 4.0){
            System.out.println("reprovado");
        }else if(frequencia >= 50 && nota1 < 4.0 || nota2 < 4.0 || media < 6.0){
            System.out.println("recuperacao");
        }else if(frequencia >= 50 && nota1 > 4.0 && nota2 > 4.0){
            System.out.println("aprovado");
        }
    }
}