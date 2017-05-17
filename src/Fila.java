public class Fila {

    Object[] dados;
    int tamanhoMax = 5;
    int inicio = 0;
    int fim;

    public Fila() {
        this.dados = new Object[tamanhoMax];
        this.fim = -1;
    }

    public boolean cheio() {
        return ((fim + 1) == tamanhoMax);
    }

    public boolean vazio() {
        return (fim == -1);
    }

    public int vago() {
        return tamanhoMax - (fim + 1);
    }

    public int qnt() {
        return (fim - inicio) + 1;
    }

    public Object inserir(Object elemento) {
        if (cheio()) {
            return null;
        }

        this.dados[++fim] = elemento;
        return elemento;
    }

    public Object retirar() {
        if (vazio()) {
            return null;
        }
        Object elemento = dados[inicio];
        dados[inicio++] = null;

        return elemento;
    }

}
