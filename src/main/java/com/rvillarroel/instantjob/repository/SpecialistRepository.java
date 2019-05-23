package com.rvillarroel.instantjob.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;

import com.rvillarroel.instantjob.model.Specialist;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;

@Transactional(SUPPORTS)
public class SpecialistRepository{
  
	
    // ======================================
    // =          Injection Points          =
    // ======================================
  @PersistenceContext(unitName = "instantJobPU")
  private EntityManager em;

  
  public Specialist find(@NotNull Long id){
      return em.find(Specialist.class, id);
  }
  
  
  @Transactional(REQUIRED)
  public Specialist create(Specialist specialist) {
	  
	  em.persist(specialist);	  
	  return specialist;
  }
  
  @Transactional(REQUIRED)
  public void delete(@NotNull Long id) {
      em.remove(em.getReference(Specialist.class, id));
  }
  
  public List<Specialist> findAll() {
      TypedQuery<Specialist> query = em.createQuery("SELECT b FROM specialist b ORDER BY b.id DESC", Specialist.class);
      return query.getResultList();
  }
  
}
