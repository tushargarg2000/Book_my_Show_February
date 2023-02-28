package com.example.Book_my_Show_Application_February.Repository;

import com.example.Book_my_Show_Application_February.Entities.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {

}
