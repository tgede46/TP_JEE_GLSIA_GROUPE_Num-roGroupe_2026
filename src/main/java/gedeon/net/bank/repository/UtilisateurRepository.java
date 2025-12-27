package gedeon.net.bank.repository;

import gedeon.net.bank.entite.Utilisateur;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {

    Optional <Utilisateur> findByEmail(String email);
}
