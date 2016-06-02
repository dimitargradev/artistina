package bg.artistina.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import bg.artistina.model.User;

public interface UserRepository extends JpaRepository<User, Serializable> {
}
