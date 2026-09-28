public class Main {

    public static void main(String[] args) {

        Member member = new Member("Fahim");

        PremiumMember premium = new PremiumMember("Ayon", 2500);

        StudentMember student = new StudentMember("Rahim", 6);

        Member guest = new Member("");


        System.out.println("===== Normal Member =====");
        member.describe();
        System.out.println("Maximum Books: " + member.getMaxBook());


        System.out.println("\n===== Premium Member =====");
        premium.describe();
        System.out.println("Maximum Books: " + premium.getMaxBook());


        System.out.println("\n===== Student Member =====");
        student.describe();
        System.out.println("Maximum Books: " + student.getMaxBook());


        System.out.println("\n===== Guest Member =====");
        guest.describe();
        System.out.println("Maximum Books: " + guest.getMaxBook());
    }
}