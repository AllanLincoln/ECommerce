public class FreteCorreios implements CalculadoraFrete {
    public double calcular(double peso, double distancia) {
        double valorInicial;
        double valorPorKm;

        if (peso <= 2) {
            valorInicial = 10.0;
            valorPorKm = 1.0;
        } else if (peso <= 10) {
            valorInicial = 10.0;
            valorPorKm = 2.0;
        } else {
            valorInicial = 10.0;
            valorPorKm = 5.0;
        }

        double valorFrete = valorInicial + valorPorKm * distancia;


        return valorFrete;


    }
}