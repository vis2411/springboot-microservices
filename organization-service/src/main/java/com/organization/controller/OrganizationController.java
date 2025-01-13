package com.organization.controller;

import com.organization.dto.OrganizationDto;
import com.organization.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto dto = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }


    @GetMapping("{organization-code}")
    public  ResponseEntity<OrganizationDto> getByCode(@PathVariable("organization-code") String organizationCode){
        OrganizationDto dto  = organizationService.getOrganizationByCode(organizationCode);
        return ResponseEntity.ok().body(dto);
    }


}

