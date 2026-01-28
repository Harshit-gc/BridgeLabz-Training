package scenario_based;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int score;
    String district;

    Student(String name, int score, String district) {
        this.name = name;
        this.score = score;
        this.district = district;
    }

    @Override
    public String toString() {
        return "Score: " + score + " | Name: " + name + " (" + district + ")";
    }
}

class ResultProcessor {

    public ArrayList<Student> mergeSort(ArrayList<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        ArrayList<Student> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Student> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private ArrayList<Student> merge(ArrayList<Student> left, ArrayList<Student> right) {
        ArrayList<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).score >= right.get(j).score) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}

public class EduResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ResultProcessor processor = new ResultProcessor();
        ArrayList<Student> districtA = new ArrayList<>();
        ArrayList<Student> districtB = new ArrayList<>();
        
        System.out.println("EDU-RESULTS: STATE RANK GENERATOR");

        districtA.add(new Student("Alice", 85, "District A"));
        districtA.add(new Student("Bob", 92, "District A"));
        districtA.add(new Student("Charlie", 78, "District A"));

        districtB.add(new Student("David", 88, "District B"));
        districtB.add(new Student("Eve", 92, "District B")); 
        districtB.add(new Student("Frank", 75, "District B"));

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.addAll(districtA);
        allStudents.addAll(districtB);

        System.out.println("Combined (Unsorted) List");
        for (Student s : allStudents) {
            System.out.println(s);
        }

        ArrayList<Student> rankList = processor.mergeSort(allStudents);

        System.out.println("Final State-Wise Rank List (Sorted)");
        int rank = 1;
        for (Student s : rankList) {
            System.out.println("Rank " + rank++ + ": " + s);
        }
        
        input.close();
    }
}