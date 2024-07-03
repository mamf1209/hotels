package com.ug.hotels.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.ug.hotels.model.Hotel;
import com.ug.hotels.services.HotelService;
import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("hotels")
    public List<Hotel> seach(){
        return hotelService.seach();
    }
}
