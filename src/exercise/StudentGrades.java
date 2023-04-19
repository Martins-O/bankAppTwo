package exercise;

public class StudentGrades {

    public static String getStudentScore(int[] students, int length) {
        students = new int [length];
//        for (int i = 0; i < students.length; i++){

        for (int student : students) {
            if (students[student] > 70){
                return "A";
            } else if (students[student] > 50 && students[student] < 70) {
                return "B";
            } else if (students[student] > 30 && students[student] < 50) {
                return "C";
            }else
                return "F";
        }

        return "Olodo";
    }

    public static void main(String[] args) {
        int[] start = {34,66,78,90};
        int len = 4;
        System.out.println(getStudentScore(start, len));
    }
}
