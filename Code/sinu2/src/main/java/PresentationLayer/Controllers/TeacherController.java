package PresentationLayer.Controllers;

import PersistanceLayer.Entities.Teacher;
import PresentationLayer.Views.TeacherViews.TeacherView;

public class TeacherController {

    private Teacher teacher;
    private TeacherView teacherView;

    public TeacherController(Teacher teacher) {
        this.teacher = teacher;
        this.teacherView = new TeacherView();
    }
}
