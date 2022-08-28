public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BMI = service.calculate(65, 185);
        System.out.println("Ваш индекс массы тела: ");
    }
}