package com.example.java10xplenochallenge.repository;

import com.example.java10xplenochallenge.entity.Relogio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface RelogioRepository extends JpaRepository<Relogio, UUID>, JpaSpecificationExecutor<Relogio> {

}
