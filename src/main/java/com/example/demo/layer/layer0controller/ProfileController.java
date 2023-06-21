package com.example.demo.layer.layer0controller;

import com.example.demo.layer.layer1service.ProfileService;
import com.example.demo.model.Profile;
import com.example.demo.model.ProfileRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    ProfileService service;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProfileRequest request){
        Profile data = modelMapper.map(request, Profile.class);
        return ResponseEntity.ok(service.create(data));
    }
    @GetMapping
    public ResponseEntity<?> readAll(){
        return ResponseEntity.ok(service.readAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> readById(@PathVariable Long id){
        return ResponseEntity.ok(service.readById(id).get());
    }
}
