package fact.it.game_service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Question implements Serializable {
    @Id
           @SequenceGenerator(name = "question_seq", 
        sequenceName = "question_sequence", 
        initialValue = 2000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_seq")
    private int questionID;
    private String question;
    private String correctanswer;
    private String fOne;
    private String fTwo;
    private String fThree;
    @ManyToOne
    @JsonBackReference
    private Station station;

    public Question() {
    }
    public int getQuestionID() {
        return questionID;
    }
    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getCorrectanswer() {
        return correctanswer;
    }
    public void setCorrectanswer(String correctanswer) {
        this.correctanswer = correctanswer;
    }
    public String getfOne() {
        return fOne;
    }
    public void setfOne(String fOne) {
        this.fOne = fOne;
    }
    public String getfTwo() {
        return fTwo;
    }
    public void setfTwo(String fTwo) {
        this.fTwo = fTwo;
    }
    public String getfThree() {
        return fThree;
    }
    public void setfThree(String fThree) {
        this.fThree = fThree;
    }
    public Station getStation() {
        return station;
    }
    public void setStation(Station station) {
        this.station = station;
    }



}
