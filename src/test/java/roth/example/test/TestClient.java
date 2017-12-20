package roth.example.test;

import java.util.LinkedList;

import roth.example.service.test.GetCreditCardRequest;
import roth.example.service.test.GetCreditCardResponse;
import roth.example.service.test.GetDrivingLicenseRequest;
import roth.example.service.test.GetDrivingLicenseResponse;
import roth.example.service.test.GetInvoiceRequest;
import roth.example.service.test.GetInvoiceResponse;
import roth.example.service.test.GetPersonRequest;
import roth.example.service.test.GetPersonResponse;
import roth.example.service.test.PostInvoiceRequest;
import roth.example.service.test.PostInvoiceResponse;
import roth.lib.java.api.JsonApiClient;
import roth.lib.java.http.HttpUrl;

public class TestClient extends JsonApiClient<Object, Object> {

	public TestClient() {
		super(true);
	}

	@Override
	protected HttpUrl url() {
		return new HttpUrl("https://localhost:8443/endpoint/service/test/");
	}

	public GetPersonResponse getPerson(GetPersonRequest request) {
		return post(url().addPath("getPerson"), request, GetPersonResponse.class);
	}

	// Invoices
	public GetInvoiceResponse getInvoiceById(GetInvoiceRequest request) {
		return post(url().addPath("getInvoiceById"), request, GetInvoiceResponse.class);
	}

	public GetInvoiceResponse getInvoiceByNumber(GetInvoiceRequest request) {
		return post(url().addPath("getInvoiceByNumber"), request, GetInvoiceResponse.class);
	}

	public LinkedList<GetInvoiceResponse> getAllInvoicesByPersonId(GetInvoiceRequest request) {
		return post(url().addPath("getAllInvoicesByPersonId"), request, LinkedList.class);
	}

	public LinkedList<GetInvoiceResponse> getAllInvoicesWithTotalAmountPaidGreaterThan(GetInvoiceRequest request) {
		return post(url().addPath("getAllInvoicesWithTotalAmountPaidGreaterThan"), request, LinkedList.class);
	}

	// Credit Cards
	public GetCreditCardResponse getCreditCardById(GetCreditCardRequest request) {
		return post(url().addPath("getCreditCardById"), request, GetCreditCardResponse.class);
	}

	public GetCreditCardResponse getCreditCardByNumber(GetCreditCardRequest request) {
		return post(url().addPath("getCreditCardByNumber"), request, GetCreditCardResponse.class);
	}

	public LinkedList<GetCreditCardResponse> getAllCreditCardWithExpirationDateGreaterThanOrEquals(
			GetCreditCardRequest request) {
		return post(url().addPath("getAllCreditCardWithExpirationDateGreaterThanOrEquals"), request, LinkedList.class);
	}

	// Driving License
	public GetDrivingLicenseResponse getDrivingLicenseById(GetDrivingLicenseRequest request) {
		return post(url().addPath("getDrivingLicenseById"), request, GetDrivingLicenseResponse.class);
	}

	public GetDrivingLicenseResponse getDrivingLicenseByNumber(GetDrivingLicenseRequest request) {
		return post(url().addPath("getDrivingLicenseByNumber"), request, GetDrivingLicenseResponse.class);
	}
	
	// Insert data into models
	public PostInvoiceResponse postInvoice(PostInvoiceRequest request) {
		return post(url().addPath("postInvoice"), request, PostInvoiceResponse.class);
	}

}
