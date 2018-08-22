package pe.gob.sunat.microservices.curso.customers.client;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OrderServiceClient {

	/**
	 * Consultar si Customer tiene Orders por id Customer
	 * @param id
	 * @return
	 */
	@GET("v1/orders/_customer")
	Call<Customer> get(@Query("id") Long id);

}
