package fact.it.game_service.model;

import org.springframework.lang.Nullable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class GameDTO {
    //stations
    private int stationID;
    private String education;
    private String faculty;
    private String information;
    //questions
    private int questionID;
    private String question;
    private String correctanswer;
    private String fOne;
    private String fTwo;
    private String fThree;

    //Interest
    private int interestID;
    private String interestname;


    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
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

    public int getInterestID() {
        return interestID;
    }

    public void setInterestID(int interestID) {
        this.interestID = interestID;
    }

    public String getInterestname() {
        return interestname;
    }

    public void setInterestname(String interestname) {
        this.interestname = interestname;
    }
}

