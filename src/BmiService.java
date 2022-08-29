public class BmiService {

    public int calculate(int mass, int high) {
        int BMI = mass / (high * high);
        return BMI;
    }
}
