package com.ks.ksfinal.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ks.ksfinal.helper.ExcelHelper;
import com.ks.ksfinal.model.Users;
import com.ks.ksfinal.repository.UsersRepo;
/*
@Service
public class ExcelService {
  @Autowired
  UsersRepo repository;

  public void save(MultipartFile file) {
    try {
      List<Users> tutorials = ExcelHelper.excelToTutorials(file.getInputStream());
      repository.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store excel data: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<Users> tutorials = repository.findAll();

    ByteArrayInputStream in = ExcelHelper.tutorialsToExcel(tutorials);
    return in;
  }

  public List<Users> getAllTutorials() {
    return repository.findAll();
  }
}
*/