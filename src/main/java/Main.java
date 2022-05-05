public class Main {
    public static void main(String[] ards) {
        BonusService service = new BonusService();

        long bonus1 = service.calculate(1000_60, true);
        System.out.println(bonus1);

        long bonus2 = service.calculate(1_000_000_60, true);
        System.out.println(bonus2);

        long bonus3 = service.calculate(1000_60, false);
        System.out.println(bonus3);

        long bonus4 = service.calculate(1_000_000_60, false);
        System.out.println(bonus4);


    }
}
