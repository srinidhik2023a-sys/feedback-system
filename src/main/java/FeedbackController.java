import java.util.Scanner;

public class FeedbackController {

    public static void main(String[] args) {

        FeedbackService service = new FeedbackService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Message:");
        String message = sc.nextLine();

        Feedback fb = new Feedback(name, email, message);

        try {
            service.submitFeedback(fb);
            System.out.println("Feedback submitted successfully!");
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}