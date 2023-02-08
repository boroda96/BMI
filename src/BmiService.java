public class BmiService {
    public double calculate(double mas, double rost) {

        double result = mas / (rost * rost);
        return result;

    }
}
