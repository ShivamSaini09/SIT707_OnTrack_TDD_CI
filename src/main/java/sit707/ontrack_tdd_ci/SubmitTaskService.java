package sit707.ontrack_tdd_ci;

public class SubmitTaskService {

    public String submitTask(String studentId, String taskId, String fileName) {

        if (studentId == null || studentId.trim().isEmpty()) {
            return "Invalid student ID";
        }

        if (taskId == null || taskId.trim().isEmpty()) {
            return "Invalid task ID";
        }

        if (fileName == null || fileName.trim().isEmpty()) {
            return "File is required";
        }

        if (!fileName.toLowerCase().endsWith(".pdf")) {
            return "Only PDF files are allowed";
        }

        return "Task submitted successfully";
    }
}