package educacionit.clase2.service;

import educacionit.clase2.entity.Invoice;

import java.util.List;

public interface IInvoiceService {
    List<Invoice> invoices();

    void deleteById(Long id);

    Invoice findById(Long id);
}
