package patient_managment;

//class to represent in patient
class InPatient extends Patient implements MedicalRecord{
    //Attribute
    private double roomChargesPerDay;
    private int numberOfDays;
    private String medicalHistory;

    // constructor to initialize in patient
    public InPatient(String patientId, String name, int age, double roomChargesPerDay, int numberOfDays) {
        super(patientId, name, age);
        this.roomChargesPerDay = roomChargesPerDay;
        this.numberOfDays = numberOfDays;
        this.medicalHistory = "";
    }

    //override and implement abstract methods
    @Override
    public double calculateBill() {
        double bill = roomChargesPerDay * numberOfDays;
        return bill;
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

