package th.ac.ku.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.menu.model.Menu;

import java.util.List;
import java.util.UUID;

// @Entity -> spring creates an object
// @Repository -> spring creates a link with database
@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
    // JpaRepository<type-of-data , type-of-primary-key>

    // automatically includes:
    // findAll()
    // findById(int id)
    // save(Menu menu)
    // deleteById(int id)

    Menu findByName(String name);
    List<Menu> findByCategory(String category);
}
