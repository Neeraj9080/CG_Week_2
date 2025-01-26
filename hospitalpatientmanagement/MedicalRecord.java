package hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;
// Interface MedicalRecord
interface MedicalRecord
{
    void addRecord(String record);
    List<String> viewRecords();
}
