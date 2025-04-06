package com.jeanpablo.agendatelefonica.controller;

import com.jeanpablo.agendatelefonica.Repository.ContactRepository;
import com.jeanpablo.agendatelefonica.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    private ContactRepository contactrepository;

    public ContactController(ContactRepository contactrepository) {
        this.contactrepository = contactrepository;
    }

    @GetMapping

    public List<Contact> ListContacts(){
         return contactrepository.findAll();
    }

    @PostMapping

    public Contact addContact(@RequestBody Contact contact){
        return contactrepository.save(contact);
    }

    @PutMapping("/{Id}")

    public Contact attContact(@PathVariable Long id , @RequestBody Contact contact) {
        contact.setId(id);
        return contactrepository.save(contact);
    }

    @DeleteMapping("/{Id}")

    public Contact deleteContact (@PathVariable Long id){
        contactrepository.deleteById(id);

        return null;
    }
}
