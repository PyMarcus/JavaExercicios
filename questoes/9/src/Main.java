import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // ler a hora

         int contaPositivos = 0;
         int contaNegativos = 0;
         int impares = 0;
         int pares = 0;
         
       for (int i = 0; i < 5; i ++){
           int numero = input.nextInt();
        if (numero % 2 == 0){
            pares++;
        }else{
            impares ++;
        }
        if (numero > 0){
            contaPositivos ++;
            }else if (numero < 0) {  // aparentemente, ele desconsiderou o zero
             contaNegativos ++;
        }
    }
       System.out.printf("valores pares %d\n", pares);
       System.out.printf("valores impares %d\n", impares);
       System.out.printf("valores negativos %d\n", contaNegativos);
       System.out.printf("valores positivos %d\n", contaPositivos);
}
}
