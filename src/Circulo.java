public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro(){
        return 2 * (Math.PI * this.raio);
    }

    public double calcularArea(){
        return Math.PI * (this.raio * this.raio);
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O círculo tem perímetro de %.2f e área de %.2f", this.calcularPerimetro(), this.calcularArea());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
