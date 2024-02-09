package com.example.CodeSamrurai.Controller;

import com.example.CodeSamrurai.Model.Station;
import com.example.CodeSamrurai.Service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class StationController {
    @Autowired
    public StationService stationService;

    @PostMapping("/stations") //save a contribution
    public ResponseEntity<?> add(@RequestBody Station station){
        try{
            Station savedStation = stationService.saveStation(station);
            return new ResponseEntity<>(savedStation, HttpStatus.CREATED);
        }catch (Exception e) {
            String errorMessage = "An error Occured";
            return new ResponseEntity<>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
