public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mas = 70;
        double rost = 1.7;
        int bmi = (int)service.calculate(mas, rost);
        System.out.println("Ваш индекс массы тела -  " + bmi);
    }
}