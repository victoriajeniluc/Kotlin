package question4;

public class GymMembershipPromotion extends GymMembership{

    public GymMembershipPromotion(String name1, double duration1, double monthlyfee1) {
        super(name1, duration1, monthlyfee1);
    }

    @Override
    public double getTotalCost() {
        double cost = super.getTotalCost();
        return cost - (cost * getPromoDiscount());
    }

    //Calculate the discount
    //I have used charAt(int) method of the String class, you may use startsWith(String)
    //method of String class as well.
    private double getPromoDiscount() {
        double discount = 0.0;
        String name = super.getMemberName();
        //First check if name contains something.
        if(name != null && name.trim().length() > 0) {
            name = name.toUpperCase(); //Convert all the characters to upper case
            char ch = name.charAt(0); //Extract first character of name
            switch (ch) {
                //if name starts with vowel, then give 50% discount
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    discount = 0.5;
                    break;
                //if name doesn't start with vowel, then give 20% discount
                default:
                    discount = 0.2;
            }
        }
        return discount;
    }

    @Override
    public String toString() {
        String det = super.toString() + ", " + this.getPromoDiscount(); //Include discount percentage over here
        return det;
    }
}
