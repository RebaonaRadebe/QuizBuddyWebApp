/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entity.Learner;

/**
 *
 * @author Rebaona
 */
@Stateless
public class LearnerFacade extends AbstractFacade<Learner> implements LearnerFacadeLocal {

    @PersistenceContext(unitName = "QuizBuddyWebApp2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LearnerFacade() {
        super(Learner.class);
    }

    @Override
    public List<Learner> LearnersWhoPassed() {
       
        String queryStr = "SELECT l FROM Learner l WHERE l.mark > 49 "; 
        Query query = em.createQuery(queryStr);
        List<Learner> learners = query.getResultList();
        
        return learners;
    }
    
    @Override
    public Learner viewTopLearner() {
       
        String queryStr = "SELECT l FROM Learner l ORDER BY l.mark DESC";
        Query query = em.createQuery(queryStr);
        query.setMaxResults(1);
        Learner learner = (Learner) query.getSingleResult();
        
        return learner;
    }
    
}
