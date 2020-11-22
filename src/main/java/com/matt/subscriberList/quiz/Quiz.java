package com.matt.subscriberList.quiz;

public class Quiz {

	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String answer5;
	private String answer6;
	private String answer7;
	private String answer8;
	private String answer9;
	private String answer10;

	public Quiz() {

	}

	public Quiz(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6,
			String answer7, String answer8, String answer9, String answer10) {
		super();
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.answer6 = answer6;
		this.answer7 = answer7;
		this.answer8 = answer8;
		this.answer9 = answer9;
		this.answer10 = answer10;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		if (answer1.contains("a"))
			this.answer1 = "Kaiser roll";

		if (answer1.contains("e"))
			this.answer1 = "Texas Toast";

		if (answer1.contains("i"))
			this.answer1 = "Two grilled cheese sandwiches for buns";

		if (answer1.contains("o"))
			this.answer1 = "Two quesadillas for buns";

		if (answer1.contains("u"))
			this.answer1 = "Sub roll";

		if (answer1.contains("y"))
			this.answer1 = "Two slices of pizza for buns";
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		if (answer3.contains("a"))
			this.answer3 = "American cheese";

		if (answer3.contains("e"))
			this.answer3 = "Wensleydale cheese";

		if (answer3.contains("i"))
			this.answer3 = "Limburger cheese";

		if (answer3.contains("o"))
			this.answer3 = "Double creme brie";

		if (answer3.contains("u"))
			this.answer3 = "Cheez Whiz ";

		if (answer3.contains("y"))
			this.answer3 = "Fried mozzarella sticks";
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		if (answer4.contains("a"))
			this.answer4 = "Nachos on top";

		if (answer4.contains("e"))
			this.answer4 = "French fries piled on";

		if (answer4.contains("i"))
			this.answer4 = "Lettuce, tomato, onion, and pickle";

		if (answer4.contains("o"))
			this.answer4 = "Another hamburger";

		if (answer4.contains("u"))
			this.answer4 = "A heap of coleslaw ";

		if (answer4.contains("y"))
			this.answer4 = "A Giant onion ring";
	}

	public String getAnswer5() {
		return answer5;
	}

	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}

	public String getAnswer6() {
		return answer6;
	}

	public void setAnswer6(String answer6) {
		this.answer6 = answer6;
	}

	public String getAnswer7() {
		return answer7;
	}

	public void setAnswer7(String answer7) {
		this.answer7 = answer7;
	}

	public String getAnswer8() {
		return answer8;
	}

	public void setAnswer8(String answer8) {
		this.answer8 = answer8;
	}

	public String getAnswer9() {
		return answer9;
	}

	public void setAnswer9(String answer9) {
		this.answer9 = answer9;
	}

	public String getAnswer10() {
		return answer10;
	}

	public void setAnswer10(String answer10) {
		this.answer10 = answer10;
	}

	@Override
	public String toString() {
		return "Quiz [answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4
				+ ", answer5=" + answer5 + ", answer6=" + answer6 + ", answer7=" + answer7 + ", answer8=" + answer8
				+ ", answer9=" + answer9 + ", answer10=" + answer10 + "]";
	}

}
