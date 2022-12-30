package fact.it.game_service.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stationID;
    private String education;
    private String faculty;
    private String information;
    @OneToMany(mappedBy = "station")
    private List<Question> questions = new ArrayList<>();



    public Station() {
        //make new game
        }

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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> question) {
        this.questions = question;
    }

}


