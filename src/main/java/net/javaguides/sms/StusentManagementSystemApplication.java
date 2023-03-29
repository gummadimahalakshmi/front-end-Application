package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StusentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StusentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//Student student1 =new Student("ramesh","Fadatare","ramesh@gmail.com");
		//studentRepository.save(student1);
		

		//Student student2 =new Student("sanjay","jadhav","sanjay@gmail.com");
		//studentRepository.save(student2);
		
		//Student student3 =new Student("tony","stark","tony@gmail.com");
		//studentRepository.save(student3);
		
	}

}
