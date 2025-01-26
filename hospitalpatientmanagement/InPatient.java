package hospitalpatientmanagement;
import java.util.List;
import java.util.ArrayList;

class InPatient extends Patient implements MedicalRecord
{
    private List<String> records = new ArrayList<>();
    private double dailyRate;
    private int numberOfDays;

    public InPatient(String patientId, String name, int age, double dailyRate, int numberOfDays)
    {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill()
    {
        return dailyRate * numberOfDays;
    }

    @Override
    public void addRecord(String record)
    {
        records.add(record);
    }

    @Override
    public List<String> viewRecords()
    {
        return records;
    }
}
