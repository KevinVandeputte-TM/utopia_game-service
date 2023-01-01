package fact.it.game_service.repository;

import fact.it.game_service.model.Interest;
import fact.it.game_service.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestRepository extends JpaRepository<Interest, Integer> {

    Interest findInterestByInterestID(int id);

}
