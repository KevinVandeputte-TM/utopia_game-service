package fact.it.game_service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Station {
    


    
    @Id
        @SequenceGenerator(name = "station_seq", 
        sequenceName = "station_sequence", 
        initialValue = 1000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "station_seq")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int stationID;
    private String education;
    private String faculty;
    private String information;
    @OneToMany(mappedBy = "station", cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "station_interest")
    @JsonBackReference
    private List<Interest> interests = new ArrayList<>();

    /*CONSTRUCTOR*/
    public Station() {
        //make new game
    }

    /* GETTER AND SETTERS*/
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

    public List<Interest> getInterests() {
        return interests;
    }
    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }
    public void addInterest(Interest interest){
        this.interests.add(interest);
    }
}


