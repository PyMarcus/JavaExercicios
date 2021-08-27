//questão 3 ler a sigla do estado e imprir este estado

import java.util.Scanner;


class Main{
    public static void main(String[] args){
        
      Scanner  input = new Scanner(System.in);
      String estado = input.next().toLowerCase();
      
      if (estado.equals("rj")){   //java considera Strings como classes entao, aponta para a memória e não para oc
            System.out.println("carioca");
       }else if (estado.equals("sp")){
            System.out.println("paulista");
        }else if (estado.equals("mg")){
            System.out.println("mineiro");
        }else if (estado.equals("rn")){
            System.out.println("potiguar");
        }else if (estado.equals("es")){
            System.out.println("capixaba");
        }else if (estado.equals("rs")){
            System.out.println("gaucho");
        }else if (estado.equals("sc")){
            System.out.println("catarino");
        }else{
            System.out.println("outro estado");
        }
        
    }
}