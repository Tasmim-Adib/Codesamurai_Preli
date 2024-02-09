package com.example.CodeSamrurai.Repository;

import com.example.CodeSamrurai.Model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {

}
