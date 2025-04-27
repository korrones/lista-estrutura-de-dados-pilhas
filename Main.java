import estruturas.Documento;
import estruturas.EditorTexto;
import estruturas.FilaImpressao;
import estruturas.ListaVetor;
import estruturas.PilhaVetor;

public class Main {
    public static void main(String[] args) {

        ListaVetor listavetor = new ListaVetor();
        PilhaVetor pilhavetor = new PilhaVetor(10);
        String elementoremovido;
        EditorTexto editor = new EditorTexto(10);

        listavetor.adicionar(1);
        listavetor.adicionar(2);
        listavetor.adicionar(3);
        listavetor.adicionar(4);
        listavetor.adicionar(5);
        listavetor.adicionar(6);
        listavetor.adicionar(7);
        listavetor.adicionar(8);
        listavetor.adicionar(9);
        listavetor.adicionar(10);

        System.out.println("A Pilha está vazia?");
        pilhavetor.verificarPilha();

        System.out.println("-----");
        System.out.println("Tamanho da pilha: " + listavetor.getTamanho()); 
        System.out.println("Elementos da pilha: " );
        listavetor.mostrarElementos();
        System.out.println("-----");

       pilhavetor.empilhar("a");
       pilhavetor.empilhar("b");
       pilhavetor.empilhar("c");
       pilhavetor.empilhar("d");

       System.out.println("------");
       System.out.println("Elementos da pilha: " );
       pilhavetor.mostrarElementos();
       System.out.println("------");
       
       System.out.println("Removendo elemento da pilha");
       elementoremovido = pilhavetor.desempilhar();
       pilhavetor.mostrarElementos();

       System.out.println("Removendo elemento da pilha");
       elementoremovido = pilhavetor.desempilhar();
       pilhavetor.mostrarElementos();

       System.out.println("A Pilha está vazia?");
       pilhavetor.verificarPilha();
       System.out.println("------");

       editor.inserirTexto("Olá");
       System.out.println("------");
       editor.inserirTexto("Olá, tudo bem?");
       System.out.println("------");
       editor.inserirTexto("Olá, tudo bem?");
    
       System.out.println("------");
       editor.desfazer(); 
       System.out.println("------");
       editor.desfazer(); 
       System.out.println("------");
       editor.refazer(); 
    
       editor.mostrarTexto();


       System.out.println("------FILA DE IMPRESSÃO -------");

        FilaImpressao fila = new FilaImpressao(5);

        fila.adicionarDocumento(new Documento("Artigo.pdf", 1500));
        fila.adicionarDocumento(new Documento("Trabalho.docx", 800));

        fila.mostrarFila();

        fila.imprimirProximo();
        fila.imprimirProximo();

        fila.mostrarFila();
    }
}
