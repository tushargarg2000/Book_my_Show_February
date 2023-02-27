package com.example.Book_my_Show_Application_February.Repository;

import com.example.Book_my_Show_Application_February.Entities.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}
