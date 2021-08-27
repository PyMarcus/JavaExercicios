//pegar 4 numeros e mostrar o menor
import java.util.Scanner;
 

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int menor = 0, valor;
        for(int i = 0; i < 4; i++){
            valor = input.nextInt();
            if (i == 0){
                menor = valor;
            }else{
                if (menor >= valor){
                    menor = valor;
                }
            }
        }
        System.out.println(menor);
    }
}