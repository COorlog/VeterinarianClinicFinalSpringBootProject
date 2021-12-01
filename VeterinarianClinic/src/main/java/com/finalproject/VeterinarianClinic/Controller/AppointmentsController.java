package com.finalproject.VeterinarianClinic.Controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.finalproject.VeterinarianClinic.Entities.Appointments;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/Appointments")
@OpenAPIDefinition(
    info = @Info(title = "Appointments Service"), servers = {
        @Server(url = "http://localhost:8080", description = "Local server.")})


public interface AppointmentsController { 

//@formatter:off  
  
  
  @Operation(
      summary = "Return appointments",
      description = "Return appointments",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "Appointments are returned", 
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Appointments.class))),
          @ApiResponse(
              responseCode = "404", 
              description = "No appointments found", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred", 
              content = @Content(
                  mediaType = "application/json"))
      }
)
       
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Appointments> getAppointments();
      

//@formatter:off
 @Operation(
     summary = "Create an appointment",
     description = "Returns the created appointment",
     responses = {
         @ApiResponse(
             responseCode = "201", 
             description = "The created appointment is returned", 
             content = @Content(
                 mediaType = "application/json", 
                 schema = @Schema(implementation = Appointments.class))),
         @ApiResponse(
             responseCode = "400", 
             description = "The request parameters are invalid", 
             content = @Content(
                 mediaType = "application/json")),
         @ApiResponse(
             responseCode = "404", 
             description = "An appointment could not be generated", 
             content = @Content(mediaType = "application/json")),
         @ApiResponse(
             responseCode = "500", 
             description = "An unplanned error occurred", 
             content = @Content(mediaType = "application/json"))
     }
     )
     
     @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
  Appointments postAppointments(@Valid @RequestBody Appointments appointments);
    
 
 // @formatter:on */



//@formatter:off
@Operation(
   summary = "Update an appointment",
   description = "Returns the updated appointment",
   responses = {
       @ApiResponse(
           responseCode = "201", 
           description = "The updated appointment is returned", 
           content = @Content(
               mediaType = "application/json", 
               schema = @Schema(implementation = Appointments.class))),
       @ApiResponse(
           responseCode = "400", 
           description = "The request parameters are invalid", 
           content = @Content(
               mediaType = "application/json")),
       @ApiResponse(
           responseCode = "404", 
           description = "An updated appointment could not be generated", 
           content = @Content(mediaType = "application/json")),
       @ApiResponse(
           responseCode = "500", 
           description = "An unplanned error occurred", 
           content = @Content(mediaType = "application/json"))
   }
   )
   
   @PutMapping
   @ResponseStatus(code = HttpStatus.OK)
Appointments updateAppointments(@Valid @RequestBody Appointments appointments);
  



// @formatter:on */

//@formatter:off
@Operation(
 summary = "Delete an appointment",
 description = "Returns the deleted appointment",
 responses = {
     @ApiResponse(
         responseCode = "201", 
         description = "The deleted appointment is returned", 
         content = @Content(
             mediaType = "application/json", 
             schema = @Schema(implementation = Appointments.class))),
     @ApiResponse(
         responseCode = "400", 
         description = "The request parameters are invalid", 
         content = @Content(
             mediaType = "application/json")),
     @ApiResponse(
         responseCode = "404", 
         description = "A deleted appointment could not be generated", 
         content = @Content(mediaType = "application/json")),
     @ApiResponse(
         responseCode = "500", 
         description = "An unplanned error occurred", 
         content = @Content(mediaType = "application/json"))
 }
 )
 
 @DeleteMapping
 @ResponseStatus(code = HttpStatus.OK)
Appointments deleteAppointments(@Valid @RequestBody Appointments appointments);




//@formatter:on */


}

  





