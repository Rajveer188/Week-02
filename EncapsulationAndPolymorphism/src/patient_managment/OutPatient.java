package patient_managment;

//class to represent out patient
class OutPatient extends Patient implements MedicalRecord {
    //Attribute
    private double consultationFee;
    private String medicalHistory;

    // constructor to initialize out patient
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    //override and implement abstract methods
    @Override
    public double calculateBill() {
        return consultationFee;
    }
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }
    @Override
    public void viewRecords() {
        System.out.println("Medical History - \n" + medicalHistory);
    }
}
