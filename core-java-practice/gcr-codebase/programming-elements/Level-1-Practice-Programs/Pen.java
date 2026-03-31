public class Pen {
    public static void main(String[] args) {
        int pens = 14;
        int student = 3;
        int pensPerStu = pens/student;
        int remaining = pens%student;
        System.out.println("The Pen Per Student is "+pensPerStu+" and the remaining pen not distributed is "+remaining);
    }
}
