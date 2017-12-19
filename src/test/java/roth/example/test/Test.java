package roth.example.test;

import static roth.example.test.TrustUtil.delimiterFor;
import static roth.example.test.TrustUtil.getBy;
import roth.example.service.test.GetInvoiceRequest;
import roth.example.service.test.GetPersonRequest;

public class Test {
	protected static TestClient client = new TestClient();

	static {
		TrustUtil.setup();
	}

	public static void main(String[] args) throws Exception {

		// getPerson();
		
		invoiceServiceCalls();
		
	}

	public static void getPerson() {
		client.getPerson(new GetPersonRequest().setId(1));
	}

	// Invoice service calls
	public static void getInvoiceById() {
		client.getInvoiceById(new GetInvoiceRequest().setId(2));
	}

	public static void getInvoiceByNumber() {
		client.getInvoiceByNumber(new GetInvoiceRequest().setInvoiceNumber("97634"));
	}

	public static void getAllInvoicesByPersonId() {
		client.getAllInvoicesByPersonId(new GetInvoiceRequest().setId(3));
	}

	public static void getAllInvoicesWithTotalAmountPaidGreaterThan() {
		client.getAllInvoicesWithTotalAmountPaidGreaterThan(new GetInvoiceRequest().setTotalAmount(250.0));
	}

	public static void invoiceServiceCalls() {
		delimiterFor("Invoice");
		getBy("ID");
		getInvoiceById();
		getBy("NUMBER");
		getInvoiceByNumber();
		// getBy("PERSON ID");
		// getAllInvoicesByPersonId();
		// getBy("TOTAL AMOUNT GREATER THAN")
		// getAllInvoicesWithTotalAmountPaidGreaterThan();
	}
}