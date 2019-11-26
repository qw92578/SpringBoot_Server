package free.fgq.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import free.fgq.demo.common.BaseCommonResult;
import free.fgq.demo.dao.UserDao;
import free.fgq.demo.dto.UserDTO;
import free.fgq.demo.pojo.User;
import free.fgq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package: free.fgq.demo.service.impl
 * @ClassName: IndexServiceImpl
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/25 16:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public static void main(String[] args) {
        int i =2;
        int j = i++ *30;
        System.err.println(j);


        int a = 2;
        int b = ++a *30;
        System.err.println(b);


    }

    /**
     * 获取用户名
     * @return
     */
    @Override
    public BaseCommonResult getUserName(Integer id) {
        BaseCommonResult baseCommonResult = new BaseCommonResult();
        try {
            User user = userDao.selectByPrimaryKey(Long.valueOf(id));
            UserDTO userDTO =  JSON.parseObject(JSONObject.toJSONString(user),UserDTO.class);
            baseCommonResult.setResObject(userDTO);
            baseCommonResult.success("查询用户名成功");
        } catch (Exception e) {
        }
        return baseCommonResult;
    }
}
