package hu.progmatic.hangman_with_db.repo;

import hu.progmatic.hangman_with_db.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player,Long> {
}
