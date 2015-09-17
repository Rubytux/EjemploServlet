/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import identities.Student;
import java.util.List;
import persistency.StudentDAO;

/**
 *
 * @author rubytux
 */
public class StudentBusiness {
    
    StudentDAO dao = new StudentDAO();
    public List<Student> listStudents(){
        return dao.listStudents();
    }
}
