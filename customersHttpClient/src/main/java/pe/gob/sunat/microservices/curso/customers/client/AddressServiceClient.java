package pe.gob.sunat.microservices.curso.customers.client;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 
 * @author csanchez
 *
 */
public interface AddressServiceClient {
  
  @GET("v1/addresses/_customer/{id}")
  Call<Customer> getAddresses(@Path("id") Long id);
  
}


