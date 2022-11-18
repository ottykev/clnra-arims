package com.arims.service;


import com.arims.exception.UserNotFoundException;
import com.arims.model.Activity;
import com.arims.model.Admin;
import com.arims.repository.ActivityRepository;
import com.arims.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;


    public Activity add(Activity activity) {
        return activityRepository.save(activity);
    }

    public void deleteActivity(Long id) {
        this.activityRepository.deleteActivityById(id);
    }

    public List<Activity> findAllActivity() {
        return this.activityRepository.findAll();
    }

    public Activity updateActivity(Activity activity) {
        return (Activity) this.activityRepository.save(activity);
    }

    public Activity findActivityById(Long id) {
        return (Activity)this.activityRepository.findActivityById(id).orElseThrow(() -> {
            return new UserNotFoundException("Activity unit  by id " + id + " was not found");
        });
    }

}
