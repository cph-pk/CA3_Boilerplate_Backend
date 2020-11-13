package entities;

import java.io.Serializable;



public class Trivia implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String id;
    private String answer;
    private String question;
    private String value;
    private String airdate;
   

    public Trivia() {
    }

    public Trivia(String answer, String question, String value, String airdate) {
        this.answer = answer;
        this.question = question;
        this.value = value;
        this.airdate = airdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAirdate() {
        return airdate;
    }

    public void setAirdate(String airdate) {
        this.airdate = airdate;
    }

   
}
