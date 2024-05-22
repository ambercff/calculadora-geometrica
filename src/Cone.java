public class Cone {
    double raio, altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularAreaSuperficial(){
        return (Math.PI * this.raio) * (Math.sqrt(this.altura * this.altura + this.raio * this.raio));
    }

    public double calcularVolume(){
        return  (((Math.PI * (this.raio * this.raio))) * this.altura) / 3;
    }

    public String retornarResumo(double valor) {
        String resumo = String.format("O cone tem área de %.2f e o perímetro de %.2f", this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
