public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private double capMaxGas;
    private double velMax = 180;
    private double velAtual = 0;
    private boolean status = false;

    public Carro(double capMaxGas, String marca, String modelo, String placa) {
        this.capMaxGas = capMaxGas;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    public double getCapMaxGas() {
        return capMaxGas;
    }
    public void setCapMaxGas(double capMaxGas) {
        this.capMaxGas = capMaxGas;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVelAtual() {
        return velAtual;
    }
    public double getVelMax() {
        return velMax;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public double precoAbastecimento(double precoGas) {
        return this.capMaxGas * precoGas;
    }

    public void girarChave(){
        this.status = !this.status;
        if (this.status)
        { System.out.println("Carro ligou");
        } else {
            System.out.println("Carro desligou");
        }
    }


    public void acelerar(double acc){
        if (this.status) {
            if (this.velAtual + acc > this.getVelMax()) {
                this.velAtual = this.getVelMax();
            } else {
                this.velAtual += acc;
            }
        }
    }
    public void frear(double fre){
        if (this.status) {
            if (this.velAtual - fre < 0) {
                this.velAtual = 0;
            } else {
                this.velAtual -= fre;
            }
        }
    }
    public void buzinar(){
        System.out.println("bi bi bi");
    }
}