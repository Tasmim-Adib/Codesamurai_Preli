package com.example.CodeSamrurai.Service;

import com.example.CodeSamrurai.Model.Station;
import com.example.CodeSamrurai.Repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService {
    @Autowired
    public StationRepository stationRepository;

    //Save provided question and answer
    public Station saveStation(Station station){
        return stationRepository.save(station);
    }

}
