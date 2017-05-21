package cn.flysheep.dao;

import cn.flysheep.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yanglunyi on 2017/5/21.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
