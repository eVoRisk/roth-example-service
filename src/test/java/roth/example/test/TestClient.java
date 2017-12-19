package roth.example.test;

import java.util.LinkedList;

import roth.example.service.test.GetInvoiceRequest;
import roth.example.service.test.GetInvoiceResponse;
import roth.example.service.test.GetPersonRequest;
import roth.example.service.test.GetPersonResponse;
import roth.lib.java.api.JsonApiClient;
import roth.lib.java.http.HttpUrl;

public class TestClient extends JsonApiClient<Object, Object>
{
	
	public TestClient()
	{
		super(true);
	}

	@Override
	protected HttpUrl url()
	{
		return new HttpUrl("https://localhost:8443/endpoint/service/test/");
	}
	
	public GetPersonResponse getPerson(GetPersonRequest request)
	{
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
		return post(url().addPath("getAllInvoicesByPersonId"), request, GetInvoiceResponse.class);
	}
	
	public LinkedList<GetInvoiceResponse> getAllInvoicesWithTotalAmountPaidGreaterThan(GetInvoiceRequest request) {
		return post(url().addPath("getAllInvoicesWithTotalAmountPaidGreaterThan"), request, GetInvoiceResponse.class);
	}
	
	
}
