package com.finalproject.VeterinarianClinic.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Entities.Clients;
import com.finalproject.VeterinarianClinic.Service.ClientsService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j

public class DefaultClientsController implements ClientsController {

  @Autowired
  private ClientsService service;
  
 
  public List<Clients> getClients() {
    log.debug("DefaultClientsController -> getClients() method called");

    
    return service.getClients();
  }
  
 @Override 
  public Clients postClients(Clients clients) {
    log.debug("DefaultClientsController -> postClients() method called");

    
    return service.postClients(clients);
   }
 
 @Override
 public Clients updateClients(Clients clients) {
     log.debug("DefaultClientsController -> updateClients() method called");

   
   return service.updateClients(clients);

 }
 
 @Override
 public Clients deleteClients(Clients clients) {
     log.debug("DefaultClientsController -> deleteClients() method called");

   
   return service.deleteClients(clients);

 }
  }

