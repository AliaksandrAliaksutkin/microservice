package org.lazmentor.toacceptmessage.repository;

import org.lazmentor.toacceptmessage.model.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, Long> {
}
