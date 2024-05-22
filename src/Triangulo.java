public class Triangulo {
    double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return this.lado * 3;
    }

    public double calcularArea() {
        return this.lado * (Math.sqrt(3)/2);
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O triângulo tem perímetro de %.2f e área de %.2f", this.calcularPerimetro(), this.calcularArea());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
