package com.example.Book_my_Show_Application_February.Services;


import com.example.Book_my_Show_Application_February.Entities.TheaterEntity;
import com.example.Book_my_Show_Application_February.Entities.TheaterSeatEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.TheaterEntryDto;
import com.example.Book_my_Show_Application_February.Enums.SeatType;
import com.example.Book_my_Show_Application_February.Repository.TheaterRepository;
import com.example.Book_my_Show_Application_February.Repository.TheaterSeatRepository;
import com.example.Book_my_Show_Application_February.convertors.TheaterConvertors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {

    @Autowired
    TheaterSeatRepository theaterSeatRepository;


    @Autowired
    TheaterRepository theaterRepository;

    public String addTheater(TheaterEntryDto theaterEntryDto)throws Exception{


        //Do some validations :
        if(theaterEntryDto.getName()==null||theaterEntryDto.getLocation()==null){
            throw new Exception("Name and location should valid");
        }

        TheaterEntity theaterEntity = TheaterConvertors.convertDtoToEntity(theaterEntryDto);
        List<TheaterSeatEntity> theaterSeatEntityList = createTheaterSeats(theaterEntryDto,theaterEntity);

        theaterEntity.setTheaterSeatEntityList(theaterSeatEntityList);
        theaterRepository.save(theaterEntity);

        return "Theater Added successfully";
    }

    private List<TheaterSeatEntity> createTheaterSeats(TheaterEntryDto theaterEntryDto,TheaterEntity theaterEntity){

        int noClassicSeats = theaterEntryDto.getClassicSeatsCount();
        int noPremiumSeats = theaterEntryDto.getPremiumSeatsCount();

        List<TheaterSeatEntity> theaterSeatEntityList = new ArrayList<>();

        //Created the classic Seats
        for(int count = 1;count<=noClassicSeats;count++){

            //We need to make a new TheaterSeatEntity
            TheaterSeatEntity theaterSeatEntity = TheaterSeatEntity.builder()
                    .seatType(SeatType.CLASSIC).seatNo(count+"C")
                    .theaterEntity(theaterEntity).build();

            theaterSeatEntityList.add(theaterSeatEntity);
        }


        //Create the premium Seats
        for(int count=1;count<=noPremiumSeats;count++){

            TheaterSeatEntity theaterSeatEntity = TheaterSeatEntity.builder().
                    seatType(SeatType.PREMIUM).seatNo(count+"P").theaterEntity(theaterEntity).build();

            theaterSeatEntityList.add(theaterSeatEntity);
        }

        //Not saving the child here
        return theaterSeatEntityList;

    }
}
