package fallback;

import api.CarClientService;
import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import feign.hystrix.FallbackFactory;

public class CarClientServiceFallbackFactory implements FallbackFactory<CarClientService> {
    @Override
    public CarClientService create(Throwable throwable) {
            return  new CarClientService() {
                @Override
                public Result getCarList() {
                    return ResultUtil.error(-1,"调用接口失败");
                }
            };
    }
}
