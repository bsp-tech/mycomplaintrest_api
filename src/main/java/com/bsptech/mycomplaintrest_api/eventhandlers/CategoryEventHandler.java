package com.bsptech.mycomplaintrest_api.eventhandlers;

import com.bsptech.mycomplaintrest_api.entities.Category;
import com.bsptech.mycomplaintrest_api.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryEventHandler extends AbstractCommonRepositoryEventListener<Category> {

    @Autowired
    ComplaintRepository complaintRepository;

    @Override
    public void onBeforeCreate(Category category) {
        try{
            setComplaintId(category);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void setComplaintId(Category category) {
        category.getComplaints().add(complaintRepository.findById(1).get());
    }
}
