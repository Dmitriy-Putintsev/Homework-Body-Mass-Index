public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        service.height = 1.86;
        service.weight = 120;

        float BMI = (float) service.calculate();

        System.out.println(" Ваш ИМТ составляет: " + BMI + " кг/м²");

    }
}
