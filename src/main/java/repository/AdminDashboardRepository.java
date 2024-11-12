package repository;

import com.gestion_recrutement.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDashboardRepository extends JpaRepository<Utilisateur, Long> {
    // Cette interface hérite des méthodes CRUD par défaut de JpaRepository
}
