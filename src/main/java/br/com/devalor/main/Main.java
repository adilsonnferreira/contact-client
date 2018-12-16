package br.com.devalor.main;

import java.util.List;

import br.com.devalor.contacts.bean.Contact;
import br.com.devalor.contactsclient.ContactsClient;

public class Main {

	public static void main(String[] args) {

		ContactsClient client = new ContactsClient("http://localhost:8080/contacts/");
		Contact contactNew = new Contact();
		contactNew.setId(1);
		
		client.delete(contactNew);
		
		List<Contact> contacts = client.findAll();
		for (Contact contact : contacts) {
			System.out.println(contact.getName());
		}

	}
}