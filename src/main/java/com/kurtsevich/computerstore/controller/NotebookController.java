package com.kurtsevich.computerstore.controller;

import com.kurtsevich.computerstore.dto.NotebookDto;
import com.kurtsevich.computerstore.service.NotebookService;
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
@RequestMapping("/api/products/notebooks")
@RequiredArgsConstructor
public class NotebookController {
    private final NotebookService notebookService;

    @GetMapping("/{id}")
    public NotebookDto findById(@PathVariable Long id){
        return notebookService.findById(id);
    }

    @GetMapping
    public List<NotebookDto> findAll(@RequestParam(required = false) Integer screenSize){
        return  notebookService.findAll(screenSize);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public NotebookDto create(@RequestBody @Valid NotebookDto notebookDto){
        return notebookService.create(notebookDto);
    }

    @PutMapping
    public NotebookDto update(@RequestBody @Valid NotebookDto notebookDto){
        return notebookService.update(notebookDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        notebookService.delete(id);
    }
}
