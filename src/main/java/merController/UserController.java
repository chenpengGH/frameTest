package merController;

import merCommand.UserCommand;
import merModel.UserModel;
import merService.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author: jhc
 * @create: 2017/6/1
 * @version: 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 新增用户
     *
     * @author：tuzongxun
     * @Title: addUser
     * @param @param userCommand
     * @return void
     * @date Apr 14, 2016 11:28:47 AM
     * @throws
     */
    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody UserCommand userCommand) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userCommand, userModel);
        userService.add(userModel);
    }
}
