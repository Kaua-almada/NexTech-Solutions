package senac.java.View;
import java.util.Scanner;
import senac.java.Model.Products;
import senac.java.Services.CadastroDeProdutosSN;

public class Imprimir {

    public static void telaInicial(){
        Products products = new Products();
        CadastroDeProdutosSN cadastroDeProdutosSN = new CadastroDeProdutosSN();

        Scanner sc = new Scanner(System.in);
        String resposta = "";

        System.out.println("ola! Bem vindo ao sistema de cadastro de produtos");
        System.out.println("digite o nome do seu produto");
        products.nomeP = sc.nextLine();
        System.out.println("digite a descricao do seu produto");
        products.descricao = sc.nextLine();
        System.out.println("digite a categoria do seu produto");
        products.categoria = sc.nextLine();
        System.out.println("digite o preço do produto");
        products.preco = Double.parseDouble(sc.nextLine());
        System.out.println("digite a quantidade");
        products.quantidade = Integer.parseInt(sc.nextLine());
        System.out.println("digite o codigo de barras");
        products.codigoDeBarras = sc.nextLine();
        System.out.println("deseja cadastar um nome produto? caso sim digite sim caso nao digite nao");
        resposta = sc.nextLine();
        cadastroDeProdutosSN.RespostaProduto(resposta);
    }

    public static void resultadosDoCadastro(){
        Products products = new Products();
        System.out.println("o nome do produto cadastrado e "+ products.nomeP);
        System.out.println("descricao" + products.descricao);
        System.out.println("categoria" + products.categoria);
        System.out.println("preco" + products.preco);
        System.out.println("quantidade" + products.quantidade);
        System.out.println("codigo De Barras" + products.codigoDeBarras);
    }
}
