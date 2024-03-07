package br.dev.danielabarreto.userdept.repository;

import br.dev.danielabarreto.userdept.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
