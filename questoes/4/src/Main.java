import java.util.Scanner;


// ler 3 números e exibí-los em ordem decrescente
class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int maior1, maior2, maior3;
        
        maior1 = input.nextInt();
        maior2 = input.nextInt();
        maior3 = input.nextInt();
        
        if (maior1 >= maior2 && maior1 >= maior3 && maior2 >= maior3){
            System.out.printf("%d\n%d\n%d\n",maior1, maior2, maior3);
        }else if (maior2 >= maior1 && maior2 >= maior3 && maior1 >= maior3){
            System.out.printf("%d\n%d\n%d\n",maior2, maior1, maior3);
        }else if (maior3 >= maior1 && maior3 >= maior3 && maior2 >= maior1){
            System.out.printf("%d\n%d\n%d\n",maior3, maior2, maior1);
        }else if (maior3 >= maior1 && maior3 >= maior3 && maior1 >= maior2){
            System.out.printf("%d\n%d\n%d\n",maior3, maior1, maior2);
        }else if (maior1 >= maior2 && maior1 >= maior3 && maior3>= maior2){
            System.out.printf("%d\n%d\n%d\n",maior1, maior3, maior2);
        }else if (maior2 >= maior1 && maior2 >= maior3 && maior3 >= maior1){
            System.out.printf("%d\n%d\n%d\n",maior2, maior3, maior1);
    }
}}