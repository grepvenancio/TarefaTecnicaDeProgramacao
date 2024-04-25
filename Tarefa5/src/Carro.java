public class Carro extends Veiculo {
    private String tipoCarroceria;
    public Carro(String placa, String marca, String modelo, String tipoCarroceria) {
        super(placa, marca, modelo);
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public void abrirPortaMalas() {
        System.out.println("Ligou! ");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarroceria: " + this.getTipoCarroceria();
    }
}
