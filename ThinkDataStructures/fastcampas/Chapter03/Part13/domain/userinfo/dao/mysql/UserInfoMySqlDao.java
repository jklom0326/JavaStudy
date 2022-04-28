package Chapter03.Part13.domain.userinfo.dao.mysql;

import Chapter03.Part13.domain.userinfo.UserInfo;
import Chapter03.Part13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB UserID = "+ userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MySQL DB UserID = "+ userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MySQL DB UserID = "+ userInfo.getUserId());
    }
}
