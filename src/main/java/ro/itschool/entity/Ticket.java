package ro.itschool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
@Where(clause = "obsolete = 0")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //14,24,45,2,8,33
    private String winningNumbers;

    private LocalDateTime insertTime;

    private String buyer;

    private Boolean obsolete = false;
}
