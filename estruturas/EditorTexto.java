package estruturas;

public class EditorTexto {
    private PilhaVetor pilhaDesfazer;
    private PilhaVetor pilhaRefazer;
    private String textoAtual;

    public EditorTexto(int capacidade){
        pilhaDesfazer = new PilhaVetor(capacidade);
        pilhaRefazer = new PilhaVetor(capacidade);
        textoAtual = "";
    }

    public void inserirTexto(String novoTexto) {
        if (!textoAtual.equals(novoTexto)) {
            pilhaDesfazer.empilhar(textoAtual); // salva estado anterior
            textoAtual = novoTexto;
            pilhaRefazer.limpar(); // limpa refazer
            System.out.println("Texto atualizado: " + textoAtual);
        }
    }

    public void desfazer() {
        if (!pilhaDesfazer.estaVazia()) {
            pilhaRefazer.empilhar(textoAtual); // salva estado atual
            textoAtual = pilhaDesfazer.desempilhar(); // volta ao anterior
            System.out.println("Desfeito! Texto atual: " + textoAtual);
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    public void refazer() {
        if (!pilhaRefazer.estaVazia()) {
            pilhaDesfazer.empilhar(textoAtual); // salva estado atual
            textoAtual = pilhaRefazer.desempilhar(); // refaz
            System.out.println("Refeito! Texto atual: " + textoAtual);
        } else {
            System.out.println("Nada para refazer.");
        }
    }

    public void mostrarTexto() {
        System.out.println("Texto atual: " + textoAtual);
    }
}
