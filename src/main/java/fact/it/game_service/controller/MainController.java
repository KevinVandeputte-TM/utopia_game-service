package fact.it.game_service.controller;

import fact.it.game_service.model.GameDTO;
import fact.it.game_service.model.Question;
import fact.it.game_service.model.Station;
import fact.it.game_service.repository.GameRepository;
import fact.it.game_service.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;


@RestController
public class MainController {

    @Autowired
    private GameRepository gameRepository;

    @Autowired

    private QuestionRepository questionRepository;

    public MainController(GameRepository gameRepository, QuestionRepository questionRepository) {
        this.gameRepository = gameRepository;
        this.questionRepository = questionRepository;
    }


    @PostConstruct
    public void fillDB() {
        if (gameRepository.count() == 0 && questionRepository.count() == 0) {
            Station g1 = new Station();
            g1.setStationID(1);
            g1.setInformation("This will be added later");
            g1.setFaculty("Faculty station 1");
            g1.setEducation("Thomas More");
            gameRepository.save(g1);

            Station g2 = new Station();
            g2.setStationID(2);
            g2.setInformation("This will be added later");
            g2.setFaculty("Faculty station 2");
            g2.setEducation("Thomas More");
            gameRepository.save(g2);

            Station g3 = new Station();

            g3.setInformation("This will be added later");
            g3.setFaculty("Faculty station 3");
            g3.setEducation("Thomas More");
            gameRepository.save(g3);

            Station g4 = new Station();
            g4.setStationID(4);
            g4.setInformation("This will be added later");
            g4.setFaculty("Faculty station 4");
            g4.setEducation("Thomas More");
            gameRepository.save(g4);

            //List of all stations
            List<Station> stations = gameRepository.findAll();

            Question q1 = new Question();
            q1.setQuestionID(1);
            q1.setQuestion("Q1-S1");
            q1.setCorrectanswer("Correct 1");
            q1.setfOne("F1");
            q1.setfTwo("F2");
            q1.setfThree("F3");
            q1.setStation(stations.get(0));
            questionRepository.save(q1);

            Question q2 = new Question();
            q2.setQuestionID(1);
            q2.setQuestion("q2-S1");
            q2.setCorrectanswer("Correct 1");
            q2.setfOne("F1");
            q2.setfTwo("F2");
            q2.setfThree("F3");
            q2.setStation(stations.get(0));
            questionRepository.save(q2);

            Question q3 = new Question();
            q3.setQuestionID(1);
            q3.setQuestion("q3-S1");
            q3.setCorrectanswer("Correct 1");
            q3.setfOne("F1");
            q3.setfTwo("F2");
            q3.setfThree("F3");
            q3.setStation(stations.get(0));
            questionRepository.save(q3);

            Question q4 = new Question();
            q4.setQuestionID(1);
            q4.setQuestion("q4-S1");
            q4.setCorrectanswer("Correct 1");
            q4.setfOne("F1");
            q4.setfTwo("F2");
            q4.setfThree("F3");
            q4.setStation(stations.get(1));
            questionRepository.save(q4);

            Question q5 = new Question();
            q5.setQuestionID(1);
            q5.setQuestion("q5-S1");
            q5.setCorrectanswer("Correct 1");
            q5.setfOne("F1");
            q5.setfTwo("F2");
            q5.setfThree("F3");
            q5.setStation(stations.get(2));
            questionRepository.save(q5);

            Question q6 = new Question();
            q6.setQuestionID(1);
            q6.setQuestion("q6-S1");
            q6.setCorrectanswer("Correct 1");
            q6.setfOne("F1");
            q6.setfTwo("F2");
            q6.setfThree("F3");
            q6.setStation(stations.get(3));
            questionRepository.save(q6);



        }
    }
    //get all questions

        //get all questions
    @GetMapping("/stations")
    public List<Station> getAllStations () {
        return gameRepository.findAll();
    }
        //Get stationinfo by station ID
        @GetMapping("/station/{stationID}")
        public Station getStation ( @PathVariable int stationID){
            return gameRepository.findStationByStationID(stationID);
        }

        //Get questions by stationID
        @GetMapping("/questions/{stationID}")
        public List<Question> getAllQuestions ( @PathVariable int stationID){
            return gameRepository.findStationByStationID(stationID).getQuestions();

        }

    //POST: stations
    @PostMapping("/station")
    public Station createStation(@RequestBody GameDTO station){
        Station peristentStation = new Station();
//        peristentStation.setStationID(station.getStationID());
        peristentStation.setEducation(station.getEducation());
        peristentStation.setFaculty(station.getFaculty());
        peristentStation.setInformation(station.getInformation());
        gameRepository.save(peristentStation);
        return peristentStation;
    }
    //PUT:
    @PutMapping("/station")
    public ResponseEntity<Void> updateStation(@RequestBody GameDTO stationDetails) {
        Optional<Station> stationFetch = Optional.ofNullable(gameRepository.findStationByStationID(stationDetails.getStationID()));
        if (stationFetch.isPresent()) {
            Station station = stationFetch.get();
            station.setInformation(stationDetails.getInformation());
            station.setFaculty(stationDetails.getFaculty());
            station.setEducation(stationDetails.getEducation());
            gameRepository.save(station);
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

        peristentQuestion.setStation(gameRepository.findStationByStationID(question.getStationID()));
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
          question.setStation(gameRepository.findStationByStationID(questionDetails.getStationID()));
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
