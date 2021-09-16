public class BmiService {
    public int calculate(int BodyWeightInKg, int HeightInCentimeters, int TransferToKg) {
        int BodyMassIndex = (BodyWeightInKg *TransferToKg) / (HeightInCentimeters * HeightInCentimeters) ;
        return BodyMassIndex;
    }
}
