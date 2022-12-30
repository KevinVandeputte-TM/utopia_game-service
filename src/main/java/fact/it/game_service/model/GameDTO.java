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

//    @OneToMany(mappedBy = "station")
//    private List<Question> questions = new ArrayList<>();

    //questions
private int questionID;
    private String question;

    private String correctanswer;
    private String       fOne;
    private String       fTwo;
    private String       fThree;
    private String       fFour;

}