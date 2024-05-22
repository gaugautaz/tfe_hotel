package com.project.hotel.controller;

import com.project.hotel.service.UserService;
import com.project.hotel.service.RoomService;
import com.project.hotel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private ReservationService reservationService;

    // Endpoints pour les utilisateurs, chambres et réservations
}