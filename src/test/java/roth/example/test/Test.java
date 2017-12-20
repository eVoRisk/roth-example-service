package roth.example.test;

import static roth.example.test.TrustUtil.delimiterFor;
import static roth.example.test.TrustUtil.getBy;

import java.sql.Date;
import java.time.LocalDate;

import roth.example.service.test.GetCreditCardRequest;
import roth.example.service.test.GetDrivingLicenseRequest;
import roth.example.service.test.GetInvoiceRequest;
import roth.example.service.test.GetPersonRequest;
import roth.example.service.test.PostInvoiceRequest;

public class Test {
	protected static TestClient client = new TestClient();

	static {
		TrustUtil.setup();
	}

	public static void main(String[] args) throws Exception {

		getPerson();

		invoiceServiceCalls();

		creditCardServiceCalls();

		drivingLicenseServiceCalls();

		postInvoice();

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
		client.getAllInvoicesByPersonId(new GetInvoiceRequest().setPersonId(3));
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
		getBy("PERSON ID");
		getAllInvoicesByPersonId();
		getBy("TOTAL AMOUNT GREATER THAN");
		getAllInvoicesWithTotalAmountPaidGreaterThan();
	}

	// Credit Card service calls
	public static void getCreditCardById() {
		client.getCreditCardById(new GetCreditCardRequest().setId(4));
	}

	public static void getCreditCardByNumber() {
		client.getCreditCardByNumber(new GetCreditCardRequest().setCardNumber("9480 0012 7722 9223"));
	}

	public static void getAllCreditCardWithExpirationDateGreaterThanOrEquals() {
		LocalDate date = LocalDate.of(2020, 10, 10);
		client.getAllCreditCardWithExpirationDateGreaterThanOrEquals(
				new GetCreditCardRequest().setExpirationDate(Date.valueOf(date)));
	}

	public static void creditCardServiceCalls() {
		delimiterFor("Credit Card");
		getBy("ID");
		getCreditCardById();
		getBy("NUMBER");
		getCreditCardByNumber();
		getBy("EXPIRATION DATE GREATER THAN OR EQUALS");
		getAllCreditCardWithExpirationDateGreaterThanOrEquals();
	}

	// Driving License service calls
	public static void getDrivingLicenseById() {
		client.getDrivingLicenseById(new GetDrivingLicenseRequest().setId(6));
	}

	public static void getDrivingLicenseByNumber() {
		client.getDrivingLicenseByNumber(new GetDrivingLicenseRequest().setLicenseNumber("8122452"));
	}

	public static void drivingLicenseServiceCalls() {
		delimiterFor("Driving License");
		getBy("ID");
		getDrivingLicenseById();
		getBy("NUMBER");
		getDrivingLicenseByNumber();
	}

	// Insert data into models
	public static void postInvoice() {
		PostInvoiceRequest request = new PostInvoiceRequest();

		request.setInvoiceNumber("31501");
		request.setTotalAmount(100.0);
		request.setPaid(true);
		request.setPersonId(1);

		delimiterFor("Insert");

		client.postInvoice(request);

	}
}