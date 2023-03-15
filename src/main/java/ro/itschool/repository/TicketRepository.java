package ro.itschool.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ro.itschool.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE ticket SET obsolete = 1", nativeQuery = true)
    void markAllAsObsolete();
}
