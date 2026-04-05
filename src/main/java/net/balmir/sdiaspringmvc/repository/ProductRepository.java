package net.balmir.sdiaspringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

    public interface ProductRepository extends JpaRepository<net.balmir.sdiaspringmvc.entities.Product, Long> {
    }


