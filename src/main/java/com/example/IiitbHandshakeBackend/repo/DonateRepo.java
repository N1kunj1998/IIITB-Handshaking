package com.example.IiitbHandshakeBackend.repo;

import com.example.IiitbHandshakeBackend.entity.Donate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonateRepo extends JpaRepository<Donate, Integer> {
}
