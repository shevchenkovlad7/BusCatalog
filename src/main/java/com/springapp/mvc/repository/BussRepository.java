package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Buss;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by vlad on 13.02.16.
 */
@Repository
@Transactional
public class BussRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public void addContact(Buss buss) {
        this.sessionFactory.getCurrentSession().save(buss);
    }

    public List<Buss> listAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from Buss ").list();
    }

    public void removeBuss(Integer iD) {
        Buss contact = (Buss) this.sessionFactory.getCurrentSession().load(Buss.class, iD);
        if (null != contact) {
            this.sessionFactory.getCurrentSession().delete(contact);
        }
    }
}