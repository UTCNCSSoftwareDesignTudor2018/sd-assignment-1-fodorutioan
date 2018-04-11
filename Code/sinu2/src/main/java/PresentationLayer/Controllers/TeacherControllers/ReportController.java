package PresentationLayer.Controllers.TeacherControllers;
import PersistanceLayer.Entities.Student;
import PersistanceLayer.Entities.Teacher;
import PresentationLayer.Views.TeacherViews.ReportView;

public class ReportController {
    private ReportView ReportView;

    public ReportController(Student student, Teacher teacher) {
        ReportView = new ReportView();
    }
}
