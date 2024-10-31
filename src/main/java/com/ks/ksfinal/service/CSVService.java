package com.ks.ksfinal.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
/*
import com.ks.ksfinal.helper.CSVHelper;
import com.ks.ksfinal.model.Users;
import com.ks.ksfinal.repository.UsersRepo;

@Service
public class CSVService {
  @Autowired
  UsersRepo repository;

  public void save(MultipartFile file) {
    try {
      List<Users> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
      repository.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<Users> tutorials = repository.findAll();

    ByteArrayInputStream in = CSVHelper.tutorialsToCSV(tutorials);
    return in;
  }

  public List<Users> getAllTutorials() {
    return repository.findAll();
  }
}


 */