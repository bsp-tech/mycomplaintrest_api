package com.bsptech.mycomplaintrest_api.eventhandlers;

import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;

import java.lang.reflect.Method;
import java.util.Date;

public abstract class AbstractCommonRepositoryEventListener<T> extends AbstractRepositoryEventListener<T> {

    @Override
    public void onBeforeCreate(T entity) {
        try {
            setInsertDate(entity, new Date());
//            setInsertUserId(entity);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void onBeforeSave(T entity) {
        try {
            setLastChangeDate(entity, new Date());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setInsertDate(T entity, Date date) throws Exception {
        Class<?> c = entity.getClass();
        Method method = c.getDeclaredMethod("setInsertDate", Date.class);
        method.invoke(entity, date);
    }

    private void setLastChangeDate(T entity, Date date) throws Exception {
        Class<?> c = entity.getClass();
        Method method = c.getDeclaredMethod("setLastChangeDate", Date.class);
        method.invoke(entity, date);
    }
}
