package model;

public abstract class Eletronico {
    private double nivelBateria;
    private boolean ligado;
    private String cor;
    private String marca;
    private double armazenamento;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public Eletronico(String cor, String marca, double armazenamento) {
        this.cor = cor;
        this.marca = marca;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("Aviso: O Eletronico já está ligado.");
            return;
        }
        if (this.nivelBateria <= 0) {
            System.out.println("Erro: Bateria esgotada. Conecte o Eletronico na tomada para ligar.");
            return;
        }
        this.ligado = true;
        System.out.println("Eletronico da " + this.marca + " iniciando sistema...");
    }

    public void carregarBateria(double carga) {
        if (carga <= 0) {
            System.out.println("Erro: Valor de carga inválido.");
            return;
        }
        this.nivelBateria += carga;
        if (this.nivelBateria > 100.0) {
            this.nivelBateria = 100.0;
        }
        System.out.println("Bateria carregada. Nível atual: " + this.nivelBateria + "%");
    }

    public abstract void calcularAutonomiaBateria();
}
