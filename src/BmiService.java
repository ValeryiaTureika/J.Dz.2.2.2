public class BmiService {
    public int calculate(int bodyWeightInKg, int heightInCentimetersInCm, int transferToM) {
        int bodyMassIndex = (bodyWeightInKg * transferToM) / (heightInCentimetersInCm * heightInCentimetersInCm);
        return bodyMassIndex;
    }
}
