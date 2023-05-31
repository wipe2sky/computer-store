package com.kurtsevich.computerstore.controller;

import com.kurtsevich.computerstore.dto.MonitorDto;
import com.kurtsevich.computerstore.service.MonitorService;
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
@RequestMapping("/api/products/monitors")
@RequiredArgsConstructor
public class MonitorController {
    private final MonitorService monitorService;

    @GetMapping("/{id}")
    public MonitorDto findById(@PathVariable Long id){
        return monitorService.findById(id);
    }

    @GetMapping
    public List<MonitorDto> findAll(@RequestParam(required = false) Integer diagonal){
        return  monitorService.findAll(diagonal);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MonitorDto create(@RequestBody MonitorDto monitorDto){
        return monitorService.create(monitorDto);
    }

    @PutMapping
    public MonitorDto update(@RequestBody MonitorDto monitorDto){
        return monitorService.update(monitorDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        monitorService.delete(id);
    }
}
