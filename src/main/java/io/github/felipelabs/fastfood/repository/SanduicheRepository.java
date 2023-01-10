package io.github.felipelabs.fastfood.repository;

import io.github.felipelabs.fastfood.model.Sanduiche;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SanduicheRepository extends JpaRepository<Sanduiche, UUID> {

}
