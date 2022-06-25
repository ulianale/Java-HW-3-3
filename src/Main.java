public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment1 = service.calculate(1000_000, 1, 9.99);
        int payment2 = service.calculate(1000_000, 2, 9.99);
        int payment3 = service.calculate(1000_000, 3, 9.99);

        System.out.println("Ежемесячный платеж составляет: " + payment1);
        System.out.println("Ежемесячный платеж составляет: " + payment2);
        System.out.println("Ежемесячный платеж составляет: " + payment3);

    }
}
