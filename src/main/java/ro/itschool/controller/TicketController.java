package ro.itschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.itschool.entity.Ticket;
import ro.itschool.repository.TicketRepository;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping(value = "/buy")
    public void buyTicket(@RequestBody Ticket ticket) {
        ticket.setInsertTime(LocalDateTime.now());
        ticketRepository.save(ticket);
    }

    @GetMapping(value = "/all")
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @PostMapping(value = "/mark-obsolete")
    public void markAllTicketsAsObsolete(){
        ticketRepository.markAllAsObsolete();
    }

}
