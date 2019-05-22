package za.co.vodacom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import za.co.vodacom.model.Person;

@RestController
@RequestMapping(path="/mpesa")
public class PaymentController {
	
	@GetMapping("/greetings")
	public List<Person> sayHello(@RequestParam(name = "surname") String surname){
		List<Person> greetings = new ArrayList<>();
		greetings.add(new Person("Kebila", 12));
		greetings.add(new Person("Fofe", 20));
		System.out.println("........"+surname);
		return greetings;
	}
	
	@GetMapping("/nothing")
	public void display() {
		System.out.println("it prints in the console");
	}

}
