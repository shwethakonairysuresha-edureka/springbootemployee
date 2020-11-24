package com.tcs.springbootemployee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springbootemployee.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

	Optional<Organization> findByName(String name);
}
