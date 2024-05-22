public class Retangulo {
    double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.base) + 2 * (this.altura);
    }

    public double calcularArea(){
        return this.base * this.altura;
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O retângulo tem perímetro de %.2f e área de %.2f", this.calcularPerimetro(), this.calcularArea());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
