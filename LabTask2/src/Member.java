public class Member {
    private static int totalMembers = 0;
    private int memberId;
    private String name;
    private int maxBook = 3;

    public Member(String name ){
        totalMembers++;
        this.memberId = totalMembers;
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Name cannot be blank. Setting name to Guest.");
            this.name = "Guest";
        } else {
            this.name = name;
        }
    }

    public static int getTotalMembers() {
        return totalMembers;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxBook() {
        return maxBook;
    }

    public void setMaxBook(int maxBook) {
        this.maxBook = maxBook;
    }

    public void describe (){
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Book Limit: " + maxBook);
    }
}
