public class Caminhao extends Veiculo {
    private int numeroEixos;
    private float capCarga;
    public Caminhao(String placa, String marca, String modelo, int numeroEixos, float capCarga) {
        super(placa, marca, modelo);
        this.numeroEixos = numeroEixos;
        this.capCarga = capCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }

    public void desengatarReboque() {
        System.out.println("Desengatando reboque...");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNumero de eixos: " + this.getNumeroEixos()
                + "\nCapacidade de carga: " + this.getCapCarga();
    }
}
