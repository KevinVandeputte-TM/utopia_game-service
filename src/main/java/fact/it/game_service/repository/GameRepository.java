package fact.it.game_service.repository;

import fact.it.game_service.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GameRepository extends JpaRepository<Station, Integer> {

Station findStationByStationID(int id);

}
