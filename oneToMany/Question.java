package oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private String question;
	private String lavel;
	@OneToMany(mappedBy="question",cascade=CascadeType.ALL)
	private List<Answer> answer;
	public Question() {
		
	}
	public Question(String question, String lavel) {
		super();
		this.question = question;
		this.lavel = lavel;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getLavel() {
		return lavel;
	}
	public void setLavel(String lavel) {
		this.lavel = lavel;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
	
}
