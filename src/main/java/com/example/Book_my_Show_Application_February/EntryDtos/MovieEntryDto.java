package com.example.Book_my_Show_Application_February.EntryDtos;


import com.example.Book_my_Show_Application_February.Enums.Genre;
import com.example.Book_my_Show_Application_February.Enums.Language;
import javax.persistence.*;
import lombok.Data;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}
