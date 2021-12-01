package com.finalproject.VeterinarianClinic.Service;

import java.util.List;
import com.finalproject.VeterinarianClinic.Entities.Billing;

public interface BillingService {
        
  List<Billing> getBilling();
  
  Billing postBilling(Billing billing);
  
  Billing updateBilling(Billing billing);

  Billing deleteBilling(Billing billing);


}
