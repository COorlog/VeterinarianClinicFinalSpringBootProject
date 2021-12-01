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
import com.finalproject.VeterinarianClinic.Entities.Clients;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/Clients")
@OpenAPIDefinition(
    info = @Info(title = "Clients Service"), servers = {
        @Server(url = "http://localhost:8080", description = "Local server.")})

public interface ClientsController {

//@formatter:off  
  
  
  @Operation(
      summary = "Return clients",
      description = "Return clients",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "Clients are returned", 
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Clients.class))),
          @ApiResponse(
              responseCode = "404", 
              description = "No clients found", 
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
  List<Clients> getClients();
      
//@formatter:off
 @Operation(
     summary = "Create a client",
     description = "Returns the created client",
     responses = {
         @ApiResponse(
             responseCode = "201", 
             description = "The created client is returned", 
             content = @Content(
                 mediaType = "application/json", 
                 schema = @Schema(implementation = Clients.class))),
         @ApiResponse(
             responseCode = "400", 
             description = "The request parameters are invalid", 
             content = @Content(
                 mediaType = "application/json")),
         @ApiResponse(
             responseCode = "404", 
             description = "A client could not be generated", 
             content = @Content(mediaType = "application/json")),
         @ApiResponse(
             responseCode = "500", 
             description = "An unplanned error occurred", 
             content = @Content(mediaType = "application/json"))
     }
     )
     
     @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
 Clients postClients(@Valid @RequestBody Clients clients);

//@formatter:off
@Operation(
   summary = "Update a client",
   description = "Returns the updated client",
   responses = {
       @ApiResponse(
           responseCode = "201", 
           description = "The updated client is returned", 
           content = @Content(
               mediaType = "application/json", 
               schema = @Schema(implementation = Clients.class))),
       @ApiResponse(
           responseCode = "400", 
           description = "The request parameters are invalid", 
           content = @Content(
               mediaType = "application/json")),
       @ApiResponse(
           responseCode = "404", 
           description = "An updated client could not be generated", 
           content = @Content(mediaType = "application/json")),
       @ApiResponse(
           responseCode = "500", 
           description = "An unplanned error occurred", 
           content = @Content(mediaType = "application/json"))
 }
 )
 
 @PutMapping
 @ResponseStatus(code = HttpStatus.OK)
Clients updateClients(@Valid @RequestBody Clients clients);

//@formatter:off
@Operation(
   summary = "Delete a client",
   description = "Returns the deleted client",
   responses = {
       @ApiResponse(
           responseCode = "201", 
           description = "The deleted client is returned", 
           content = @Content(
               mediaType = "application/json", 
               schema = @Schema(implementation = Clients.class))),
       @ApiResponse(
           responseCode = "400", 
           description = "The request parameters are invalid", 
           content = @Content(
               mediaType = "application/json")),
       @ApiResponse(
           responseCode = "404", 
           description = "A deleted client could not be generated", 
           content = @Content(mediaType = "application/json")),
       @ApiResponse(
           responseCode = "500", 
           description = "An unplanned error occurred", 
           content = @Content(mediaType = "application/json"))
}
)

@DeleteMapping
@ResponseStatus(code = HttpStatus.OK)
Clients deleteClients(@Valid @RequestBody Clients clients);




//@formatter:on */




   }




