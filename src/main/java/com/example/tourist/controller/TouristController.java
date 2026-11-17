package com.example.tourist.controller;
import com.example.tourist.entity.Tourist;
import com.example.tourist.repository.TouristRepository;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/tourists")
public class TouristController {
 private final TouristRepository repository;
 public TouristController(TouristRepository repository){this.repository=repository;}
 @GetMapping
 public List<Tourist> getAllTourists(@Parameter(description="Existing valid token",required=true) @RequestHeader("Token") String token){return repository.findAll();}
}
