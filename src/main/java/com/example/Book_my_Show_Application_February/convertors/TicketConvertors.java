package com.example.Book_my_Show_Application_February.convertors;

import com.example.Book_my_Show_Application_February.Entities.TicketEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.TicketEntryDto;

public class TicketConvertors {


    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        TicketEntity ticketEntity = new TicketEntity();
        return ticketEntity;

    }
}

