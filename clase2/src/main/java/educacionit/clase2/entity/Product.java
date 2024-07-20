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
@Table(name = "PRODUCT")
public class Product implements Serializable {
    private static final long serialVersionUTD = 1L;
    //es serializable lo que significa que puedes tomar una instancia de PRODUCT, convertirla en una serie de bytes, y luego guardarla en un archivo, enviarla a través de la red, o almacenarla en una base de datos.
    //
    //Hacer que las clases sean serializables hace que tu aplicación sea más flexible y compatible con diferentes formas de guardar y mover datos.
    /*En Java, Serializable es una etiqueta que se le pone a una clase para decirle al sistema que esa clase puede ser transformada en una serie de bytes. Estos bytes pueden ser guardados en un archivo, enviados a través de internet, o almacenados en una base de datos. Es como si tuvieras una receta que puede ser empaquetada y transportada a donde sea.*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String image;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;

}
