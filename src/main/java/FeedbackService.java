public class FeedbackService {

    public boolean submitFeedback(Feedback feedback) {

        // Basic validation
        if (feedback.getName() == null || feedback.getName().isEmpty()) {
            return false;
        }

        if (feedback.getEmail() == null || !feedback.getEmail().contains("@")) {
            return false;
        }

        if (feedback.getMessage() == null || feedback.getMessage().length() < 5) {
            return false;
        }

        // Simulate saving (later you can connect DB)
        System.out.println("Feedback received from: " + feedback.getName());

        return true;
    }
}