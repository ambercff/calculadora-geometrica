public class Quadrado {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return this.lado * 4;
    }
    public double calcularArea() {
        return this.lado * this.lado;
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O quadrado tem perímetro de %.2f e área de %.2f", this.calcularPerimetro(), this.calcularArea());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
