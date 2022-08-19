package com.BikkadIT.service;


import java.util.List;


import com.BikkadIT.model.Contact;

public interface ContactService {
	
	boolean saveCotact(Contact contact);
	 
	List<Contact> getAllContact();
	
	Contact getContactById(Integer contactId);
	
	boolean deleteContactById(Integer contactId);

}
