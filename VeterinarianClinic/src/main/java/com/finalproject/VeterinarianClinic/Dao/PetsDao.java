package com.finalproject.VeterinarianClinic.Dao;

import java.util.List;
import com.finalproject.VeterinarianClinic.Entities.Pets;


public interface PetsDao {
  
  List<Pets> getPets();
  
  Pets postPets(Pets pets);
  
  Pets updatePets(Pets pets);
  
  Pets deletePets(Pets pets);

}
