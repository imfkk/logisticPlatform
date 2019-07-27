package api;

import com.kunluntop.common.response.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "carsystem")
public interface CarClientService {

@RequestMapping(value = "/cars/ListCars" ,method = RequestMethod.POST)
Result getCarList();

}
