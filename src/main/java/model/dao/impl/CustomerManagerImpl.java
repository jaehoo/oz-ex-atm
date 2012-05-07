package model.dao.impl;

import model.dao.CustomerManager;
import model.persistence.Cliente;
import org.hibernate.SessionFactory;


/**
 * Date: 7/05/12
 * Time: 01:19 PM
 *
 * @author <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez</a>
 * @web www.orbitalzero.com , www.orbitalzero.org
 */
public class CustomerManagerImpl implements CustomerManager{

    private SessionFactory sf;

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void addCustomer(String name) {

        Cliente cliente= new Cliente();
        cliente.setNombre(name);

        sf.getCurrentSession().persist(cliente);

    }


//     Session sesion= sf.getCurrentSession();
//
//        Transaction tx=sesion.beginTransaction();
//
//        try{
//            Cliente cliente= new Cliente();
//            cliente.setNombre(name);
//
//            sesion.persist(cliente);
//            sesion.flush();
//            tx.commit();
//
//        }
//        catch (Exception e){
//            tx.rollback();
//        }
//
//
//        sf.getCurrentSession().close();

}
