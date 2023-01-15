package fact.it.game_service.controller;

import fact.it.game_service.model.GameDTO;
import fact.it.game_service.model.Interest;
import fact.it.game_service.model.Question;
import fact.it.game_service.model.Station;
import fact.it.game_service.repository.InterestRepository;
import fact.it.game_service.repository.QuestionRepository;
import fact.it.game_service.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class MainController {

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private InterestRepository interestRepository;

    public MainController(StationRepository stationRepository, QuestionRepository questionRepository, InterestRepository interestRepository) {
        this.stationRepository = stationRepository;
        this.questionRepository = questionRepository;
        this.interestRepository = interestRepository;
    }

    @PostConstruct
    public void fillDB() {
        if (stationRepository.count() == 0 && questionRepository.count() == 0 && interestRepository.count() == 0) {
            System.out.println("Filling DB...");

            // Create interests
            Interest i1 = new Interest(1, "Business & Tourism");
            interestRepository.save(i1);
            Interest i2 = new Interest(2, "Design & Build");
            interestRepository.save(i2);
            Interest i3 = new Interest(3, "Education");
            interestRepository.save(i3);
            Interest i4 = new Interest(4, "Life Sciences & Chemistry");
            interestRepository.save(i4);
            Interest i5 = new Interest(5, "Media & Communication");
            interestRepository.save(i5);
            Interest i6 = new Interest(6, "People & Health");
            interestRepository.save(i6);
            Interest i7 = new Interest(7, "Sport");
            interestRepository.save(i7);
            Interest i8 = new Interest(8, "Tech & IT");
            interestRepository.save(i8);
            Interest i9 = new Interest(9, "Geen");
            interestRepository.save(i9);

            // CREATE STATIONS
            List<Interest> allinterests = interestRepository.findAll();

            //variables

            String info = "This will be added later";
            String faculty = "Thomas More Geel";

            Station s1 = new Station();
             s1.setStationID(1000);
            s1.setEducation("Human Resources");
            s1.addInterest(allinterests.get(0));
            s1.setInformation(info);
            s1.setFaculty(faculty);
            stationRepository.save(s1);

            Station s2 = new Station();
            s2.setEducation("Bedrijfsmanagement");
            s2.addInterest(i1);
            s2.setInformation(info);
            s2.setFaculty(faculty);
            stationRepository.save(s2);

            Station s3 = new Station();
            s3.setEducation("Communicatie");
            s3.addInterest(i1);
            s3.setInformation(info);
            s3.setFaculty(faculty);
            stationRepository.save(s3);

            Station s4 = new Station();
            s4.setEducation("Journalistiek");
            s4.addInterest(i5);
            s4.setInformation(info);
            s4.setFaculty(faculty);
            stationRepository.save(s4);

            Station s5 = new Station();
            s5.setEducation("Media en EntertainmentBusiness");
            s5.addInterest(i5);
            s5.setInformation(info);
            s5.setFaculty(faculty);
            stationRepository.save(s5);

            Station s6 = new Station();
            s6.setEducation("Informatiemanagement & Multimedia");
            s6.addInterest(i5);
            s6.setInformation(info);
            s6.setFaculty(faculty);
            stationRepository.save(s6);

            Station s7 = new Station();
            s7.setEducation("Leraar secundair onderwijs");
            s7.addInterest(i3);
            s7.setInformation(info);
            s7.setFaculty(faculty);
            stationRepository.save(s7);

            Station s8 = new Station();
            s8.setEducation("Leraar lager onderwijs");
            s8.addInterest(i3);
            s8.setInformation(info);
            s8.setFaculty(faculty);
            stationRepository.save(s8);

            Station s9 = new Station();
            s9.setEducation("Leraar kleuteronderwijs");
            s9.addInterest(i3);
            s9.setInformation(info);
            s9.setFaculty(faculty);
            stationRepository.save(s9);

            Station s10 = new Station();
            s10.setEducation("Sport en Bewegen");
            s10.addInterest(i7);
            s10.setInformation(info);
            s10.setFaculty(faculty);
            stationRepository.save(s10);

            Station s11 = new Station();
            s11.setEducation("Chemie");
            s11.addInterest(i4);
            s11.setInformation(info);
            s11.setFaculty(faculty);
            stationRepository.save(s11);

            Station s12 = new Station();
            s12.setEducation("Biomedische Laboratoriumtechnologie");
            s12.addInterest(i4);
            s12.setInformation(info);
            s12.setFaculty(faculty);
            stationRepository.save(s12);

            Station s13 = new Station();
            s13.setEducation("Voedings en dieetkunde");
            s13.addInterest(i4);
            s13.setInformation(info);
            s13.setFaculty(faculty);
            stationRepository.save(s13);

            Station s14 = new Station();
            s14.setEducation("Logopedie en Audiologie");
            s14.addInterest(i6);
            s14.setInformation(info);
            s14.setFaculty(faculty);
            stationRepository.save(s14);

            Station s15 = new Station();
            s15.setEducation("Toegepast Psychologie");
            s15.addInterest(i6);
            s15.setInformation(info);
            s15.setFaculty(faculty);
            stationRepository.save(s15);

            Station s16 = new Station();
            s16.setEducation("Vroedkunde");
            s16.addInterest(i6);
            s16.setInformation(info);
            s16.setFaculty(faculty);
            stationRepository.save(s16);

            Station s17 = new Station();
            s17.setEducation("Ergotherapie");
            s17.addInterest(i6);
            s17.setInformation(info);
            s17.setFaculty(faculty);
            stationRepository.save(s17);

            Station s18 = new Station();
            s18.setEducation("Orthopedie");
            s18.addInterest(i6);
            s18.setInformation(info);
            s18.setFaculty(faculty);
            stationRepository.save(s18);

            Station s19 = new Station();
            s19.setEducation("Sociaal Werk");
            s19.addInterest(i6);
            s19.setInformation(info);
            s19.setFaculty(faculty);
            stationRepository.save(s19);

            Station s20 = new Station();
            s20.setEducation("Verpleegkunde");
            s20.addInterest(i6);
            s20.setInformation(info);
            s20.setFaculty(faculty);
            stationRepository.save(s20);

            Station s21 = new Station();
            s21.setEducation("Autotechnologie");
            s21.addInterest(i8);
            s21.setInformation(info);
            s21.setFaculty(faculty);
            stationRepository.save(s21);

            Station s22 = new Station();
            s22.setEducation("Elektronica-ICT");
            s22.addInterest(i8);
            s22.setInformation(info);
            s22.setFaculty(faculty);
            stationRepository.save(s22);

            Station s23 = new Station();
            s23.setEducation("Energietechnologie");
            s23.addInterest(i8);
            s23.setInformation(info);
            s23.setFaculty(faculty);
            stationRepository.save(s23);

            Station s24 = new Station();
            s24.setEducation("Ontwerp en Prooductietechnologie");
            s24.addInterest(i8);
            s24.setInformation(info);
            s24.setFaculty(faculty);
            stationRepository.save(s24);

            Station s25 = new Station();
            s25.setEducation("Toegepaste Informatica");
            s25.addInterest(i8);
            s25.setInformation(info);
            s25.setFaculty(faculty);
            stationRepository.save(s25);

            Station s26 = new Station();
            s26.setEducation("Bouw");
            s26.addInterest(i2);
            s26.setInformation(info);
            s26.setFaculty(faculty);
            stationRepository.save(s26);

            Station s27 = new Station();
            s27.setEducation("Interieurvormgeving");
            s27.addInterest(i2);
            s27.setInformation(info);
            s27.setFaculty(faculty);
            stationRepository.save(s27);

            Station s28 = new Station();
            s28.setEducation("Toegepaste architectuur");
            s28.addInterest(i2);
            s28.setInformation(info);
            s28.setFaculty(faculty);
            stationRepository.save(s28);

            //List of all stations
            List<Station> stations = stationRepository.findAll();

            /* --- ADD QUESTIONS --- */
            Question q1 = new Question();
            q1.setQuestionID(2000);
            q1.setQuestion("Hoeveel procent van de HR studenten vindt werk voor ze afstuderen?");
            q1.setCorrectanswer("75%");
            q1.setfOne("50%");
            q1.setfTwo("35%");
            q1.setfThree("90%");
            q1.setStation(stations.get(0));
            questionRepository.save(q1);

            Question q2 = new Question();
            q2.setQuestion("Wat zijn de kernwaarden van een goede HR consulent?");
            q2.setCorrectanswer("Betrouwbaar, klantgericht, nauwgezet, en oplossingsgericht");
            q2.setfOne("Aandachtig, genuanceerd");
            q2.setfTwo("Respectvol, waardevol, en rechtvaardig");
            q2.setfThree("Loyaal en toegankelijk");
            q2.setStation(stations.get(0));
            questionRepository.save(q2);

            Question q3 = new Question();
            q3.setQuestion("Op welke zorg zijn HR experts het meest gericht");
            q3.setCorrectanswer("Mens en dossier");
            q3.setfOne("Praktische zorg");
            q3.setfTwo("Mentale zorg");
            q3.setfThree("Financiele zorg");
            q3.setStation(stations.get(0));
            questionRepository.save(q3);

            Question q4 = new Question();
            q4.setQuestion("q4-S1");
            q4.setCorrectanswer("Correct 1");
            q4.setfOne("F1");
            q4.setfTwo("F2");
            q4.setfThree("F3");
            q4.setStation(stations.get(1));
            questionRepository.save(q4);

            Question q5 = new Question();
            q5.setQuestion("q5-S1");
            q5.setCorrectanswer("Correct 1");
            q5.setfOne("F1");
            q5.setfTwo("F2");
            q5.setfThree("F3");
            q5.setStation(stations.get(2));
            questionRepository.save(q5);

            Question q6 = new Question();
            q6.setQuestion("q6-S1");
            q6.setCorrectanswer("Correct 1");
            q6.setfOne("F1");
            q6.setfTwo("F2");
            q6.setfThree("F3");
            q6.setStation(stations.get(3));
            questionRepository.save(q6);

        }
    }


    /* --- ENDPOINTS --- */

    //get all questions
    @GetMapping("/stations")
    public List<Station> getAllStations () {
        return stationRepository.findAll();
    }
    //Get stationinfo by station ID
    @GetMapping("/station/{stationID}")
    public Station getStation ( @PathVariable int stationID){
        return stationRepository.findStationByStationID(stationID);
    }

    @GetMapping("/question/{questionID}")
    public Question question (@PathVariable int questionID) {
        return questionRepository.findQuestionByQuestionID(questionID);
    }

    //Get questions by stationID
    @GetMapping("/questions/{stationID}")
    public List<Question> getAllQuestions ( @PathVariable int stationID){
        return stationRepository.findStationByStationID(stationID).getQuestions();
    }

    @GetMapping("/interests")
    public List<Interest> getAllInterests(){
        return interestRepository.findAll();
    }

    @GetMapping("/interests/{interestID}")
    public Interest getInterest(@PathVariable int interestID){
        return interestRepository.findInterestByInterestID(interestID);
    }

    //POST: stations
    @PostMapping("/station")
    public Station createStation(@RequestBody GameDTO station){
        Station peristentStation = new Station();
//        peristentStation.setStationID(station.getStationID());
        peristentStation.setEducation(station.getEducation());
        peristentStation.setFaculty(station.getFaculty());
        peristentStation.setInformation(station.getInformation());
        stationRepository.save(peristentStation);
        return peristentStation;
    }
    //PUT:
    @PutMapping("/station")
    public ResponseEntity<Void> updateStation(@RequestBody GameDTO stationDetails) {
        Optional<Station> stationFetch = Optional.ofNullable(stationRepository.findStationByStationID(stationDetails.getStationID()));
        if (stationFetch.isPresent()) {
            Station station = stationFetch.get();
            station.setInformation(stationDetails.getInformation());
            station.setFaculty(stationDetails.getFaculty());
            station.setEducation(stationDetails.getEducation());
            stationRepository.save(station);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //POST: question
    @PostMapping("/question")
    public Question createQuestion(@RequestBody GameDTO question){

        Question peristentQuestion = new Question();
//        peristentQuestion.setQuestionID(question.getQuestionID());
        peristentQuestion.setQuestion(question.getQuestion());
        peristentQuestion.setCorrectanswer(question.getCorrectanswer());
        peristentQuestion.setfOne(question.getfOne());
        peristentQuestion.setfTwo(question.getfTwo());
        peristentQuestion.setfThree(question.getfThree());

        peristentQuestion.setStation(stationRepository.findStationByStationID(question.getStationID()));
        questionRepository.save(peristentQuestion);
        return peristentQuestion;
    }

    //PUT:
    @PutMapping("/question")
    public ResponseEntity<Void> updateQuestion(@RequestBody GameDTO questionDetails)
    {
        Optional<Question> questionFetch = Optional.ofNullable(questionRepository.findQuestionByQuestionID(questionDetails.getQuestionID()));
        if (questionFetch.isPresent()) {
            Question question = questionFetch.get();
            question.setQuestion(questionDetails.getQuestion());
            question.setCorrectanswer(questionDetails.getCorrectanswer());
            question.setfOne(questionDetails.getfOne());
            question.setfTwo(questionDetails.getfTwo());
            question.setfThree(questionDetails.getfThree());
          question.setStation(stationRepository.findStationByStationID(questionDetails.getStationID()));
            questionRepository.save(question);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //DELETE: question
    @DeleteMapping("/question/{number}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable int number){
        Question q = questionRepository.findQuestionByQuestionID(number);

        if(q !=null) {
            questionRepository.delete(q);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
