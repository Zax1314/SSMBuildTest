import com.zy.ssm.dao.UserDao;
import com.zy.ssm.entity.User;

public class test {
    static UserDao userDao;
    public static void main(String []args){
        User user= userDao.selectByName("123");
        System.out.println(user.getUid());
    }
}
