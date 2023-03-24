import db.DataBase;
import enam.Gender;
import model.Group;
import model.Student;
import service.impl.GroupServiceImpl;
import service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("   Aizat",20, Gender.FEMALE);
        Group group = new Group(1,"PeakSoft","ItAcademy",2020);
        StudentServiceImpl studentService=new StudentServiceImpl();
        GroupServiceImpl groupService=new GroupServiceImpl();
        System.out.println(groupService.addNewGroup(group));
       System.out.println(groupService.getGroupById(1));
        System.out.println(groupService.getGroupById(1333));

    }
}
