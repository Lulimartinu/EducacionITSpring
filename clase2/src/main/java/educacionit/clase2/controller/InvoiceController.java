package educacionit.clase2.controller;

import educacionit.clase2.entity.Invoice;
import educacionit.clase2.entity.Product;
import educacionit.clase2.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//la diferencia de rest controller y controller es que rescontroller no me pide de un front y controller si.
@Controller
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired //sirve para inyectar un bean.
    @Qualifier(value= "implementacionMejorada")
    private IInvoiceService service;

 /*   @GetMapping("/getAll")
    public List<Invoice> getAllInvoices()
    {
     //   llenarFactura();
      //  return service.invoices().toString();
        return service.invoices();
    }
*/
    @GetMapping("/getAll1")
    public String getAllInvoiceModel(Model model){
       // model.addAttribute("message","Bienvenido a la página de Luisina ");
        return "index";
    }

    @GetMapping("/getOne")
    public String findById(Model model,Long id)
    {
         service.findById(id);
         return "index";
    }

    @DeleteMapping("/deleteOne")
    public String deleteById(Model model, Long id)
    {
        service.deleteById(id);
                return "index";
    }


    //creo tipo BD
    //creo los productos y los agrego a la lista
   /*      private void llenarFactura(){
   Invoice newFactura = new Invoice();
        Invoice newFactura2= new Invoice();

        Product newProducto = new Product(1L,"producto1",100.0);
        Product newProducto2 = new Product(2L,"producto2",200.0);
        Product newProducto3 = new Product(3L,"producto3",300.0);

        Product newProducto4 = new Product(14L,"producto14",100.0);
        Product newProducto5 = new Product(25L,"producto25",200.0);

        List<Product> details = new ArrayList<>();
        List<Product> details2 = new ArrayList<>();
        details.add(newProducto);
        details.add(newProducto2);
        details.add(newProducto3);
        details2.add(newProducto4);
        details2.add(newProducto5);

        //creo la factura y le seteo los detalles
        newFactura.setDetails(details);
        newFactura2.setDetails(details2);



    }


*/


}
