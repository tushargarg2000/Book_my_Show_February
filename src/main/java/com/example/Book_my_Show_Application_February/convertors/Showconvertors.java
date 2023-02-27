package com.example.Book_my_Show_Application_February.convertors;

import com.example.Book_my_Show_Application_February.Entities.ShowEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.ShowEntryDto;

public class Showconvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                                .build();

        return showEntity;
    }
}
