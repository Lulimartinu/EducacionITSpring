package educacionit.clase2.service.impl;

import educacionit.clase2.entity.Invoice;
import educacionit.clase2.repository.InvoiceRepository;
import educacionit.clase2.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("implementacionMejorada")
public class InvoiceService2 implements IInvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public List<Invoice> invoices() {
        return   invoiceRepository.findAll();

    }

    @Override
    public void deleteById(Long id) {
        invoiceRepository.deleteById(id);
    }

    //hacer un Optional es lo mismo que poner orElse(null)
    @Override
    public Invoice findById(Long id) {
        return invoiceRepository.findById(id).orElse(null);
    }
}