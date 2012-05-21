package model.persistence;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 21/05/12
 * Time: 01:38 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "Cuenta_Maetsra")
public class CuentaMaestra implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  Integer Id;


    @Column(name = "monto")
    private Double monto;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
