package org.ada.myfirstspringproject.controller;
import org.ada.myfirstspringproject.dto.PersonDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //etiqueta para comportamiento (me hace el import necesario)
@RequestMapping(path = "/persons") //parte adicional de la URL, debe reflejar lo que indica
public class PersonController {

    @PostMapping //etiqueta para request de modulo POST (creación)
    public ResponseEntity create(@RequestHeader(value = "client-id") String clientID,
                                 //devuelve status HTTP, (request header → ahora es mandatorio en postman agregarlo)
                                 @RequestBody PersonDTO persondto){

        return new ResponseEntity(HttpStatus.CREATED);
}

}
