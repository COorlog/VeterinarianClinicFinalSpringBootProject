package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import com.finalproject.VeterinarianClinic.Entities.Appointments;

public interface AppointmentsService {
  
  List<Appointments> getAppointments();
  
  Appointments postAppointments(Appointments appointments);

  Appointments updateAppointments(Appointments appointments);
  
  Appointments deleteAppointments(Appointments appointments);
}
