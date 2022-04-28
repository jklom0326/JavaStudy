package Chapter03.Part13.domain.userinfo.dao.oracle;

import Chapter03.Part13.domain.userinfo.UserInfo;
import Chapter03.Part13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB UserID = "+ userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB UserID = "+ userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB UserID = "+ userInfo.getUserId());
    }
}
