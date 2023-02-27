package com.example.Book_my_Show_Application_February.EntryDtos;

import com.example.Book_my_Show_Application_February.Enums.ShowType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ShowEntryDto {

    private LocalDate localDate;

    private LocalTime localTime;

    private ShowType showType;

    private int movieId;

    private int theaterId;

    private int classicSeatPrice;

    private int premiumSeatPrice;


}
