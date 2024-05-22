public class Cubo {
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double calcularAreaSuperficial() {
        return (lado * lado) * 6;
    }

    public double calcularVolume() {
        return (lado * lado) * lado;
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O cubo tem área de %.2f e o perímetro de %.2f", this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
