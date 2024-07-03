package com.ug.hotels.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ug.hotels.model.Hotel;
import com.ug.hotels.repositories.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> seach() {
        return (List<Hotel>) hotelRepository.findAll();
    }
}
