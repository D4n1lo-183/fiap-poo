package model;

public class Tablet extends Eletronico{
    private boolean caneta;

    public Tablet(String cor, String marca, double armazenamento, boolean caneta) {
        super(cor,marca,armazenamento);
    }

    @Override
    public void calcularAutonomiaBateria() {
        System.out.println("Tablet: Autonomia prolongada de 8 horas ativando o modo de economia.");
    }
}
