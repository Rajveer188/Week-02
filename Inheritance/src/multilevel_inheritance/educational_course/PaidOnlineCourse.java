package multilevel_inheritance.educational_course;

//class that extends online course
public class PaidOnlineCourse extends OnlineCourse{
    //Attribute
    private double fee;
    private float discount;

    //constructor to initialize paid online course details
    public PaidOnlineCourse(String courseName, int duration, String platform, String isRecorded, double fee, float discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    //method to calculate discounted fee
    public double calculateDiscountFee(double fee, double discount) {
        return fee - (fee * discount/ 100);
    }
    //method to display online course details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("fee - " + fee +
                "discount - " + discount + "%" +
                "\nfee after discount - " + calculateDiscountFee(fee, discount));
    }

}
