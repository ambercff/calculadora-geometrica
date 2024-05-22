public class Piramide {
    double arestaBase, apotema, altura;

    public Piramide(double arestaBase, double apotema, double altura) {
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.altura = altura;
    }

    public double calcularAreaSuperficial(){
        return ((2 * this.arestaBase) * this.apotema) + (this.arestaBase * this.arestaBase);
    }

    public double calcularVolume(){
        return ((this.arestaBase * this.arestaBase) * this.altura) / 3;
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("A pirâmide tem área de %.2f e o perímetro de %.2f", this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
