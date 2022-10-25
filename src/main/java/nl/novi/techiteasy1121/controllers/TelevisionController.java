package nl.novi.techiteasy1121.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionController {

    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelevisions() {

        return ResponseEntity.ok("televisions");

    }

    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelevision() {

        return ResponseEntity.ok("television");

    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> addTelevision(@RequestBody String television) {

        return ResponseEntity.created(null).body("television");

    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id) {

        return ResponseEntity.noContent().build();

    }

    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable int id, @RequestBody String television) {

        return ResponseEntity.noContent().build();

    }


}
