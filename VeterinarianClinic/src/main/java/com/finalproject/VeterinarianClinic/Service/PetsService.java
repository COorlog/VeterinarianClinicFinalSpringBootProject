package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import com.finalproject.VeterinarianClinic.Entities.Pets;


public interface PetsService {
  
  List<Pets> getPets();
  
  Pets postPets(Pets pets);
  
  Pets updatePets(Pets pets);

  Pets deletePets(Pets pets);


}
