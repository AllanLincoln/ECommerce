public class CartaoCredito implements PaymentMethod {
    private int installmentCount;

    public CartaoCredito(int installmentCount) {
        this.installmentCount = installmentCount;
    }

    public CartaoCredito() {

    }

    @Override
    public void efetuarPagamento(double valor) {

    }

    @Override
    public boolean processPayment(double amount) {
        // Implemente a lógica de processamento do pagamento via Cartão de Crédito
        // Verifique o limite, divida em parcelas, registre a transação, etc.
        System.out.println("Pagamento via Cartão de Crédito processado com sucesso.");
        return true;
    }
}
