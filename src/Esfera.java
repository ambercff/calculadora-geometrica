public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularAreaSuperficial(){
        return (4 * Math.PI) * (this.raio * this.raio);
    }

    public double calcularVolume() {
        return ((4 * Math.PI)/3) * (this.raio * this.raio) * this.raio;
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("A esfera tem área de %.2f e o perímetro de %.2f", this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
