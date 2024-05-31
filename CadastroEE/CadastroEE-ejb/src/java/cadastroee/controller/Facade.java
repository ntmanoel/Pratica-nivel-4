package cadastroee.controller;

import cadastroee.model.Produto;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author nt_ma
 */
@Stateless
public class Facade implements FacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU") 
    private EntityManager em;

    @Override
    public List<Produto> findAll() {
        return em.createNamedQuery("Produto.findAll", Produto.class).getResultList();
    }
}
