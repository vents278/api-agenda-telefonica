package com.jeanpablo.agendatelefonica.Repository;

import com.jeanpablo.agendatelefonica.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
