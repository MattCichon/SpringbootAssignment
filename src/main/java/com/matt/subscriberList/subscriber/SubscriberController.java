package com.matt.subscriberList.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubscriberController {

	@Autowired
	private SubscriberRepository subscriberRepository;

	@GetMapping(value = "/")
	public String index(Subscriber subscriber) {
		return "subscriber/index";
	}

	@GetMapping(value = "/index")
	public String home(Subscriber subscriber) {
		return "subscriber/index";
	}

	@GetMapping(value = "/BurgerTime")
	public String BurgerTime() {
		return "subscriber/BurgerTime";
	}

	@GetMapping(value = "/Sides")
	public String Sides() {
		return "subscriber/Sides";
	}

	@GetMapping(value = "/Combos")
	public String Combos() {
		return "subscriber/Combos";
	}

	@GetMapping(value = "/Order")
	public String Order(Subscriber subscriber) {
		return "subscriber/Order";
	}

	@GetMapping(value = "/signUp")
	public String signUp(Subscriber subscriber) {
		return "subscriber/signUp";
	}

	@GetMapping(value = "/Privacy")
	public String Privacy(Subscriber subscriber) {
		return "subscriber/Privacy";
	}

	@GetMapping(value = "/Contact")
	public String Contact(Subscriber subscriber) {
		return "subscriber/Contact";
	}

	@GetMapping(value = "/Support")
	public String Support(Subscriber subscriber) {
		return "subscriber/Support";
	}

	@GetMapping(value = "/Quiz")
	public String Quiz(Subscriber subscriber) {
		return "subscriber/Quiz";
	}

	@GetMapping(value = "/QuizResults")
	public String QuizResults(Subscriber subscriber) {
		return "subscriber/QuizResults";
	}

	@GetMapping(value = "/OrderConfirmation")
	public String OrderConfirmation(Subscriber subscriber) {
		return "subscriber/orderConfirmation";
	}

	@GetMapping(value = "/Saucer.exe")
	public String Saucer() {
		return "subscriber/Saucer.exe";
	}

	private Subscriber subscriber;

	@PostMapping(value = "/")
	public String addNewSubscriber(Subscriber subscriber, Model model) {
		subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
				subscriber.getUserEmail(), subscriber.getUserName(), subscriber.getSignedUp()));
		model.addAttribute("firstName", subscriber.getFirstName());
		model.addAttribute("lastName", subscriber.getLastName());
		model.addAttribute("userEmail", subscriber.getUserEmail());
		model.addAttribute("userName", subscriber.getUserName());
		return "subscriber/result";
	}

	@PostMapping(value = "/Quiz")
	public String Quiz(Subscriber quiz, Model model) {
		QuizRepository.save(new Quiz(quiz.getAnswer1(), quiz.getAnswer2(), quiz.getAnswer3(), quiz.getAnswer4(),
				quiz.getAnswer5(), quiz.getAnswer6(), quiz.getAnswer7(), quiz.getAnswer8(), quiz.getAnswer9(),
				quiz.getAnswer10()));

		model.addAttribute("answer1", quiz.getAnswer1());
		model.addAttribute("answer2", quiz.getAnswer2());
		model.addAttribute("answer3", quiz.getAnswer3());
		model.addAttribute("answer4", quiz.getAnswer4());
		model.addAttribute("answer5", quiz.getAnswer5());
		model.addAttribute("answer6", quiz.getAnswer6());
		model.addAttribute("answer7", quiz.getAnswer7());
		model.addAttribute("answer8", quiz.getAnswer8());
		model.addAttribute("answer9", quiz.getAnswer9());
		model.addAttribute("answer10", quiz.getAnswer10());
		return "subscriber/QuizResults";
	}

	@PostMapping(value = "Order")
	public String Order(Subscriber subscriber, Model model) {
		subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
				subscriber.getUserEmail(), subscriber.getUserName(), subscriber.getSignedUp()));
		model.addAttribute("firstName", subscriber.getFirstName());
		model.addAttribute("lastName", subscriber.getLastName());
		model.addAttribute("userEmail", subscriber.getUserEmail());
		model.addAttribute("userName", subscriber.getUserName());
		return "subscriber/OrderConfirmation";
	}
}
