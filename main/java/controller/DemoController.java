package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String hello() {
		
		return "Hii, hello";
	}
	
	@GetMapping("/path/{number}")
	public String path(@PathVariable int number) {
		
		System.out.println("Path variable number is : "+ number);
		return "Path Variable value is : " + number;
	}
	
	@PostMapping("/param")
	public String studentEntity(@RequestParam int num)	{
		System.out.println("Param value is : "+ num);
		return "Parameter is : "+ num; 
	}
	
	@PostMapping("/studentBody")
	public Student studentBody(@RequestBody Student student) {
		System.out.println("Student Name is : "+ student.getSname());
		System.out.println("Student Name is : "+ student.getSid());
		System.out.println("Student Name is : "+ student.getAge());
		return student; 
	}
	
	@GetMapping("/studentHeader")
	public String studentHeader(@RequestHeader int number) { 
		return "Number is : "+ number;
	}
}