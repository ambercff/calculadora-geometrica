public class Hexagono {
    double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return this.lado * 6;
    }

    public double calcularArea(){
        return 6 * (this.lado * (Math.sqrt(3) / 2));
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O hexagono tem perímetro de %.2f e área de %.2f", this.calcularPerimetro(), this.calcularArea());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
