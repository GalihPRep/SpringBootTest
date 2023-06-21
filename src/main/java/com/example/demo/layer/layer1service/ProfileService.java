package com.example.demo.layer.layer1service;

import com.example.demo.layer.layer2repository.ProfileRepository;
import com.example.demo.model.Profile;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProfileService {
    @Autowired
    ProfileRepository repository;

    @SneakyThrows
    public Profile create(Profile data){return repository.save(data);}
    @SneakyThrows
    public List<Profile> readAll(){return repository.findAll();}
    @SneakyThrows
    public Optional<Profile> readById(Long id){return repository.findById(id);}
}
