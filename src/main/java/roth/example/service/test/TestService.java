package roth.example.service.test;

import java.util.LinkedList;

import roth.example.data.model.Invoice;
import roth.example.data.model.Person;
import roth.example.data.table.InvoiceTable;
import roth.example.data.table.PersonTable;
import roth.lib.java.service.annotation.Service;
import roth.lib.java.service.annotation.ServiceMethod;

@Service(name = "test")
public class TestService extends roth.example.service.Service {

	@ServiceMethod(api = true, ajax = false)
	public GetPersonResponse getPerson(GetPersonRequest request) {
		GetPersonResponse response = new GetPersonResponse();
		Person person = PersonTable.get(db).findById(request.getId());
		if (person != null) {
			response.setId(person.getId());
			response.setFirstName(person.getFirstName());
			response.setLastName(person.getLastName());
			response.setEmail(person.getEmail());
			response.setPhone(person.getPhone());
			response.setActive(person.isActive());
		}
		return response;
	}

	// Service methods for INVOICE
	@ServiceMethod(api = true, ajax = false)
	public GetInvoiceResponse getInvoiceById(GetInvoiceRequest request) {
		GetInvoiceResponse response = new GetInvoiceResponse();
		Invoice invoice = InvoiceTable.get(db).findById(request.getId());

		if (invoice != null) {
			response.setId(invoice.getId()).setInvoiceNumber(invoice.getInvoiceNumber())
					.setTotalAmount(invoice.getTotalAmount()).setPaid(invoice.isPaid())
					.setPersonId(invoice.getPersonId());
		}

		return response;
	}

	@ServiceMethod(api = true, ajax = false)
	public GetInvoiceResponse getInvoiceByNumber(GetInvoiceRequest request) {
		GetInvoiceResponse response = new GetInvoiceResponse();
		Invoice invoice = InvoiceTable.get(db).findByInvoiceNumber(request.getInvoiceNumber());

		if (invoice != null) {
			response.setId(invoice.getId()).setInvoiceNumber(invoice.getInvoiceNumber())
					.setTotalAmount(invoice.getTotalAmount()).setPaid(invoice.isPaid())
					.setPersonId(invoice.getPersonId());
		}

		return response;
	}

	@ServiceMethod(api = true, ajax = false)
	public LinkedList<GetInvoiceResponse> getAllInvoicesByPersonId(GetInvoiceRequest request) {
		LinkedList<Invoice> invoices = InvoiceTable.get(db).findAllByPersonId(request.getPersonId());

		LinkedList<GetInvoiceResponse> responses = new LinkedList<GetInvoiceResponse>();

		if (invoices != null) {
			GetInvoiceResponse response = null;

			for (Invoice invoice : invoices) {
				response = new GetInvoiceResponse();

				response.setId(invoice.getId()).setInvoiceNumber(invoice.getInvoiceNumber())
						.setTotalAmount(invoice.getTotalAmount()).setPaid(invoice.isPaid())
						.setPersonId(invoice.getPersonId());

				responses.add(response);
			}
		}

		return responses;
	}
	
	@ServiceMethod(api = true, ajax = false)
	public LinkedList<GetInvoiceResponse> getAllInvoicesWithTotalAmountPaidGreaterThan(GetInvoiceRequest request) {
		LinkedList<Invoice> invoices = InvoiceTable.get(db).findAllWithTotalAmountPaidGreaterThan(request.getTotalAmount());

		LinkedList<GetInvoiceResponse> responses = new LinkedList<GetInvoiceResponse>();
		
		if (invoices != null) {
			GetInvoiceResponse response = null;

			for (Invoice invoice : invoices) {
				response = new GetInvoiceResponse();

				response.setId(invoice.getId()).setInvoiceNumber(invoice.getInvoiceNumber())
						.setTotalAmount(invoice.getTotalAmount()).setPaid(invoice.isPaid())
						.setPersonId(invoice.getPersonId());

				responses.add(response);
			}
		}

		return responses;
	}

}
