public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BMI = service.calculate(70, 187);
        System.out.println("Ваш индекс массы тела: " + BMI);
    }
}