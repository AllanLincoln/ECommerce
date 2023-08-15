public class Pix implements PaymentMethod {
    private String Pix;

    public Pix(String pix) {
        this.Pix = pix;
    }

    public Pix() {

    }

    @Override
    public void efetuarPagamento(double valor) {

    }

    @Override
    public boolean processPayment(double amount) {
        // Implemente a lógica de processamento do pagamento via Pix
        // Verifique a disponibilidade de fundos, registre a transação, etc.
        System.out.println("Pagamento via Pix processado com sucesso.");
        return true;
    }
}
