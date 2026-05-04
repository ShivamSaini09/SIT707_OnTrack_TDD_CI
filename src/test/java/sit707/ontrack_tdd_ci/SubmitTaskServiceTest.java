package sit707.ontrack_tdd_ci;

import org.junit.Assert;
import org.junit.Test;

public class SubmitTaskServiceTest {

    @Test
    public void testSuccessfulTaskSubmission() {
        SubmitTaskService service = new SubmitTaskService();

        String result = service.submitTask("S101", "T1", "task1.pdf");

        Assert.assertEquals("Wrong message", result);
    }

    @Test
    public void testEmptyStudentId() {
        SubmitTaskService service = new SubmitTaskService();

        String result = service.submitTask("", "T1", "task1.pdf");

        Assert.assertEquals("Invalid student ID", result);
    }

    @Test
    public void testInvalidFileType() {
        SubmitTaskService service = new SubmitTaskService();

        String result = service.submitTask("S101", "T1", "task1.docx");

        Assert.assertEquals("Only PDF files are allowed", result);
    }
    
    @Test
    public void testEmptyTaskId() {
        SubmitTaskService service = new SubmitTaskService();

        String result = service.submitTask("S101", "", "task1.pdf");

        Assert.assertEquals("Invalid task ID", result);
    }

    @Test
    public void testEmptyFileName() {
        SubmitTaskService service = new SubmitTaskService();

        String result = service.submitTask("S101", "T1", "");

        Assert.assertEquals("File is required", result);
    }
}