package scenario_based;

import java.util.HashMap;
import java.util.Stack;
import java.util.Scanner;
import java.util.Map;

class ExamSession {
    private Stack<Integer> navigationHistory;
    private HashMap<Integer, String> studentAnswers;
    private HashMap<Integer, String> correctAnswers;
    private int currentQuestionId;

    ExamSession() {
        navigationHistory = new Stack<>();
        studentAnswers = new HashMap<>();
        correctAnswers = new HashMap<>();
        currentQuestionId = 1;

        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "B");
        correctAnswers.put(4, "D");
        correctAnswers.put(5, "A");

        navigationHistory.push(currentQuestionId);
    }

    public void visitQuestion(int questionId) {
        if (questionId < 1 || questionId > 5) {
            System.out.println("Invalid Question ID. Exam has 5 questions.");
            return;
        }
        currentQuestionId = questionId;
        navigationHistory.push(currentQuestionId);
        System.out.println("Navigated to Question " + currentQuestionId);
    }

    public void goBack() {
        if (navigationHistory.size() <= 1) {
            System.out.println("Cannot go back. Start of exam.");
            return;
        }
        navigationHistory.pop(); 
        currentQuestionId = navigationHistory.peek();
        System.out.println("Back to Question " + currentQuestionId);
    }

    public void answerQuestion(String option) {
        studentAnswers.put(currentQuestionId, option.toUpperCase());
        System.out.println("Answer saved for Q" + currentQuestionId + ": " + option.toUpperCase());
    }

    public void displayCurrentState() {
        String ans = studentAnswers.getOrDefault(currentQuestionId, "Not Answered");
        System.out.println("Current Question: " + currentQuestionId);
        System.out.println("Status: " + ans);
    }

    public int calculateScore() {
        int score = 0;
        System.out.println("Final Results");
        
        for (Map.Entry<Integer, String> entry : correctAnswers.entrySet()) {
            int qId = entry.getKey();
            String correctOpt = entry.getValue();
            String studentOpt = studentAnswers.get(qId);
            System.out.print("Q" + qId + ": Correct [" + correctOpt + "] vs Your Answer [" + (studentOpt == null ? "-" : studentOpt) + "] ");
            if (studentOpt != null && studentOpt.equals(correctOpt)) {
                score += 10;
                System.out.println("-> (+10)");
            } else {
                System.out.println("-> (0)");
            }
        }
        return score;
    }
}

public class ExamProctor {
    public static void main(String[] args) {
        ExamSession session = new ExamSession();
        Scanner input = new Scanner(System.in);
        int choice, qId;
        String option;
        boolean examRunning = true;

        System.out.println("EXAM PROCTOR");
        System.out.println("(5 Questions total. Correct Answer = +10 points)");

        while (examRunning) {
            session.displayCurrentState();
            System.out.println("1. Go to Specific Question");
            System.out.println("2. Go Back (Previous Question)");
            System.out.println("3. Submit Answer for Current Question");
            System.out.println("4. Finish & Submit Exam");
            System.out.print("Enter choice: ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
            } else {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter Question ID (1-5): ");
                    if (input.hasNextInt()) {
                        qId = input.nextInt();
                        session.visitQuestion(qId);
                    } else {
                        input.nextLine();
                    }
                    break;
                case 2:
                    session.goBack();
                    break;
                case 3:
                    System.out.print("Enter Option (A/B/C/D): ");
                    option = input.nextLine();
                    session.answerQuestion(option);
                    break;
                case 4:
                    int finalScore = session.calculateScore();
                    System.out.println("TOTAL SCORE: " + finalScore + " / 50");
                    examRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        input.close();
    }
}