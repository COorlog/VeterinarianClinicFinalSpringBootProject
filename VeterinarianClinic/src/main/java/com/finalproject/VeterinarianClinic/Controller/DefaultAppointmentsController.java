package com.finalproject.VeterinarianClinic.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finalproject.VeterinarianClinic.Entities.Appointments;
import com.finalproject.VeterinarianClinic.Service.AppointmentsService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j

public class DefaultAppointmentsController implements AppointmentsController {

  @Autowired
  private AppointmentsService service;
  
 @Override
  public List<Appointments> getAppointments() {
    log.debug("DefaultAppointmentsController -> getAppointments() method called");

    
    return service.getAppointments();
  }
 
  @Override
  public Appointments postAppointments(Appointments appointments) {
      log.debug("DefaultAppointmentsController -> postAppointments() method called");

    
    return service.postAppointments(appointments);
 
  }
  
  @Override
  public Appointments updateAppointments(Appointments appointments) {
      log.debug("DefaultAppointmentsController -> updateAppointments() method called");

    
    return service.updateAppointments(appointments);
 
  }
  
  @Override
  public Appointments deleteAppointments(Appointments appointments) {
      log.debug("DefaultAppointmentsController -> deleteAppointments() method called");

    
    return service.deleteAppointments(appointments);
 
  }
  }



