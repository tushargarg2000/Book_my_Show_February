package com.example.Book_my_Show_Application_February.Controller;


import com.example.Book_my_Show_Application_February.EntryDtos.TheaterEntryDto;
import com.example.Book_my_Show_Application_February.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    public String addTheater(@RequestBody TheaterEntryDto theaterEntryDto){

        th

    }
}
