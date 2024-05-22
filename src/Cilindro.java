public class Cilindro {
    double altura, raio;

    public Cilindro(double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }

    public double calcularAreaSuperficial(){
        return (2 * Math.PI) * (this.raio * this.altura) + ((2 * Math.PI) * (this.raio * this.raio));
    }

    public double calcularVolume(){
        return ((Math.PI * this.altura) * (this.raio * this.raio));
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O cilindro tem área de %.2f e o perímetro de %.2f", this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }


}
