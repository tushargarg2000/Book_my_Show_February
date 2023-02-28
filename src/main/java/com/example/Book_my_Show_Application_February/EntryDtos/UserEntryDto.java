package com.example.Book_my_Show_Application_February.EntryDtos;


import javax.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Data
public class UserEntryDto {


    private String name;

    private int age;

    private String email;

    private String mobNo;

    private String address;
}
