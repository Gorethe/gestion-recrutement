package Service;

import com.gestion_recrutement.repository.AdminDashboardRepository;
import com.gestion_recrutement.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDashboardService {

    @Autowired
    private AdminDashboardRepository adminDashboardRepository;

    public List<Utilisateur> recupererUtilisateurs() {
        return adminDashboardRepository.findAll();  // Récupère tous les utilisateurs dans la base de données
    }
}
