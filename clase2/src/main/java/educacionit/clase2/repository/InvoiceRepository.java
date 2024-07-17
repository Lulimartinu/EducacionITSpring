package educacionit.clase2.repository;

import educacionit.clase2.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//JpaRepository<,>, nos permite crear actualizar y borrar datos.
//<,> hay que pasarle unos genéricos, <la entidad/tabla a la que va a acceder , la clave primaria>
//le ponemos una anotacion @Repository para que se sepa que es un BEAN
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

}
