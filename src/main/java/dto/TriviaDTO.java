package dto;

import entities.Trivia;


public class TriviaDTO {
    private String answer;
    private String question;
  
    public TriviaDTO() {
    }

    public TriviaDTO(Trivia trivia) {
        this.answer = trivia.getAnswer();
        this.question = trivia.getQuestion();
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

}
