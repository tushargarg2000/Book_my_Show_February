package com.example.Book_my_Show_Application_February.Repository;

import com.example.Book_my_Show_Application_February.Entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
}
