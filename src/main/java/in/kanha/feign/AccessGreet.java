package in.kanha.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API")
public interface AccessGreet {
	
	@GetMapping("/greet")
	public String getfeign();

}
