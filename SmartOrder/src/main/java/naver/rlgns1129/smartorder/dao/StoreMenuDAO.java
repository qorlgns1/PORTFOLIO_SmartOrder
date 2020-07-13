package naver.rlgns1129.smartorder.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import naver.rlgns1129.smartorder.domain.StoreMenu;

@Repository
public class StoreMenuDAO {
	@Autowired
	// MyBatis를 xml로 이용할 때 사용하는 클래스
	private SqlSession sqlSession;

	// StoreMember 테이블의 전체 데이터를 가져오는 메소드
	public List<StoreMenu> getMainMenu(String menuSection) {
		return sqlSession.selectList("storemenu.getmainmenu", menuSection);

	}
}