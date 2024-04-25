public class Moto extends Veiculo {
    private int cilindrada;
    private String estiloGuidao;
    public Moto(String placa, String marca, String modelo, int cilindrada, String estiloGuidao) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
        this.estiloGuidao = estiloGuidao;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getEstiloGuidao() {
        return estiloGuidao;
    }

    public void setEstiloGuidao(String estiloGuidao) {
        this.estiloGuidao = estiloGuidao;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCilindrada: " + this.getCilindrada()
                + "\nGuidão: " + this.getEstiloGuidao();
    }
}
