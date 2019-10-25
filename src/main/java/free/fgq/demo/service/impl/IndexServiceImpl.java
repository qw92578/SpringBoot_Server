package free.fgq.demo.service.impl;

import free.fgq.demo.common.BaseCommonResult;
import free.fgq.demo.service.IndexService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Package: free.fgq.demo.service.impl
 * @ClassName: IndexServiceImpl
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/25 16:14
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public BaseCommonResult test() {
        BaseCommonResult baseCommonResult = new BaseCommonResult();
        Map<String,Object> map = new HashMap<>();

        baseCommonResult.success("测试成功");
        return baseCommonResult;
    }
}
