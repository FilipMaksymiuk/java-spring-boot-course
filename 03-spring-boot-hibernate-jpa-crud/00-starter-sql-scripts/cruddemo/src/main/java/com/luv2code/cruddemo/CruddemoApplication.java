package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			//Use one of the function below to create a student/students

			createMultipleStudents(studentDAO);
			//createStudent(studentDAO);
			//readStudent(studentDAO);
			//querYForStudents(studentDAO);
			//querYForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudent(studentDAO);

		};
	}

	private void deleteAllStudent(StudentDAO studentDAO){
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count" + numRowsDeleted);
	}
	private void deleteStudent(StudentDAO studentDAO){
		//retirev student based on the id: primary key
		int studentId =6;
		System.out.println("Deleting student with id: " + studentId);
		studentDAO.delete(studentId);


	}

	private void updateStudent(StudentDAO studentDAO){
		//retirev student based on the id: primary key
		int studentId =1;
		System.out.println("Getting student with id" + studentId);
		Student myStudent = studentDAO.findById(studentId);
		//change first name to scooby
		System.out.println("Updateing studnet...");
		myStudent.setFirstName("Scooby");
		//update the student
		studentDAO.update(myStudent);
		//display the updated student
		System.out.println("Updated student: " + myStudent);
	}
	private void querYForStudentsByLastName(StudentDAO studentDAO){
		//get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Doe");
		//display list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void querYForStudents(StudentDAO studentDAO){
		//get a list of students
		List<Student> theStudents = studentDAO.findAll();
		//display list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}

	}



	private void createMultipleStudents(StudentDAO studentDAO){
		//create the student object
		System.out.println("Crating 3 student objects ...");
		Student tempStudent1 = new Student("Kamila","Kaluzownik","Nick@luv2code.com");
		Student tempStudent2 = new Student("Mike","Sin","Mike@luv2code.com");
		Student tempStudent3 = new Student("Saul","Mary","Saul@luv2code.com");

		//save the student object
		System.out.println("Saving the Students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		//dispaly id of the saved student
		System.out.println("Saved student Genrated id: " + tempStudent1.getId());
		System.out.println("Saved student Genrated id: " + tempStudent2.getId());
		System.out.println("Saved student Genrated id: " + tempStudent3.getId());

	}

	private void createStudent(StudentDAO studentDAO){
		//create the student object
		System.out.println("Crating new student object ...");
		Student tempStudent = new Student("Paul","DOE","paul@luv2code.com");
		//save the student object
		System.out.println("Saving the Student ...");
		studentDAO.save(tempStudent);
		//dispaly id of the saved student
		System.out.println("Saved student Genrated id: " + tempStudent.getId());

	}

	private void readStudent(StudentDAO studentDAO){
		//create a student object
		System.out.println("Creating a student");
		Student tempStudent = new Student("Mark","Evans","Mark@luv2code.com");
		//save the student
		System.out.println("Saving the Student ...");
		studentDAO.save(tempStudent);
		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved the student" + theId);
		//retrieve student based on the id: primary key
		System.out.println("Retrieving srtudent with id: " + theId);
		Student myStudent = studentDAO.findById(theId);
		//display student
		System.out.println("Found the student" + myStudent);

	}




}
