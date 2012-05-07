package model.persistence;

import javax.persistence.*;
import java.util.Collection;

/**
 * Date: 7/05/12
 * Time: 12:06 PM
 *
 * @author <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez</a>
 * @web www.orbitalzero.com , www.orbitalzero.org
 */

@Entity
@Table(name = "Cliente")
public class Cliente {


    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id_cliente", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
    private Collection<Cuenta> cuentas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Collection<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
