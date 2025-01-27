package patient_managment;

//abstract class to represent patient
abstract class Patient {
    //Attribute
    private String patientId;
    private String name;
    private int age;

    // constructor to initialize patient
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        if (patientId != null) {
            this.patientId = patientId;
        } else {
            System.out.println("Patient ID cannot be null");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Name cannot be null");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 0");
        }
    }
    // Abstract method for bill calculation
    public abstract double calculateBill();

    //method to display patient details
    public void getPatientDetails() {
        System.out.println("\nPatient ID - " + patientId +
               "\nName - " + name +
               "\nAge - " + age);
    }
}