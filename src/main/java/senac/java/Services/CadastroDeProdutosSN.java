package senac.java.Services;
import senac.java.View.Imprimir;

public class CadastroDeProdutosSN {
    public static void RespostaProduto(String resposta){
        Imprimir imprimir = new Imprimir();

    if(resposta == "s"){
        Imprimir.telaInicial();
    } else if (resposta == "n") {
        System.out.println("SEU PRODUTO FOI CADASTRADO");
        imprimir.resultadosDoCadastro();
    }
    }
}
