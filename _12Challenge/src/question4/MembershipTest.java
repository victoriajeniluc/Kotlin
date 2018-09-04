package question4;

public class MembershipTest {
    public static void main(String[] args) {
        GymMembershipPromotion obj1 = new GymMembershipPromotion("neha", 6, 3000);
        System.out.println(obj1);
        System.out.println(obj1.getTotalCost());

        GymMembershipPromotion obj2 = new GymMembershipPromotion("iru", 6, 3000);
        System.out.println(obj2);
        System.out.println(obj2.getTotalCost());
    }
}
