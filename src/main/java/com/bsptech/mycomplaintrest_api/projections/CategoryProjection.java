package com.bsptech.mycomplaintrest_api.projections;

import com.bsptech.mycomplaintrest_api.entities.Category;
import com.bsptech.mycomplaintrest_api.entities.Complaint;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Category.class})
public interface CategoryProjection {

    String getName();

}
