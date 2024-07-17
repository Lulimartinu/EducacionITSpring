package educacionit.clase2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "INVOICE_DETAIL")
public class InvoiceDetail implements Serializable {

    private static final long serialVersionUID=1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    private Integer quantity;
    //retorna la multiplicacion del precio por la cantidad del producto
    public Double getDetailTotal(){
        return this.product.getPrice() * quantity;
    }
}
