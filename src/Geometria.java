public class Geometria {
    public double raio;
    public double ladoA;
    public double ladoB;

    // Cálculo do Área (Círculo)
    public double calcular (double raio) {
        this.raio = 3.14 * (raio * raio);
        return (this.raio);
    }
    // Cálculo da área do Retângulo
    public double calcular (double ladoA, double ladoB){
        double area = ladoA * ladoB;
        return area;
    }
}
