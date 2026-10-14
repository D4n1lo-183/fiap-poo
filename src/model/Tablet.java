package model;

public class Tablet extends Eletronico{
    private boolean caneta;

    public Tablet(String cor, String marca, double armazenamento, boolean caneta) {
        super(cor,marca,armazenamento);
    }
}
