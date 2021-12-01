package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.finalproject.VeterinarianClinic.Dao.ClientsDao;
import com.finalproject.VeterinarianClinic.Entities.Clients;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j

public class DefaultClientsService implements ClientsService {

  @Autowired
  ClientsDao clientsDao;
  
  @Transactional
  @Override
  
  public List<Clients> getClients() {
   log.debug("DefaultClientsService -> getClients() method called");
   
     List<Clients> clients = clientsDao.getClients();
    
    return clients;
  }
  
  @Transactional
  @Override
  
  public Clients postClients(Clients clients) {
   log.debug("DefaultClientsService -> postClients() method called");
   
       
    return clientsDao.postClients(clients);
  }
  
  @Transactional
  @Override
  
  public Clients updateClients(Clients clients) {
   log.debug("DefaultClientsService -> postClients() method called");
   
       
    return clientsDao.updateClients(clients);
  }
  
  @Transactional
  @Override
  
  public Clients deleteClients(Clients clients) {
   log.debug("DefaultClientsService -> deleteClients() method called");
   
       
    return clientsDao.deleteClients(clients);
  }
}
