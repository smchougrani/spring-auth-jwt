package com.digipartnerz.auth.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digipartnerz.auth.entity.Contact;



@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
	
	
}
