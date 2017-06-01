package merService.merServiceImp;

import merDao.UserDao;
import merModel.UserModel;
import merService.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author: jhc
 * @create: 2017/6/1
 * @version: 1.0
 */
@Service("UserService")
public class UserServiceImp implements UserService{

    private final Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

    @Resource
    private UserDao userDao;

    /*@Resource(name = "userDao")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void add(UserModel userModel) {
        userDao.save(userModel);
    }
}
