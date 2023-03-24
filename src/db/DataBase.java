package db;

import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    List<Group>groups= new ArrayList<>();
    List<Student>students=new ArrayList<>();



    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "groups=" + groups +
                " students=" + students +
                '}';
    }
}
