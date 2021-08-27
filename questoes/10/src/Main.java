import java.util.Scanner;

//ler 4 alturas e exibir as informações maior , menor media
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double maior = 0.0;
        double menor = 0.0;
        double soma = 0.0;        
        
        for (int i = 0; i < 4; i++){
            
            double altura = input.nextDouble();
                       
            soma = soma + altura;
                    
            if (i == 0){
                maior = altura;
                menor = altura;
            }else{
                if (maior < altura){
                    maior = altura;
                }if (menor > altura){
                    menor = altura;
                }
            }
        }input.close();
       double media = soma / 4.0;
        System.out.printf("Maior altura: %.1f metros\n", maior);
        System.out.printf("Menor altura: %.1f metros\n", menor);
        System.out.printf("Altura media: %.1f metros\n", media);
        
    }
}