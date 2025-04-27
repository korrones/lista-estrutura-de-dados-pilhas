package estruturas;

public class PilhaVetor {
    private Object[] elementos;
    private int topo;
    private int capacidade;

    public Object[] getElementos() {
        return elementos;
    }

    public void setElementos(Object[] elementos) {
        this.elementos = elementos;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void mostrarElementos(){
        if (topo == -1) {
            System.out.println("A lista está vazia");
        }else{
            for(int i = topo; i>= 0; i--){
                System.out.println(elementos[i] + " ");
            }
        }
    }

    public PilhaVetor(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.topo = -1;
    }

    public void aumentarCapacidade(){
        int novaCapacidade = this.capacidade * (this.capacidade/2);
        Object[] novoVetor = new Object[novaCapacidade];

        for(int i =0; i<= topo; i++){
            novoVetor[i] = elementos[i];
        }
        elementos = novoVetor;
        this.capacidade = novaCapacidade;
    }

    public void empilhar(Object elementoAtual){
        if (topo >= capacidade -1) {
            aumentarCapacidade();
        }
        topo++;
        elementos[topo] = elementoAtual;

        System.out.println("Elemento empilhado: " + elementoAtual);
        System.out.println("Novo topo (índice): " + topo);
        
    }

    public String desempilhar() {
        if (topo >= 0) {
            String elemento = (String) elementos[topo]; // cast necessário
            topo--;
            return elemento;
        } else {
            throw new IllegalStateException("A Pilha está vazia");
        }
    }
    
    public void verificarPilha(){
        if (topo == -1) {
            System.out.println("Sim! A Pilha está vazia");
        }else{
            System.out.println("Não! A Pilha possuí elementos!");
        }
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public void limpar() {
        topo = -1;
    }
}
