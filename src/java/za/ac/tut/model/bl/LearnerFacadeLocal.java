/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.entity.Learner;

/**
 *
 * @author Rebaona
 */
@Local
public interface LearnerFacadeLocal {

    void create(Learner learner);

    void edit(Learner learner);

    void remove(Learner learner);

    Learner find(Object id);

    List<Learner> findAll();

    List<Learner> findRange(int[] range);

    int count();
    
    List<Learner> LearnersWhoPassed();
    
    Learner viewTopLearner();
    
}
