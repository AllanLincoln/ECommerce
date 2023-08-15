public class Boleto implements PaymentMethod {
    private String Boleto;

    public Boleto(String boleto) {
        this.Boleto = boleto;
    }

    public Boleto() {

    }

    @Override
    public void efetuarPagamento(double valor) {

    }

    @Override
    public boolean processPayment(double amount) {
        // Implemente a lógica de processamento do pagamento via Boleto
        // Gere o boleto, registre a transação, etc.
        System.out.println("Pagamento via Boleto processado com sucesso.");
        return true;
    }
}
