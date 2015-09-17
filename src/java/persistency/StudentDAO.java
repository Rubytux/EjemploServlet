/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistency;

import identities.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rubytux
 */
// Data Access Object
public class StudentDAO {
    
    public List<Student> listStudents(){
        List<Student> result = new ArrayList<Student>();
        
        Student student  = new Student();
        student.setNombres("Hernán");
        student.setApellidos("Ramírez");
        
        result.add(student);
        
        return result;
    }
}
