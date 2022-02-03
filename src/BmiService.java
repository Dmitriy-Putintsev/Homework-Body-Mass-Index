public class BmiService {
    public double weight;
    public double height;

    public double calculate() {
        double BMI = weight / (height * height);
        return BMI;
    }


}
