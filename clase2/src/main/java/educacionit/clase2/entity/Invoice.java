package educacionit.clase2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "INVOICE")

//@Data sustituiría todos los @ puestos arriba
public class Invoice  {
    //hago una BD en la cual vamos a poner todas las facturas
    //entonces cuando cree varios objetos factur a, todos van a poder ingresar a este campo y todos van a tener el mismo valor por ser estatico

    //    public static List<Invoice> detailsDB = new ArrayList<>();
    //esto si es de cada factura en especifico y cada una tiene sus detalles propios
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "invoice", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InvoiceDetail> details;

}
