package free.fgq.demo.service.impl;

import free.fgq.demo.common.BaseCommonResult;
import free.fgq.demo.service.IndexService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Package: free.fgq.demo.service.impl
 * @ClassName: IndexServiceImpl
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/25 16:14
 */
@Service
public class IndexServiceImpl implements IndexService {
    /**
     * 源码
     * @return
     */
    @Override
    public BaseCommonResult test() {
        BaseCommonResult baseCommonResult = new BaseCommonResult();
        try {
            Map<String,Object> map = new HashMap<>();
            Integer i = 10;
            String str1 = "aaa";
            String str2 = new String("aaa");
            ConcurrentHashMap syMap = new ConcurrentHashMap();
            Thread thread = new Thread();
            thread.suspend();
            baseCommonResult.success("测试成功");
        } catch (Exception e) {
        }
        return baseCommonResult;
    }


    public static void main(String[] args) {
        int i =2;
        int j = i++ *30;
        System.err.println(j);


        int a = 2;
        int b = ++a *30;
        System.err.println(b);


    }
}
