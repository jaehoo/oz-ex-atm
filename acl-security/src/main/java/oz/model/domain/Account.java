package oz.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 30/05/12
 * Time: 01:49 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Account  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "balance")
    private Double balance;

}
