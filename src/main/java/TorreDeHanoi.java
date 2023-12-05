public class TorreDeHanoi {
    private int movimentos;

    public TorreDeHanoi() {
        this.movimentos = 0;
    }

    public int resolverHanoi(int discos) {
        this.movimentos = 0;
        moverTorres(discos, 'A', 'C', 'B');
        return this.movimentos;
    }

    private void moverTorres(int discos, char origem, char destino, char auxiliar) {
        if (discos == 1) {
            System.out.println("Mova o disco de " + origem + " para " + destino);
            this.movimentos++;
            return;
        }

        moverTorres(discos - 1, origem, auxiliar, destino);
        System.out.println("Mova o disco de " + origem + " para " + destino);
        this.movimentos++;
        moverTorres(discos - 1, auxiliar, destino, origem);
    }
}
