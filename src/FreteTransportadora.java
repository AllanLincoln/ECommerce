public class FreteTransportadora {
    public static double calcularFreteLanLanTransportes(double peso, double distancia) {
        double valorInicial;
        double valorPorKm;

        if (peso <= 2){
            valorInicial = 20.0;
            valorPorKm = 1.0;
        } else if (peso <= 10) {
            valorInicial = 20.0;
            valorPorKm = 2.0;
        }
        else {
            valorInicial = 20.0;
            valorPorKm = 5.0;
        }

        double valorFrete = valorInicial + valorPorKm * distancia;

        // Aplicar desconto por distância
        if (distancia > 100) {
            valorFrete *= 0.7; // Desconto de 30% para longa distância
        }
        else if (distancia >= 50 && distancia <= 100) {
            valorFrete *= 0.75; // Desconto de 25% para média distância
        }

        return valorFrete;


    }

}

