public class ECB_Circulo {

    public class InicialesAlumno_Circulo {
     int id;
    double radio;
     String color;
    @Override
    public String toString() {
        return "InicialesAlumno_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public InicialesAlumno_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    }
}