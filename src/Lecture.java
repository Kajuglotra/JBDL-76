public class Lecture {

    public Lecture(String  mentorName, String password){
        this.mentorName =mentorName;
        this.password=password;
    }
    public Lecture(){
    }
    private String classTitle; // -> instance variable
    private String mentorName;
    private String status;
    private String classTime;
    String password; // default

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        // system
        this.mentorName = mentorName;
    }

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public String getClassTime() {
        return classTime;
    }

//    public void setClassTime(String classTime) {
//        this.classTime = classTime;
//    }
    public static int noOfS = 50;
    public static String noOfStudents = new String("fifty");
    public static String noOfStudent = "fifty";//
    // you can access it via class Name, object

    private String getData(){
        return "dummy";
    }

    public String getDataWrapper(){
        return getData();
    }
}
