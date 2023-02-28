package com.example.Book_my_Show_Application_February.EntryDtos;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TicketEntryDto {

    private int showId;

    private List<String> requestedSeats = new ArrayList<>();

    private int userId;


}
