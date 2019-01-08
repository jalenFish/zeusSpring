package net.cnki.dmsMapper;

import net.cnki.bean.Menu;
import net.cnki.dto.MenuUpdateForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lizhizhong on 2018/11/28.
 */
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByUserId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);

    List<Menu> getMemusInfoByRid(Long rid);

    int updateMenuByMid(MenuUpdateForm menu);

    Menu getMenuByMid(Long id);
}
