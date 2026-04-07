import java.util.Scanner;

public class FiscalizacaoChocolate {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int acucar;
    double teor, preco, pureza;
    String choc;

    System.out.println("qual o teor do cacau em porcentagem?");
    teor = sc.nextInt();

    if(teor < 25){
        System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate");
    }else if(teor >= 25.00 && teor <35.00){
        System.out.println("Chocolate Comum (Padrão Nacional Atual)");
    }else if(teor >= 35.00){
        System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
    }

    System.out.println("o chocolate é [AO_LEITE ou AMARGO]?");
    choc = sc.next();

    if(choc.equalsIgnoreCase("AO_LEITE")){
        System.out.println("qual a quantidade de gramas de açúcar?");
        acucar = sc.nextInt();

        if(acucar > 15){
            System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");
        }else{
            System.out.println("Classificação: Chocolate balanceado");
        }
    }else{
        System.out.println("Classificação: Chocolate balanceado");
    }
     
    System.out.println("qual o preço do ovo de páscoa?");
    preco = sc.nextDouble();

    System.out.println("qual a nota de pureza?");
    pureza = sc.nextDouble();

    if(preco > 100 || pureza < 5 ){
        System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
    }else{
        System.out.println("APROVADO: Produto competitivo para o mercado externo");
    }

    sc.close();



  }  
}
