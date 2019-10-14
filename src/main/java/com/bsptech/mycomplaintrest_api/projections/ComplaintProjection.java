package com.bsptech.mycomplaintrest_api.projections;

import com.bsptech.mycomplaintrest_api.entities.Complaint;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = {Complaint.class})
public interface ComplaintProjection {

    String getTitle();
    String getContent();
    Integer getLikeCount();
    Integer getDisslikeCount();
    Date getPublishDate();

}
