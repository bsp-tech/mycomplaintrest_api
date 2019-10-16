package com.bsptech.mycomplaintrest_api.eventhandlers;

import com.bsptech.mycomplaintrest_api.entities.Complaint;
import com.bsptech.mycomplaintrest_api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplaintEventHandler extends AbstractCommonRepositoryEventListener<Complaint> {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void onBeforeCreate(Complaint complaint) {
        try{
            setCategoryId(complaint);
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    private void setCategoryId(Complaint complaint) {
        complaint.getCategories().add(categoryRepository.findById(1).get());
    }
}
