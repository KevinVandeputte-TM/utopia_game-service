package fact.it.game_service.repository;

import fact.it.game_service.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Integer> {

Station findStationByStationID(int id);

}
