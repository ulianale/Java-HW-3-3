public class CreditPaymentService {

    public int calculate(int credit, int year, double rate) {
        double i = rate / (12 * 100); // месячная ставка в долях
        double k = i + i / (Math.pow((1 + i), (12 * year)) - 1); // коэффициент аннуитета
        double payment = credit * k; // месячный платеж без округления
        return (int) payment;
    }
}
