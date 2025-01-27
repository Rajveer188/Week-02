package patient_managment;

public class HospitalMain {
    public static void main(String[] args) {

        //creat patients object
        Patient inPatient = new InPatient("P0088", "Rajveer", 20, 2500, 4);
        Patient outPatient = new OutPatient("P0034", "Darshan Yadav", 25, 500);

        //add medical records
        ((MedicalRecord) inPatient).addRecord("Admitted for operation");
        ((MedicalRecord) inPatient).addRecord("operation completed successfully");
        ((MedicalRecord) outPatient).addRecord("Consulted for cough");
        ((MedicalRecord) outPatient).addRecord("Prescribed medication");

        //add both object to array
        Patient[] patients = {inPatient, outPatient};
        //display patient details and bills
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount - " + patient.calculateBill());
            ((MedicalRecord) patient).viewRecords();
        }
    }
}
