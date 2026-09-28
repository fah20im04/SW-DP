public class StudentMember extends Member {
    private int semester ;
    public StudentMember(String name,int semester){
        super(name);
        this.semester = semester;
    }
    @Override
    public int getMaxBook(){
        if(semester >= 1 && semester <= 4){
            return 2;
        }
        else if(semester >= 5 && semester <= 8){
            return 4;
        }
        return 3;
    }
    @Override
    public void describe(){
        System.out.println("Member ID: " + getMemberId());
        System.out.println("Name: " + getName());
        System.out.println("Semester: " + semester);
        System.out.println("Book Limit: " + getMaxBook());
    }
    public int getSemester(){
        return semester;
    }
}
