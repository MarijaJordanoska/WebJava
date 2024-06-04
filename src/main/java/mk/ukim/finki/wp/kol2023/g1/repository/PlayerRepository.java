package mk.ukim.finki.wp.kol2023.g1.repository;

import mk.ukim.finki.wp.kol2023.g1.model.Player;
import mk.ukim.finki.wp.kol2023.g1.model.PlayerPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//listPlayersWithPointsLessThanAndPosition
public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findAllByPointsPerGameLessThanAndPosition(Double pointsPerGame, PlayerPosition position);
    List<Player> findAllByPointsPerGameLessThan(Double pointsPerGame);
    List<Player> findAllByPosition(PlayerPosition position);
}
