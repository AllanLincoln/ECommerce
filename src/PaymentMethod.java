public interface PaymentMethod {

    void efetuarPagamento(double valor);

    boolean processPayment(double amount);
}
