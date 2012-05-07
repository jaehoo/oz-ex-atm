package model.persistence;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Date: 7/05/12
 * Time: 12:07 PM
 *
 * @author <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez</a>
 * @web www.orbitalzero.com , www.orbitalzero.org
 */
@Entity
@Table(name = "Cuenta")
public class Cuenta {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id_cuenta", nullable = false)
    private Integer id;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @Column(name = "id_cliente",nullable = false)
    private Integer idCliente;

    @ManyToOne
    @JoinColumn(name = "id_cliente"
            , nullable = false
            , insertable = false
            , updatable = false)
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
