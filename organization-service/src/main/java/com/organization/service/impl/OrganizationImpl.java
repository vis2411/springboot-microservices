package com.organization.service.impl;

import com.organization.dto.OrganizationDto;
import com.organization.entity.Organization;
import com.organization.mapper.OrganizationMapper;
import com.organization.repository.OrganizationRepository;
import com.organization.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public OrganizationImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }


    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);
        OrganizationDto savedOrganizationDto = OrganizationMapper.mapToOrganizationDto(savedOrganization);
        return savedOrganizationDto;
    }

    @Override
    public OrganizationDto getOrganizationByCode(String code) {
        Organization getOrganization = organizationRepository.findByOrganizationCode(code);
        return OrganizationMapper.mapToOrganizationDto(getOrganization);
    }
}
