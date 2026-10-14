package model;

public class Pelicula {
    private String resistencia;
    private String material;

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Pelicula(String resistencia, String material) {
        this.setResistencia(resistencia);
        this.setMaterial(material);
    }
}
