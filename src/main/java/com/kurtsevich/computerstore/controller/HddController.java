package com.kurtsevich.computerstore.controller;

import com.kurtsevich.computerstore.dto.HddDto;
import com.kurtsevich.computerstore.service.HddService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products/hdds")
@RequiredArgsConstructor
public class HddController {
    private final HddService hddService;

    @GetMapping("/{id}")
    public HddDto findById(@PathVariable Long id){
        return hddService.findById(id);
    }

    @GetMapping
    public List<HddDto> findAll(@RequestParam(required = false) Integer capacity){
        return  hddService.findAll(capacity);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HddDto create(@RequestBody HddDto hddDto){
        return hddService.create(hddDto);
    }

    @PutMapping
    public HddDto update(@RequestBody HddDto hddDto){
        return hddService.update(hddDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        hddService.delete(id);
    }
}
