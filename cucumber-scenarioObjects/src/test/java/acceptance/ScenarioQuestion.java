package acceptance;

public class ScenarioQuestion {
	private String question;
	private int questionOrder;
	private String group;
	private String type;
	private String value;

	public ScenarioQuestion(String question, String group, int questionOrder) {
		this.question = question;
		this.questionOrder = questionOrder;
		this.group = group;
	}
	
	public ScenarioQuestion(String question) {
		this.question = question;
	}
	
	public ScenarioQuestion(String question, String value) {
		this.question = question;
		this.value = value;
	}
	public ScenarioQuestion(String question,String type, String value) {
		this(question,value);
		this.type = type;
	}

	public ScenarioQuestion(String question, String type, int questionOrder, String group, String value) {
		super();
		this.question = question;
		this.type = type;
		this.questionOrder = questionOrder;
		this.group = group;
		this.value = value;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getQuestionOrder() {
		return questionOrder;
	}

	public void setQuestionOrder(int questionOrder) {
		this.questionOrder = questionOrder;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getType() {
		return type;
	}

	public void setType(String questionType) {
		this.type = questionType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
}
