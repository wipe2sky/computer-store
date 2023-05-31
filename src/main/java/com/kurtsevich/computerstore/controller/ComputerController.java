package com.kurtsevich.computerstore.controller;

import com.kurtsevich.computerstore.dto.ComputerDto;
import com.kurtsevich.computerstore.entity.enums.ComputerType;
import com.kurtsevich.computerstore.service.ComputerService;
import jakarta.validation.Valid;
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
@RequestMapping("/api/products/computers")
@RequiredArgsConstructor
public class ComputerController {
    private final ComputerService computerService;

    @GetMapping("/{id}")
    public ComputerDto findBySerialNumber(@PathVariable Long id){
        return computerService.findById(id);
    }

    @GetMapping
    public List<ComputerDto> findAll(@RequestParam(required = false) ComputerType type){
        return  computerService.findAll(type);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ComputerDto create(@RequestBody @Valid ComputerDto computerDto){
        return computerService.create(computerDto);
    }

    @PutMapping
    public ComputerDto update(@RequestBody @Valid ComputerDto computerDto){
        return computerService.update(computerDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        computerService.delete(id);
    }
}
