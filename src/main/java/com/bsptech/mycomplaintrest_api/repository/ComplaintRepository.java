package com.bsptech.mycomplaintrest_api.repository;


import com.bsptech.mycomplaintrest_api.entities.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = Complaint.class)
public interface ComplaintRepository extends JpaRepository<Complaint,Integer> {


}
