package com.forohub.forohub.model.repository;


import com.forohub.forohub.model.topico.Topico;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}