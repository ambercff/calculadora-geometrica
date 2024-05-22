public class Paralelepipedo {
    double comprimento, altura, largura;

    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularAreaSuperficial(){
        return 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura));
    }

    public double calcularVolume(){
        return (this.comprimento * this.altura) * this.largura;
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O paralelepipedo tem área de %.2f e o perímetro de %.2f", this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
