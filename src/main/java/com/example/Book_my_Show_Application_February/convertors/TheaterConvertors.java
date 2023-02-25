package com.example.Book_my_Show_Application_February.convertors;

import com.example.Book_my_Show_Application_February.Entities.TheaterEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}
