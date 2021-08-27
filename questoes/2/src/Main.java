import java.util.Scanner;

//emprestimo se não for 30% maior que o salário
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float salario , prestacao;
        salario = input.nextFloat();
        prestacao = input.nextFloat();
        //validação
        if (prestacao <= 0.3 * salario){
            System.out.println("sim");
        }else{
            System.out.println("nao");
        }
    }
}